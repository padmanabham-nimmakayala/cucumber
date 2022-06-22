package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class DomainValues extends BaseClass {
	public static By fulllist=By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul/li");
	public static By error_message=By.xpath("(//span[contains(@class,'close-icon')])[2]");
    public static By default_button1=By.xpath("(//div[contains(.,'Address Type')])[9]");
    public static By default_button2=By.xpath("//button[@class='common-used-button'][contains(.,'Add')]");
}
