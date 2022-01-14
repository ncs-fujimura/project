package com.example.sample2;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Sample;
import com.example.sample3.Sample3Dto;

/**
 * 
 * @author fujimura
 *
 * サンプル機能２のサービスクラスです
 */
@Service
@MapperScan(basePackages = { "com.example.sample2" })
public class Sample2Service {

	@Autowired
	private Sample2Mapper sample2Mapper;
	
	public Sample2Dto selectSampleList() {

		Sample2Dto outputDto = new Sample2Dto();
		List<Sample> sampleList = sample2Mapper.selectSampleList();
		
		outputDto.setSampleList(sampleList);
		
		return outputDto;
	}
	
	public Sample3Dto insertSample(Sample3Dto inputDto) {
		
		// 返却用変数
		Sample3Dto outputDto = new Sample3Dto();
		
		// 主キー重複チェック
		if(exists(inputDto.getId())) {
			outputDto.addMessage("Error:主キー重複（" + inputDto.getId() + "）");
			return outputDto;
		}
		
		Sample sample = new Sample();
		sample.setId(Integer.parseInt(inputDto.getId()));
		sample.setValue(inputDto.getValue());
		
		try {
			sample2Mapper.insertSample(sample);
		} catch(Exception e) {
			outputDto.addMessage("Error:登録時の不明なエラー");
		}
		
		outputDto.addMessage("登録に成功しました");
		
		return outputDto;
	}
	
	private boolean exists(String id) {
		return sample2Mapper.exists(id) != 0;
	}
	
	public Sample3Dto deleteSample(Sample3Dto inputDto) {
		
		// 返却用変数
		Sample3Dto outputDto = new Sample3Dto();
		
		// 削除前存在チェック
		if(exists(inputDto.getId())) {
			outputDto.addMessage("Error:主キー重複（" + inputDto.getId() + "）");
			return outputDto;
		}
		
		try {
			sample2Mapper.deleteSample(inputDto.getSelectedId());
		} catch(Exception e) {
			outputDto.addMessage("Error:削除時の不明なエラー");
		}
		
		outputDto.addMessage("削除に成功しました");
		
		return outputDto;
	}
}
