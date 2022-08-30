package Sample;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import pojo.Addresspojo;
import pojo.Homepojo;
import pojo.Loginpojo;
import pojo.Paymentpojo;
import pojo.Productpojo;

public class Sample extends Baseclass{
	@BeforeClass
	private void browserLunch() {
	launchBrowser();
	toMaximize();
	}
	@AfterClass
	private void closeBrowser() {
		toQuit();
	}
	@BeforeMethod
	private void passUrl() {
		passUrl("https://www.amazon.in/");
	}
	@AfterMethod
	private void screenshot1() throws IOException {
		screenshot("payment");
		
	}
		
		@Test
		private void test() throws IOException, InterruptedException{
			webWait();
			
			//Loginpojo
			Loginpojo l=new Loginpojo();
			mouseHoverAction(l.getHello());
			toClick(l.getSignin());
			toInput(l.getUsername(), excelRead(1, 1));
			toClick(l.getContinu());
			toInput(l.getPassword(), excelRead(2, 1));
			toClick(l.getSignin1());
			Thread.sleep(39000);
			
			//Homepojo
			
			Homepojo h=new Homepojo();
			
			toClick(h.getMobile());
			
			//Productpojo
			
			Productpojo p=new Productpojo();
			
			toClick(p.getOneplus());
			mouseHoverAction(p.getSelectphone());
			toClick(p.getSelectphone());
			windowId();
			toClick(p.getBuynow());
			
			//Addresspojo
			
			Addresspojo a=new Addresspojo();
			
			 toInput(a.getName(), excelRead(3, 1));
			 toInput(a.getMob(), excelRead(4, 1));
			   toInput(a.getPin(), excelRead(5, 1));
			   toInput(a.getAddres(), excelRead(6, 1));
			   toInput(a.getArea(),excelRead(7, 1));
			   toInput(a.getLand(),excelRead(8, 1));
			   toInput(a.getTown(), excelRead(9, 1));
			   mouseHoverAction(a.getType());
			   toClick(a.getType());
			   mouseHoverAction(a.getHome());
			   toClick(a.getHome());
			   toClickJavascript(a.getUse());
			   
			   
			   //Paymentpojo
			   
			   Paymentpojo pa=new Paymentpojo();
			   scrollUp(pa.getAtm());
				 toClick(pa.getAtm());
				 //mouseHoverAction(pa.getAdddebit());
	             toClick(pa.getAdddebit());
	             Thread.sleep(5000);
			
		}
	}



