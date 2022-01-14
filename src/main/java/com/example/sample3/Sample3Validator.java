package com.example.sample3;

public class Sample3Validator {

	public static void validate(Sample3Form form) {

		// ID 数値チェック
		try {
			Integer.parseInt(form.getId());
		} catch(NumberFormatException e) {
			form.addMessage("Error:IDは数値で入力してください。");
		}
		
		// value 桁数チェック
		if(form.getValue().length() > 10) {
			form.addMessage("Error:Valueは10桁以内で入力してください。");
		}
	}
}
