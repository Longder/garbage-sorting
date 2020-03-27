package com.longder.garbagesorting.service;

import com.longder.garbagesorting.entity.GarbageType;

import java.util.List;

/**
 * 垃圾类型管理Service
 */
public interface GarbageTypeMangeService {

    /**
     * 查询所有垃圾类型
     * @return
     */
    List<GarbageType> listAllGarbageType();

    /**
     * 添加一个垃圾类型
     * @param garbageType
     */
    void addOneGarbageType(GarbageType garbageType);

    /**
     * 查询一个垃圾类型
     * @param garbageTypeId
     * @return
     */
    GarbageType getOneGarbageType(Long garbageTypeId);

    /**
     * 编辑修改一个垃圾类型
     * @param garbageType
     */
    void editOneGarbageType(GarbageType garbageType);
}
