package org.bimserver.shared.interfaces;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
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
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.exceptions.ServerException;

public class Bimsie1ServiceInterfaceAdaptor implements org.bimserver.shared.interfaces.bimsie1.Bimsie1ServiceInterface {

	public void addExtendedDataToRevision(java.lang.Long roid, org.bimserver.interfaces.objects.SExtendedData extendedData) throws UserException, ServerException {
	}
	
	public org.bimserver.interfaces.objects.SProject addProject(java.lang.String projectName, java.lang.String schema) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SProject addProjectAsSubProject(java.lang.String projectName, java.lang.Long parentPoid, java.lang.String schema) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long branchToExistingProject(java.lang.Long roid, java.lang.Long destPoid, java.lang.String comment, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long branchToNewProject(java.lang.Long roid, java.lang.String projectName, java.lang.String comment, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkin(java.lang.Long poid, java.lang.String comment, java.lang.Long deserializerOid, java.lang.Long fileSize, java.lang.String fileName, javax.activation.DataHandler data, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkinFromUrl(java.lang.Long poid, java.lang.String comment, java.lang.Long deserializerOid, java.lang.String fileName, java.lang.String url, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkout(java.lang.Long roid, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean deleteProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadByNewJsonQuery(java.util.Set<java.lang.Long> roids, java.lang.String query, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadRevisions(java.util.Set<java.lang.Long> roids, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SExtendedData> getAllExtendedDataOfRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getAllProjects(java.lang.Boolean onlyTopLevel, java.lang.Boolean onlyActive) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProjectSmall> getAllProjectsSmall() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SRevision> getAllRevisionsOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getDeserializerById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getDeserializerByName(java.lang.String deserializerName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDownloadResult getDownloadData(java.lang.Long topicId) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedData getExtendedData(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedDataSchema getExtendedDataSchemaById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedDataSchema getExtendedDataSchemaByNamespace(java.lang.String namespace) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SProject getProjectByPoid(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SProjectSmall getProjectSmallByPoid(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getProjectsByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration getQueryEngineById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration getQueryEngineByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRevision getRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerByContentType(java.lang.String contentType) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerByName(java.lang.String serializerName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getSubProjects(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getSuggestedDeserializerForExtension(java.lang.String extension, java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long initiateCheckin(java.lang.Long poid, java.lang.Long deserializerOid) throws UserException, ServerException {
		return null;
	}
	
	public void terminateLongRunningAction(java.lang.Long topicId) throws UserException, ServerException {
	}
	
	public java.lang.Boolean undeleteProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
}