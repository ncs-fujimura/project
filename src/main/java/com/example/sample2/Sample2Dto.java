package com.example.sample2;

import java.util.List;

import com.example.base.BaseDto;
import com.example.entity.Sample;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author fujimura
 *
 * サンプル機能２用のDTOクラスです
 */
@Getter
@Setter
public class Sample2Dto extends BaseDto{

	private List<Sample> sampleList;
	
}
