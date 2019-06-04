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
package com.xrdocker.whitemouse.controller.support;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.xrdocker.whitemouse.common.constants.RspCodeEnums;

/**
 * Result
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/6/4
 **/
public class Result {
    private String        msg;
    private String    rspCode;
    private Object     rspObj;

    public Result() {
    }

    public Result(String resCode,String msg) {
        this.msg = msg;
        this.rspCode = resCode;
    }

    public Result(String resCode) {
        this.rspCode = resCode;
    }

    public Result(String resCode, Object rspObj) {
        this.rspCode = resCode;
        this.rspObj = rspObj;
    }

    public static Result commonSuccess(){
        return new Result(RspCodeEnums.SUCCESS.getCode(),RspCodeEnums.SUCCESS.getDesc());
    }

    public static Result commonError(){
        return new Result(RspCodeEnums.FAILURE.getCode(),RspCodeEnums.FAILURE.getDesc());
    }

    public static Result msgError(String errorMsg){
        return new Result(RspCodeEnums.FAILURE.getCode(),errorMsg);
    }

    public static Result createResult(String resCode,String msg){
        return new Result(resCode,msg);
    }

    public static Result createObjResult(Object rspObj){
        return new Result(RspCodeEnums.SUCCESS.getCode(),rspObj);
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getRspObj() {
        return rspObj;
    }

    public void setRspObj(Object rspObj) {
        this.rspObj = rspObj;
    }
}
