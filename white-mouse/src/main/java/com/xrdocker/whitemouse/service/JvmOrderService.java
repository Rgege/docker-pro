package com.xrdocker.whitemouse.service;

import com.xrdocker.whitemouse.persistent.entity.JvmOederWithBLOBs;

import java.util.List;

/**
 * @Description <P></P>
 * @Author v-Rui.Xiong@bl.com
 * @Date 2019/6/3
 * @Version 1.0.0
 **/
public interface JvmOrderService {

    List<JvmOederWithBLOBs> getAll();
}
