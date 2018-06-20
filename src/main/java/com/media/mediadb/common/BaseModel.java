package com.media.mediadb.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
@Data
public class BaseModel implements Serializable{

    private String id;
    private Date createDate;
    private Date updateDate;

}
