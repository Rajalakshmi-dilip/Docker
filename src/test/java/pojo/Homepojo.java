package pojo;


import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

	public class Homepojo extends Baseclass{
		
		public Homepojo() {

			PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath="//a[text()='Mobiles']")
		private WebElement mobile;
		
		public WebElement getMobile() {
			return mobile;
		}
	
	}
	