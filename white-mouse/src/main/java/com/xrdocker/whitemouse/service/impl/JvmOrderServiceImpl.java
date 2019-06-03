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
package com.xrdocker.whitemouse.service.impl;

import com.xrdocker.whitemouse.persistent.JvmOederMapper;
import com.xrdocker.whitemouse.persistent.entity.JvmOederWithBLOBs;
import com.xrdocker.whitemouse.service.JvmOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JvmOrderServiceImpl
 *
 * @author xiong rui
 * @version 1.0.0
 * @date 2019/6/3
 **/
@Service
public class JvmOrderServiceImpl implements JvmOrderService {

    @Autowired
    private JvmOederMapper mapper;

    @Override
    public List<JvmOederWithBLOBs> getAll() {

        return mapper.selectAll();
    }
}
