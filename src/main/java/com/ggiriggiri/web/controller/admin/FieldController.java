package com.ggiriggiri.web.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ggiriggiri.web.entity.Field;
import com.ggiriggiri.web.service.FieldService;

@Controller
@RequestMapping("/admin/category/field")
public class FieldController {

	@Autowired
	private FieldService service;
	
	@RequestMapping("")
	public String list(@RequestParam(name="p", defaultValue="1") int page, Model model) {
		
		int size = 10;
		List<Field> list = service.getList(page, size);
		model.addAttribute("list", list);
		
		return "admin.category.field";
		
	}
}
