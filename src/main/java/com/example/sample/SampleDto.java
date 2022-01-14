package com.example.sample;

import com.example.base.BaseDto;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author fujimura
 *
 * サンプル画面１のDTOクラスです
 * コントローラー⇔サービスへ値を渡すためのクラス
 */
@Getter
@Setter
public class SampleDto extends BaseDto{
	
	private String text;
	private String radio;

}
