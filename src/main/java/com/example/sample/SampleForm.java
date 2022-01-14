package com.example.sample;

import com.example.base.BaseForm;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author fujimura
 *
 * サンプル画面１のフォームクラスです
 * 画面⇔コントローラーへ値を渡すためのクラス
 */
@Getter
@Setter
public class SampleForm extends BaseForm{
	
	private String text;
	private String radio;

}
