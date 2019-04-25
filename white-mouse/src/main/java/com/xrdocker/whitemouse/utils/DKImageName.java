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
package com.xrdocker.whitemouse.utils;

import java.util.regex.Pattern;

/**
 * DKImageName
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/4/19
 **/
public class DKImageName {

    public static void main(String[] args) {
        System.out.println(verify("docker.io"));
    }

    public static String verify(String imageName){
        String s="[a-z0-9-_.]";
        Pattern pattern = Pattern.compile(s);
        boolean b=pattern.matcher(imageName).matches();
        return b? "imageName: "+imageName+" 合法":"imageName: "+imageName+" 不合法";
    }
}
