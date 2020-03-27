package com.longder.garbagesorting.controller;

import com.longder.garbagesorting.entity.GarbageType;
import com.longder.garbagesorting.service.GarbageTypeMangeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 垃圾类型管理的控制器
 */
@Controller
@RequestMapping("/admin/garbageType")
public class GarbageTypeMangeController {
    @Resource
    private GarbageTypeMangeService garbageTypeMangeService;

    /**
     * 列表
     *
     * @return
     */
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", garbageTypeMangeService.listAllGarbageType());
        return "garbage-type/list";
    }

    /**
     * 添加垃圾类型的页面
     *
     * @return
     */
    @GetMapping("/toAdd")
    public String toAdd() {
        return "garbage-type/add-modal";
    }

    /**
     * 添加垃圾类型
     *
     * @param garbageType
     * @return
     */
    @PostMapping("/add")
    public String add(GarbageType garbageType) {
        garbageTypeMangeService.addOneGarbageType(garbageType);
        return "redirect:list";
    }

    /**
     * 去编辑页面
     * @return
     */
    @GetMapping("/toEdit")
    public String toEdit(Model model,Long garbageTypeId){
        GarbageType garbageType = garbageTypeMangeService.getOneGarbageType(garbageTypeId);
        model.addAttribute("garbageType",garbageType);
        return "garbage-type/edit-modal";
    }

    /**
     * 编辑垃圾类型
     * @return
     */
    @PostMapping("/edit")
    public String edit(GarbageType garbageType){
        garbageTypeMangeService.editOneGarbageType(garbageType);
        return "redirect:list";
    }
}
