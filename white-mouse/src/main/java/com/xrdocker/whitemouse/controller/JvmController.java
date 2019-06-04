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

import com.xrdocker.whitemouse.controller.support.Result;
import com.xrdocker.whitemouse.controller.support.reqParam.JvmOrderParam;
import com.xrdocker.whitemouse.service.JvmOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * JvmController
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/6/3
 **/
@Controller
@RequestMapping("/jvm/")
public class JvmController {
    @Autowired
    private JvmOrderService service;

    @GetMapping("jvmOrder")
    public String jvmOrder(HttpServletRequest request){
        return "bus/documents/java/jvm/byteOrder";
    }

    @GetMapping("getMnemonics")
    @ResponseBody
    public Result getMnemonics(HttpServletRequest request){
        return Result.createObjResult(service.getMnemonicList());
    }

    @GetMapping("getOrderDetails")
    @ResponseBody
    public Result getOrderDetails(JvmOrderParam param, HttpServletRequest request){
        return Result.createObjResult(service.searchOrder(param));
    }
}
