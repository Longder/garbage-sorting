package com.longder.garbagesorting.service.impl;

import com.longder.garbagesorting.entity.Garbage;
import com.longder.garbagesorting.repository.GarbageRepository;
import com.longder.garbagesorting.service.GarbageMangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 垃圾管理相关业务
 */
@Service
public class GarbageMangeServiceImpl implements GarbageMangeService {

    @Resource
    private GarbageRepository garbageRepository;

    /**
     * 查询所有的垃圾
     *
     * @return
     */
    @Override
    public List<Garbage> listAllGarbage() {
        return garbageRepository.findAll();
    }

    /**
     * 添加一个垃圾
     *
     * @param garbage
     */
    @Override
    @Transactional
    public void addOneGarbage(Garbage garbage) {
        garbageRepository.save(garbage);
    }

    /**
     * 查询获取一个垃圾
     *
     * @param garbageId
     * @return
     */
    @Override
    public Garbage getOneGarbage(Long garbageId) {
        return garbageRepository.findById(garbageId).orElseThrow(RuntimeException::new);
    }

    /**
     * 编辑一个垃圾
     *
     * @param garbage
     */
    @Override
    @Transactional
    public void editOneGarbage(Garbage garbage) {
        garbageRepository.save(garbage);
    }

    /**
     * 删除一个垃圾
     *
     * @param garbageId
     */
    @Override
    @Transactional
    public void deleteOneGarbage(Long garbageId) {
        garbageRepository.deleteById(garbageId);
    }
}
