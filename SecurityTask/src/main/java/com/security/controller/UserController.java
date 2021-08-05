package com.security.controller;

import com.security.pojo.People;
import com.security.services.PeopleService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class UserController {

    @Resource
    PeopleService peopleService;
    /**
     * 登录页面跳转
     * @return
     */
    @GetMapping("login")
    public String login() {
        return "login";
    }


    /**
     * index页跳转
     * @return
     */
    @GetMapping("index")
    public String index(Model model) {
        List<People> peopleList = peopleService.selectAll();
        model.addAttribute("list",peopleList);
        return "index";
    }

//    /**
//     * menu1按钮
//     * @return
//     */
//    @PreAuthorize("hasAuthority('menu1')")
//    @GetMapping("menu1")
//    @ResponseBody
//    public String menu1() {
//        return "menu1";
//    }
//
//    /**
//     * menu2按钮
//     * @return
//     */
//    @PreAuthorize("hasAuthority('menu2')")
//    @GetMapping("menu2")
//    @ResponseBody
//    public String menu2() {
//        return "menu2";
//    }
//
//    /**
//     * menu3按钮
//     * @return
//     */
//    @PreAuthorize("hasAuthority('menu3')")
//    @GetMapping("menu3")
//    @ResponseBody
//    public String menu3() {
//        return "menu3";
//    }

    /**
     * 跳转到addPage页面
     */
    @PreAuthorize("hasAuthority('menu2')")
    @RequestMapping(value = "/addPage")
    public String add(){
        return "addPage";
    }

    /**
     * 添加新人，并重定向
     */
    @PreAuthorize("hasAuthority('menu2')")
    @RequestMapping(value = "/add")
    public String addPeople(People people){
        peopleService.addNew(people);
        return "redirect:/index";
    }
    /**
     * 通过id查询并重定向到首页
     */
    @GetMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        peopleService.deleteById(id);
        return "redirect:/index";
    }
    /**
     * 跳转到addPage页面
     */
    @PreAuthorize("hasAuthority('menu1')")
    @RequestMapping(value = "/queryPage")
    public String queryPage(){
        return "find";
    }

    /**
     *  通过名字模糊查询
     */
    @PreAuthorize("hasAuthority('menu1')")
    @RequestMapping(value = "/query/{name}")
    @ResponseBody
    public List<People> queryByName(@PathVariable String name){
        return peopleService.findByNameLike(name);
    }


    /**
     *  跳转到更新页面
     */
    @RequestMapping(value = "/toUpdate/{id}")
    public String toUpdate(@PathVariable Integer id, Model model){
        People people = peopleService.selectById(id);
        model.addAttribute("people",people);
        return "update";
    }

    /**
     *  更新用户并重定向到首页
     */
    @PreAuthorize("hasAuthority('menu2')")
    @PostMapping(value = "/update")
    public String updatePeople(People people){
        peopleService.addNew(people);
        return "redirect:/index";
    }
}