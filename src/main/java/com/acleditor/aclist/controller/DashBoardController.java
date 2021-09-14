package com.acleditor.aclist.controller;

import com.acleditor.aclist.dto.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/createService")
    public String createService(Model model){
        model.addAttribute("testDto", new TestDto());
        //model.addAttribute();
         return "createService";
    }

    @PostMapping("/createService")
    public String doCreateService(@ModelAttribute TestDto testDto, Model model){
        System.out.println(testDto);
        if (testDto.getCode()!=null && !testDto.getCode().isBlank()) {
            model.addAttribute("success", true);
        }
        return "createService";
    }
}
