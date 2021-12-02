import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import methods.Calcpage;

public class calcTest{
 
    	
			@BeforeTest
			public void launchBrowserTest() throws IOException {
				
				Calcpage.launchBrowser();
			}
			
			@Test(priority=1)
			public void selectBuildTest() throws IOException {
          		Calcpage.selectDropdownBuild();
			 
			}
		
			@Test(priority=2)
			public void selectNumerTest() {
          		Calcpage.selectFirstNo();
          		Calcpage.selectSecondNo();
			 
			}
				
			@Test(priority=3)
			public void selectOperastionTest() {
          		Calcpage.selectOperation();
			}
			
			@Test(priority=5)
			public void selectAnuswerTest() {
          		Calcpage.validateAnswer();
			 
			}
			
			@Test(priority=6)
			public void selectIntegertextBoxAndClearButtonTest() {
          		Calcpage.selectIntegerOnlyAndClearBtn();
			 
			}
		
			
		
}
			