package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class SecurityDomain extends BaseClass {
	public static By security=By.xpath("//div[@class='only-text'][contains(.,'Security')]");
	public static By user=By.xpath("//a[@href='/Users'][contains(.,'Users')]");
	public static By usertable=By.xpath("//*[@id=\"main\"]/div[2]/div[2]/table");
	public static By tablerows=By.xpath("//*[@id=\"main\"]/div[2]/div[2]/table/tbody/tr");
	public static By tablecolumns=By.xpath("//*[@id=\"main\"]/div[2]/div[2]/table/thead/tr/th");
	public static By useradd=By.xpath("//button[@class='common-used-button'][contains(.,'Add')]");
}
