package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class PassingPage extends BaseClass {
	public static By role=By.xpath("//select[contains(@name,'roles')]");
	public static By hospital=By.name("facility");
	public static By click=By.xpath("//button[contains(@class,'btn btn-primary')]");
}
