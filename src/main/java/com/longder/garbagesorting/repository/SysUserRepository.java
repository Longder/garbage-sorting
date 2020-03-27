package com.longder.garbagesorting.repository;

import com.longder.garbagesorting.entity.SysRole;
import com.longder.garbagesorting.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 用户表查询dao
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 根据登录名查询
     * @param loginName
     * @return
     */
    @Query("select s from SysUser s where s.loginName = :loginName")
    SysUser getByLoginName(@Param("loginName") String loginName);
}
