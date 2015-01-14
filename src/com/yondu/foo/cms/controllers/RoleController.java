package com.yondu.foo.cms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yondu.foo.cms.domains.RoleTb;
import com.yondu.foo.cms.service.RoleService;

@Controller
@RequestMapping("/cms/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;

	@RequestMapping(value="/add.htm", method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("roleModelAttribute", new RoleTb());
		return "roleAdd";
	}
	
	@RequestMapping(value="/add.htm", method=RequestMethod.POST)
	public String save(@ModelAttribute("roleModelAttribute") RoleTb role, Model model){
		roleService.save(role);
		return "roleAdd";
	}
	
	
	
}
