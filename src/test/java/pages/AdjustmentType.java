package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class AdjustmentType extends BaseClass {
	
	public static By expand=By.xpath("//button[contains(.,'Adjustment Type')]");
	public static By webtable=By.xpath("//*[@id=\"main\"]/div[2]/div[3]/div[2]/table");
	public static By webtablerows=By.xpath(" //*[@id=\"main\"]/div[2]/div[3]/div[2]/table/tbody/tr");
	public static By webtablecolumns =By.xpath(" //*[@id=\"main\"]/div[2]/div[3]/div[2]/table/thead/tr/th");
    public static By addbutton=By.xpath("//button[@class='common-used-button'][contains(.,'Add')]");

}
