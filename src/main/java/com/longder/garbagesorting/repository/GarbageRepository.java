package com.longder.garbagesorting.repository;

import com.longder.garbagesorting.entity.Garbage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 垃圾表dao
 */
public interface GarbageRepository extends JpaRepository<Garbage, Long> {
}
