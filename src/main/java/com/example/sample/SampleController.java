package com.example.sample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.base.BaseController;

/**
 * 
 * @author fujimura
 *
 * サンプル画面１のコントローラークラスです
 */
@Controller
@RequestMapping(value = "/testAction")
public class SampleController extends BaseController{
	
	@Autowired
	private SampleService testService;

	// 画面１→画面２へ遷移する際に呼ばれる処理
	@PostMapping
    public String doPost(@ModelAttribute("sampleForm") SampleForm form, Model model) {
    	
    	// form→DTOに変換
    	SampleDto inputDto = new SampleDto();
    	BeanUtils.copyProperties(form, inputDto);

        SampleDto outputDto = testService.doSomething(inputDto);
       
        // DTO→formに変換
        SampleForm outputForm = new SampleForm();
        BeanUtils.copyProperties(outputDto, outputForm);
        
        model.addAttribute(outputForm);
        
        return "sample2";
    }
    
}