package com.example.base;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
	
	@Autowired
	protected HttpSession session;
	
	//http://localhost:8080/project「/」が呼ばれた際の処理
	@GetMapping(value = "/")
    public String init() {
    	
        // WEB-INF/views下の、同名のjsp
        return "sample";
    }

}
