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
package com.budjb.jaxrs.security;

import org.codehaus.groovy.grails.commons.AbstractInjectableGrailsClass;

public class DefaultGrailsJaxrsAuthenticationProviderClass extends AbstractInjectableGrailsClass implements GrailsJaxrsAuthenticationProviderClass {
    public static final String AUTHENTICATIONPROVIDER = "JaxrsAuthenticationProvider";

    public DefaultGrailsJaxrsAuthenticationProviderClass(@SuppressWarnings("rawtypes") Class clazz) {
        super(clazz, AUTHENTICATIONPROVIDER);
    }

    public DefaultGrailsJaxrsAuthenticationProviderClass(@SuppressWarnings("rawtypes") Class clazz, String trailingName) {
        super(clazz, trailingName);
    }
}
