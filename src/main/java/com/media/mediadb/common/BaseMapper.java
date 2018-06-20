package com.media.mediadb.common;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
@Mapper
public interface BaseMapper<T> {

    int getCount(T entity);

    T insert(T entity);

    T update(T entity);

    T deleteByEntity(T entity);

    T deleteByID(int id);

    int deleteList(List<T> data);

    T getByID(int id);

    List<T> getByEntity(T entity);

    List<T> getAll();
}
