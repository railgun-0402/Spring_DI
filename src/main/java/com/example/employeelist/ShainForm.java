package com.example.employeelist;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class ShainForm {
	
	@NotEmpty(message = "IDを入力してください")
	@Pattern(regexp = "^[0-9]{3}$", message="半角数字3桁で入力し直してください")
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
		

}
