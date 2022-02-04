package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {
	@NotBlank(message = "名前は必須です")
	private String name;

	@NotBlank(message = "年齢は必須です")
	private String age;

	@Size(min = 1, max = 100, message = "コメントは1文字以上100文字以内で入力してください")
	private String comment;

	public Integer getIntAge() {
		return Integer.parseInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
