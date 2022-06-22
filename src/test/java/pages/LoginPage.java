package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public static By member=By.xpath("//input[contains(@name,'practice')]");
	public static By name=By.xpath("//input[contains(@name,'email')]");
	public static By security=By.name("password");
	public static By login =By.xpath("//button[contains(@type,'submit')]");
}
