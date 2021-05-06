package com.yj.ems.controller;

import com.yj.ems.entity.Emp;
import com.yj.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;
    @GetMapping("/findall")
    public String findall(Model model){
        List<Emp> emps = empService.findall();
        model.addAttribute("emps",emps);
        return  "emp/emplist";

    }
    @PostMapping("/save")
    public String save(Emp emp){
        empService.save(emp);
        return  "redirect:/emp/findall ";

    }
}
