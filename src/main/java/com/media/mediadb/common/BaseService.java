package com.media.mediadb.common;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author : liyongjie
 * @Date : 2018/6/20 0020
 */
public class BaseService<T extends BaseMapper<M>,M extends BaseModel> {

    @Autowired
    private T mapper;

    public int getCount(M entity){
        return mapper.getCount(entity);
    }

    public M save(M entity){
        if(isNewRecord(entity)){
            return mapper.insert(entity);
        }else {
            return mapper.update(entity);
        }
    }

    public M deleteByEntity(M entity){
        return mapper.deleteByEntity(entity);
    }

    public M deleteByID(int id){
        return mapper.deleteByID(id);
    }

    public void deleteList(List<M> data){
           for (M t : data){
               mapper.deleteByEntity(t);
           }
    }

    public M getByID(int id){
        return mapper.getByID(id);
    }

    public List<M> getByEntity(M entity){
        return mapper.getByEntity(entity);
    }

    public List<M> getAll(){
        return mapper.getAll();
    }

    private boolean isNewRecord(M entity) {
        if(mapper.getByID(Integer.parseInt(entity.getId())) == null){
            return true;
        }else{
            return false;
        }
    }


}
