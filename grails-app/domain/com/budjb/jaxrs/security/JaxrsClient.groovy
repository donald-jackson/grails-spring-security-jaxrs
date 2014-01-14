/*
 * Copyright 2014 Bud Byrd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.budjb.jaxrs.security

class JaxrsClient {
    /**
     * Api Key
     */
    String principal

    /**
     * Client name
     */
    String name

    /**
     * Provider the client is authenticated by
     */
    String provider

    /**
     * Whether the key is active
     */
    boolean active = true

    /**
     * Date the key was created
     */
    Date dateCreated

    /**
     * Field constraints.
     */
    static constraints = {
        name unique: true, blankable: false
        principal unique: 'provider', blankable: false
        dateCreated nullable: true
        provider blankable: false
    }
}
