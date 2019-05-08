/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xrdocker.whitemouse.config;

/**
 * DynamicDataSourceHandler
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/5/8
 **/
public class DynamicDataSourceHandler {

    private static final ThreadLocal<String> dataSources=new ThreadLocal<String>();

    /**
     * Bind dataSource info to current thread
     * @param dataSource target name
     */
    public static void put(String dataSource){
        dataSources.set(dataSource);
    }

    /**
     * Get current dataSource info
     * @return
     */
    public static String get(){
        return dataSources.get();
    }

    /**
     * Clean
     */
    public static void remove(){
        dataSources.remove();
    }
}
