package com.longder.garbagesorting.service.impl;

import com.longder.garbagesorting.entity.GarbageType;
import com.longder.garbagesorting.repository.GarbageTypeRepository;
import com.longder.garbagesorting.service.GarbageTypeMangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GarbageTypeMangeServiceImpl implements GarbageTypeMangeService {

    @Resource
    private GarbageTypeRepository garbageTypeRepository;

    /**
     * 查询所有垃圾类型
     *
     * @return
     */
    @Override
    public List<GarbageType> listAllGarbageType() {
        return garbageTypeRepository.findAll();
    }

    /**
     * 添加一个垃圾类型
     *
     * @param garbageType
     */
    @Override
    @Transactional
    public void addOneGarbageType(GarbageType garbageType) {
        garbageTypeRepository.save(garbageType);
    }

    /**
     * 查询一个垃圾类型
     *
     * @param garbageTypeId
     * @return
     */
    @Override
    public GarbageType getOneGarbageType(Long garbageTypeId) {
        return garbageTypeRepository.findById(garbageTypeId).orElseThrow(RuntimeException::new);
    }

    /**
     * 编辑修改一个垃圾类型
     *
     * @param garbageType
     */
    @Override
    @Transactional
    public void editOneGarbageType(GarbageType garbageType) {
        garbageTypeRepository.save(garbageType);
    }
}
