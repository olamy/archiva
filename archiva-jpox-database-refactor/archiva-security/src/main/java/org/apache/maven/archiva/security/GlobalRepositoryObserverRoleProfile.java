package org.apache.maven.archiva.security;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.codehaus.plexus.rbac.profile.AbstractRoleProfile;

import java.util.ArrayList;
import java.util.List;

/**
 * @plexus.component role="org.codehaus.plexus.rbac.profile.RoleProfile"
 * role-hint="global-repository-observer"
 */
public class GlobalRepositoryObserverRoleProfile
    extends AbstractRoleProfile
{
    /**
     * Create the Role name for a Repository Observer, using the provided repository id.
     *
     * @param repoId the repository id
     */
    public String getRoleName( )
    {
        return ArchivaRoleConstants.GLOBAL_REPOSITORY_OBSERVER_ROLE;
    }  

    public boolean isAssignable()
    {
        return true;
    }

    public List getOperations()
    {      
        List operations = new ArrayList();
        operations.add( ArchivaRoleConstants.OPERATION_REPOSITORY_ACCESS );
        return operations;
    }
}
