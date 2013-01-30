package org.apache.archiva.redback.rest.api.services;
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.archiva.redback.authorization.RedbackAuthorization;
import org.apache.archiva.redback.integration.security.role.RedbackRoleConstants;
import org.apache.archiva.redback.rest.api.model.LdapGroupMapping;
import org.apache.archiva.redback.rest.api.model.StringList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Olivier Lamy
 * @since 2.1
 */
@Path( "/ldapGroupMappingService/" )
public interface LdapGroupMappingService
{
    @Path( "ldapGroups" )
    @GET
    @Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @RedbackAuthorization( permissions = RedbackRoleConstants.USER_ADMINISTRATOR_ROLE )
    StringList getLdapGroups()
        throws RedbackServiceException;


    @GET
    @Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @RedbackAuthorization( permissions = RedbackRoleConstants.USER_ADMINISTRATOR_ROLE )
    List<LdapGroupMapping> getLdapGroupMappings()
        throws RedbackServiceException;


    @PUT
    @Consumes( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @RedbackAuthorization( permissions = RedbackRoleConstants.USER_ADMINISTRATOR_ROLE )
    Boolean addLdapGroupMapping( LdapGroupMapping ldapGroupMapping )
        throws RedbackServiceException;

    @DELETE
    @Consumes( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @RedbackAuthorization( permissions = RedbackRoleConstants.USER_ADMINISTRATOR_ROLE )
    Boolean removeLdapGroupMapping( String group )
        throws RedbackServiceException;

    @POST
    @Consumes( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML } )
    @RedbackAuthorization( permissions = RedbackRoleConstants.USER_ADMINISTRATOR_ROLE )
    Boolean updateLdapGroupMapping( LdapGroupMapping ldapGroupMapping )
        throws RedbackServiceException;

}
