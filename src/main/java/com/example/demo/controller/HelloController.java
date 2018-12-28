package com.example.demo.controller;

import com.example.demo.entity.Links;
import com.example.demo.service.LinksServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloController {
    @Resource
    private LinksServiceImpl LinksService;

    @RequestMapping("/")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        System.out.println("1__________________");
        List<Links> LinkList = LinksService.getAllLinks();
        System.out.println(LinkList.get(1).getId());
        System.out.println(LinkList.get(1).getName());
        System.out.println(LinkList.get(1).getLink());

        mv.addObject("linklist", LinkList);
        return mv;
    }
}
