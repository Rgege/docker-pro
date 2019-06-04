package com.xrdocker.whitemouse.common.constants;

/**
 * @Description <P></P>
 * @Author v-Rui.Xiong@bl.com
 * @Date 2019/6/4
 * @Version 1.0.0
 **/
public enum RspCodeEnums {
    SUCCESS("00100000","操作成功"),
    FAILURE("00000001","操作失败"),

    PARAM_VALIDATE_ERROR("00000100","参数校验不通过"),
    ;
    String code;
    String desc;

    RspCodeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
