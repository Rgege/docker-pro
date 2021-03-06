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
package com.xrdocker.whitemouse.controller;


import com.xrdocker.whitemouse.service.JvmOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * TestController
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/4/18
 **/
@Controller
@RequestMapping("/test/")
public class TestController {

    @Autowired
    JvmOrderService service;

    @GetMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello ~~~~~~~~";
    }


    @GetMapping("test")
    @ResponseBody
    public Map<String,Object> test(){
        Map<String,Object> map=new HashMap<>();
        map.put("obj",service.getAll());
        return map;
    }
}
