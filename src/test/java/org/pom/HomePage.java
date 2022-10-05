package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(xpath="(//input[starts-with(@type,'text')])[1]")
private WebElement search;
@FindBy(xpath="(//*[contains(@class,'search')])[10]")
private WebElement searchbtn;
public WebElement getSearch() {
	return search;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public void search(String productname) {
	
}
}
