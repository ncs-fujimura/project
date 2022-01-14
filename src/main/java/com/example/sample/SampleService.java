package com.example.sample;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 
 * @author fujimura
 *
 * サンプル機能用のサービスクラスです
 */
@Service
public class SampleService {

	public SampleDto doSomething(SampleDto inputDto) {
		
		SampleDto outputDto = new SampleDto();
		BeanUtils.copyProperties(inputDto, outputDto);
		
		return outputDto;
	}
}
