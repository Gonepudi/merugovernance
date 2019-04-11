package Checking.duplicate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Excel.Loading_Excel_Methods;
import com.Utility.Utility;

public class Duplicatessss {

	public class Duplicate_data_element extends Utility {

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
		public void DataElement() throws InterruptedException
		 { int n=5;
			
			
			excption(driver.findElement(By.xpath("/html/body/app/home/navigation/div/mat-button-toggle-group/mat-button-toggle[2]/label/div/i")));
			
			
			Thread.sleep(3000);
			excption(driver.findElement(By.xpath("/html/body/app/datamaps/div/div[1]/div[2]/div/mat-card/div/label")));
	
		   for(int k=0;k<=23;k++)
		   {int io=1;
				List<WebElement> block= driver.findElements(By.xpath("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper/datatable-body-row/div[2]/datatable-body-cell[1]/div/span"));
				
				   for(int l=0;l<block.size();l++)
				   {
					 System.out.println(block.get(l).getText()); 
					
					
					 
					 //Assert.assertEquals(block.get(i).getText(), prp.getProperty("block"+i));  
				   }
				   System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				  driver.findElement(By.xpath("/html/body/app/datamaps/div/div[4]/div/div/div[3]/ngx-datatable/div/datatable-footer/div/datatable-pager/ul/li[8]/a/i")).click();
			  
				   
				   
				   
				   
				   
				   
			   
	     }
		   
	/*	   
	
	for(int kk=0;kk<=200;kk++)
	{
		   for(int p=0;p<=200;p++)
			 
		  {
			   
			   if(kk==p)
			   {
			   
			   ++p;
			   }
			   else if(prp.getProperty("Data"+kk).equals(prp.getProperty("Data"+p)))
			 {
				 
				 System.out.println("equal");
				 
		     }
			  
			
		  
		  }
			}
		 
	*/
		 }
		
		@Test(priority='4')
		public void passdata()
		{ 
		Loading_Excel_Methods ne=new Loading_Excel_Methods("C:\\Users\\admin\\workspace\\Data_Governance_Tool\\12.xlsx");	
		int j=ne.getRowCount(0);	
		String[] data = new String[254];
		    for(int i=0;i<j;i++)
			{
		    
				data[i]=ne.getDdata(0, i, 0);
				
				for(int r=i+1;r<j;r++)
				{
					data[r]=ne.getDdata(0, r, 0);
					if(data[i]==data[r])
					{
						
						System.out.println(data[r]);
						
					}
					
				}
				
				//System.out.println(data);
		     }
			
		}
		
		
	}
	

}
