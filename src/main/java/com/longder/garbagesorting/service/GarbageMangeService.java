package com.longder.garbagesorting.service;

import com.longder.garbagesorting.entity.Garbage;

import java.util.List;

/**
 * 垃圾管理相关业务
 */
public interface GarbageMangeService {
    /**
     * 查询所有的垃圾
     * @return
     */
    List<Garbage> listAllGarbage();

    /**
     * 添加一个垃圾
     * @param garbage
     */
    void addOneGarbage(Garbage garbage);

    /**
     * 查询获取一个垃圾
     * @param garbageId
     * @return
     */
    Garbage getOneGarbage(Long garbageId);

    /**
     * 编辑一个垃圾
     * @param garbage
     */
    void editOneGarbage(Garbage garbage);

    /**
     * 删除一个垃圾
     * @param garbageId
     */
    void deleteOneGarbage(Long garbageId);
}
