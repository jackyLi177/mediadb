package com.media.mediadb.entity;

import com.media.mediadb.common.BaseModel;
import lombok.Data;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
@Data
public class Movie extends BaseModel{

    private String movieName;
    private String info;
    private String detailInfo;
    private String picture;
    private String actors;
    private String country;

}
