package com.sss.controller;

import com.sss.model.AModel;
import com.sss.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/a")
public class AController {

	@Autowired
	private AModel aModel;

	@Autowired
	private AService aService;
	
	@RequestMapping("/a")
	public String a() {
		return "sss";
	}
	
	@RequestMapping("/{user_id}/b")
	public String b(@PathVariable("user_id") Long id) {
		System.out.println(aModel.getName());
		System.out.println(id);
		System.out.println(455666);
		return "success";
	}
}
