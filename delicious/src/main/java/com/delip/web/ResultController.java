package com.delip.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.delip.dto.Criteria;
import com.delip.service.ResultService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/list/*")    
public class ResultController {

     @Autowired
     private ResultService service;

     @GetMapping("/test")
     public void list(Criteria cri, Model model) {
           model.addAttribute("list", service.getList(cri));
           model.addAttribute("total", service.getListCount(cri));
           
           log.info(""+cri.getPage());
     }
}

