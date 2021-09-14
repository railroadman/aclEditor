package com.acleditor.aclist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping()
public class DashBoardController {
    @GetMapping("/")
    public String indexPage(Model model){
        Map<String,String> options =  new HashMap<>();
        options.put("key1","1");
        options.put("key2","2");
        options.put("key3","3");
        options.put("key4","4");
        options.put("key5","5");
        options.put("key6","6");

        model.addAttribute("options",options);

        return "index";
    }
}
