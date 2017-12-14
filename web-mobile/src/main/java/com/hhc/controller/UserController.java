package com.hhc.controller;

import com.hhc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhc.common.Result;
import com.hhc.common.ResultGenerator;

import com.hhc.service.UserService;

@Controller
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login")
	@ResponseBody
	public Result login(User user) {
		User resultUser = userService.login(user);
		if (resultUser == null) {
			return ResultGenerator.genFailResult("«Î»œ’Ê∫À∂‘’À∫≈°¢√‹¬Î£°");
		} else {
			return ResultGenerator.genSuccessResult();
		}
	}
}
