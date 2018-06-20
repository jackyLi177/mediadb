package com.media.mediadb.entity;

import com.media.mediadb.common.BaseModel;
import lombok.Data;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
@Data
public class Song extends BaseModel{

    private String songName;
    private String singer;
    private String type;
    private String picture;

}
