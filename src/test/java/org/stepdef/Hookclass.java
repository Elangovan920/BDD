package org.stepdef;

import java.util.Date;

import org.baseclass.BaseClass;

import io.cucumber.java.*;


public class Hookclass extends BaseClass{
@Before(value="@all",order=1)
public void me() {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com");
	
}
	@After(value="@group1",order=1)
	public void m2() {
		System.out.println("hlo");
		driver.quit();
	}
	@Before(value="@all",order=2)
	public void me1() {
		Date d = new Date();
		System.out.println("scenario started at"+d);
	}
	@After(value="@all",order=2)
	public void m21() {
		Date d = new Date();
		System.out.println("scenario ended at"+d);
	}
}
