package com.delip.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delip.service.ResultListService;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("/resultlist/*")
public class ResultListController {

	@Autowired
	private ResultListService service;
	
	
}
