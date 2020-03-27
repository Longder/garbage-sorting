package com.longder.garbagesorting.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 垃圾
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "GARBAGE")
public class Garbage extends BaseIdEntity {

    /**
     * 名称
     */
    @Column(name = "name_")
    private String name;

    /**
     * 所属类型
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "garbage_type_")
    private GarbageType garbageType;
}
