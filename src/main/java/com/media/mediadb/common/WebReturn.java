package com.media.mediadb.common;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
public enum WebReturn {

    COMMON_ERROR("请求失败！","6000");

    public String info;
    public String code;

    WebReturn(String info,String code){
        this.info = info;
        this.code = code;
    }

}
