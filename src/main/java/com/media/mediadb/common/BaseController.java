package com.media.mediadb.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
public class BaseController<S extends BaseService<T,M>,T extends BaseMapper<M>,M extends BaseModel>{

    @Autowired
    private S service;

    @Autowired
    private T mapper;

    @GetMapping("/Get")
    public Result getByID(){
        return null;
    }

}
