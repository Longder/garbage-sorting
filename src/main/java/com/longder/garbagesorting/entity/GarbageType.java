package com.longder.garbagesorting.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 垃圾类型实体
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "GARBAGE_TYPE")
public class GarbageType extends BaseIdEntity{
    /**
     * 名称
     */
    @Column(name = "name_")
    private String name;

    /**
     * 描述
     */
    @Column(name = "description_")
    private String description;

    /**
     * 处置要求
     */
    @Column(name = "handle_require_")
    private String handleRequire;

    /**
     * 常见垃圾
     */
    @Column(name = "common_garbage_")
    private String commonGarbage;
}
