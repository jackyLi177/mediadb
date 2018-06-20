package com.media.mediadb.common;

import java.util.HashMap;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
public class Result extends HashMap<String,Object>{

    private static String SUCCESS_CODE = "2000";
    private static String SUCCESS_INFO = "Success!!";


    public Result(){
        put("info",SUCCESS_INFO);
        put("code",SUCCESS_CODE);
    }

    public Result(Object data){
        put("info",SUCCESS_INFO);
        put("code",SUCCESS_CODE);
        put("data",data);
    }

    public Result ok(){
        return new Result();
    }

    public Result ok(Object data){
        return new Result(data);
    }

    public Result error(){
        return new Result(WebReturn.COMMON_ERROR);
    }
}
