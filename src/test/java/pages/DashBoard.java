package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class DashBoard extends BaseClass {
	public static By settings=By.xpath("//*[@id=\"mySidenav\"]/ul/li[5]");
	public static By domainvalues=By.xpath("//a[@href='/DomainValues'][contains(.,'Domain Values')]");
}
