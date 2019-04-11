package com.Preview_Duplicate_delete;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Utility.Utility;

public class Preview_Duplicate_delete extends Utility   {
	
	@Test(priority='1')
	public void Opening_Browser()
	  {
		Opening_Browser_loading_property_File_and_Locators();

      }


	@Test(priority='2')
	public void Login() throws InterruptedException
	 {
		Login_Page();

     }
	
	@Test(priority='3')
	public void creating_Survey_data_1() throws InterruptedException
	{
		excption(this.lct.getAdmin_Survey_data_home());
		Thread.sleep(1000);
		excption(this.lct.getAdd_Survey());
		
		this.lct.getEntering_Survey_Name().sendKeys("new");
		
		this.lct.getSurvey_Description().sendKeys("NEW");
		
		excption(this.lct.getSurvey_Date());
		
	//	excption(this.lct.getS_survey_Date());
		
		//Selecting Entities from Toolbox
		
		//this.lct.getSingle_Unit().click();
		
		
		Thread.sleep(1000);
		
		//this.lct.getCheck_box().click();
		
		Thread.sleep(1000);
		
		//this.lct.getRadio_Group().click();
		
		//this.lct.getDroup_down().click();
		
		//this.lct.getComment().click();
		
		//this.lct.getRating().click();
		
		//this.lct.getFile().click();
		
		//this.lct.getPanel().click();
		
		this.lct.getUser_details().click();
		
		this.lct.getEntities().click();
		
		this.lct.getRetention_Panel().click();
		
		this.lct.getGeneric_Question().click();
		
		this.lct.getGdpr_contract().click();;
		
		this.lct.getSave().click();
    
		
	 
		 
	}
	
	@Test(priority='4')
	public void  preview_delete_duplicate1()
	
	{
		driver.findElement(By.xpath("/html/body/app/surveyadmin/div/div/mat-card/div[3]/table/tbody/tr/td[7]/select")).click();
		
		driver.findElement(By.xpath("/html/body/app/surveyadmin/div/div/mat-card/div[3]/table/tbody/tr/td[7]/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]")).click();
	}	
	
	


}
