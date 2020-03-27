package com.longder.garbagesorting.repository;

import com.longder.garbagesorting.entity.GarbageType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 垃圾类型表dao
 */
public interface GarbageTypeRepository extends JpaRepository<GarbageType,Long> {
}
