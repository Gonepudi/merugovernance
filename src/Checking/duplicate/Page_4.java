package Checking.duplicate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Utility;

public class Page_4 extends Utility {
	
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
	@Test(priority='4')
	public void page_2() throws InterruptedException
	{excption(driver.findElement(By.xpath("/html/body/app/home/navigation/div/mat-button-toggle-group/mat-button-toggle[2]/label/div/i")));
	
	
	Thread.sleep(3000);
	excption(driver.findElement(By.xpath("/html/body/app/datamaps/div/div[1]/div[2]/div/mat-card/div/label")));
	
	
	excption(driver.findElement(By.xpath("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[5]/a")));
		Thread.sleep(3000);
		excption(driver.findElement(By.xpath("/html/body/app/datamaps/div/div[1]/div[2]/div/mat-card/div/label")));
		for(int k=0;k<8;k++)
		{
		//Page_Number
		wait("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[8]/a/i");
	
		Thread.sleep(4000);
		//Page_Number
		driver.findElement(By.xpath("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[8]/a/i")).click();
		}
		String s1="/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[";
		String s2="]/datatable-body-row/div[2]/datatable-body-cell[1]/div/span";
	
		{
				for(int i=1;i<12;i++)
    {
     String s3=s1+i+s2;
     Thread.sleep(5000);
     driver.findElement(By.xpath(s3)).click(); 
     wait("/html/body/app/datamap-details/div/div[2]/div/div[4]/div[1]/mat-tab-group/div/mat-tab-body[1]/div/basic-details/div/div[2]/div/table/tbody/tr/td[1]");
     Thread.sleep(5000);
     List<WebElement> aaa= driver.findElements(By.xpath("/html/body/app/datamap-details/div/div[2]/div/div[4]/div[1]/mat-tab-group/div/mat-tab-body[1]/div/basic-details/div/div[2]/div/table/tbody/tr/td[1]"));
     for(int p=0;p<aaa.size();p++) 
     {
     System.out.println(aaa.get(p).getText());
     }   
     System.out.println("***********************"+i);
    
     //Thread.sleep(5000);
    //Back Button
     driver.findElement(By.xpath("/html/body/app/datamap-details/div/div[2]/div/h3/button[2]/span")).click();
    // wait("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[6]/a");
		Thread.sleep(4000);
		for(int k=0;k<8;k++)
		{
		//Page_Number
		wait("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[8]/a/i");
	
		Thread.sleep(4000);
		//Page_Number
		driver.findElement(By.xpath("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[8]/a/i")).click();
		}
    }
	
	System.out.println("Page:-3");
		
		}
	
	
	
	}
}
