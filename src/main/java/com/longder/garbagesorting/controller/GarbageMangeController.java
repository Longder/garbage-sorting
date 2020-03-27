package com.longder.garbagesorting.controller;

import com.longder.garbagesorting.entity.Garbage;
import com.longder.garbagesorting.service.GarbageMangeService;
import com.longder.garbagesorting.service.GarbageTypeMangeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 垃圾管理控制器
 */
@Controller
@RequestMapping("/admin/garbage")
public class GarbageMangeController {

    @Resource
    private GarbageMangeService garbageMangeService;
    @Resource
    private GarbageTypeMangeService garbageTypeMangeService;

    /**
     * 垃圾列表
     *
     * @return
     */
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", garbageMangeService.listAllGarbage());
        return "garbage/list";
    }

    /**
     * 去添加垃圾
     *
     * @return
     */
    @GetMapping("/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("typeList", garbageTypeMangeService.listAllGarbageType());
        return "garbage/add-modal";
    }

    /**
     * 添加垃圾
     *
     * @return
     */
    @PostMapping("/add")
    public String add(Garbage garbage) {
        garbageMangeService.addOneGarbage(garbage);
        return "redirect:list";
    }

    /**
     * 去编辑垃圾
     *
     * @param model
     * @return
     */
    @GetMapping("/toEdit")
    public String toEdit(Model model, Long garbageId) {
        model.addAttribute("typeList", garbageTypeMangeService.listAllGarbageType());
        model.addAttribute("garbage", garbageMangeService.getOneGarbage(garbageId));
        return "garbage/edit-modal";
    }

    /**
     * 修改
     *
     * @param garbage
     * @return
     */
    @PostMapping("/edit")
    public String edit(Garbage garbage) {
        garbageMangeService.editOneGarbage(garbage);
        return "redirect:list";
    }

    /**
     * 删除垃圾
     * @param garbageId
     * @return
     */
    @GetMapping("/delete")
    public String delete(Long garbageId){
        garbageMangeService.deleteOneGarbage(garbageId);
        return "redirect:list";
    }
}
