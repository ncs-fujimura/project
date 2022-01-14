package com.example.sample2;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample3.Sample3Dto;
import com.example.sample3.Sample3Form;
import com.example.sample3.Sample3Validator;

/**
 * 
 * @author fujimura
 *
 * サンプル機能２（ＤＢアクセス処理）のコントローラークラスです
 */
@Controller
@RequestMapping("/sample2")
public class Sample2Controller {
	
	@Autowired
	private Sample2Service sample2Service;

	@PostMapping(params = "connectDB")
	public String connectDB(Model model) {
		
		Sample2Dto outputDto = sample2Service.selectSampleList();
		
		model.addAttribute(outputDto);
		
		return "sample3";
	}
	
	@PostMapping(params = "return")
	public String doReturn() {
		
		return "sample";
	}
	
	
	@PostMapping(params = "insert")
	public String insertSample(@ModelAttribute("sampleForm") Sample3Form form, Model model) {
		
		// 入力値の検証
		Sample3Validator.validate(form);
		
		if(form.hasErrors()) {
			model.addAttribute("messageList",form.getMessageList());
			return connectDB(model);
		}
		
		Sample3Dto inputDto = new Sample3Dto();
		BeanUtils.copyProperties(form, inputDto);
		
		Sample3Dto outputDto = sample2Service.insertSample(inputDto);
		
		model.addAttribute("messageList",outputDto.getMessageList());
		return connectDB(model);
	}
	
	@PostMapping(params = "delete")
	public String delete(@ModelAttribute("sampleForm") Sample3Form form, Model model) {
		
		Sample3Dto inputDto = new Sample3Dto();
		BeanUtils.copyProperties(form, inputDto);
		
		Sample3Dto outputDto = sample2Service.deleteSample(inputDto);
		
		model.addAttribute("messageList",outputDto.getMessageList());
		return connectDB(model);
	}
}
