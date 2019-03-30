package com.evolf.cap09_Autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sun {
	private Moon moon;

	//	@Autowired
	//对于有参构造器，加与不加Autowired效果一样
	public Sun(@Autowired Moon moon){ //moon从容器中获取
		this.moon = moon;
		System.out.println("..Constructor................");
	}
	public Moon getMoon() {
		return moon;
	}

	//	@Autowired 可以标注在方法上 方法的参数 会从容器中获取
	public void setMoon(Moon moon) {
		this.moon = moon;
	}

	@Override
	public String toString() {
		return "Sun [moon=" + moon + "]";
	}
}
