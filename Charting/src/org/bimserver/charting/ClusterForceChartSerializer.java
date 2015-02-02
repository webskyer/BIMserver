package org.bimserver.charting;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.bimserver.charting.Charts.Chart;
import org.bimserver.charting.Charts.ClusterForce;
import org.bimserver.charting.Charts.DepthClusteredTreeview;
import org.bimserver.charting.Charts.Treeview;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEnginePlugin;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.utils.UTF8PrintWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterForceChartSerializer extends EmfSerializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClusterForceChartSerializer.class);

	private Chart chart = null;
	private ArrayList<LinkedHashMap<String, Object>> rawData = null;

	@Override
	public void reset() {
		if (rawData != null)
			rawData.clear();
		setMode(Mode.BODY);
	}

	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, PluginManager pluginManager, RenderEnginePlugin renderEnginePlugin, PackageMetaData packageMetaData, boolean normalizeOids) throws SerializerException {
		super.init(model, projectInfo, pluginManager, renderEnginePlugin, packageMetaData, normalizeOids);
		// Pick chart.
		chart = new ClusterForce();
		chart.setOption("Show Labels", true);
		// Prepare for data.
		rawData = new ArrayList<>();
	}

	@Override
	protected boolean write(OutputStream outputStream) throws SerializerException {
		if (getMode() == Mode.BODY) {
			// Get data.
			rawData = SupportFunctions.getClusterStructureWithAreaFromIFCData(model, chart);
			int count = rawData.size();
			// For every 100 items, increase the overall size by 4500 pixels.
			double diameter = 1000 + (count / 100) * 4500;
			chart.setOption("Diameter", diameter);
			if (diameter > 1000)
				chart.FitToSize = false;
			// Write chart.
			PrintWriter writer = new UTF8PrintWriter(outputStream);
			try {
				writer.print(chart.writeSVG(rawData));
				writer.flush();
			} catch (Exception e) {
				LOGGER.error("", e);
			}
			writer.close();
			setMode(Mode.FINISHED);
			return true;
		} else if (getMode() == Mode.FINISHED)
			return false;
		//
		return false;
	}
}
