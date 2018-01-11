package CCBrowser_Windows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;
import org.sikuli.basics.Settings;
import org.sikuli.script.Region;
import org.sikuli.script.Match;
import org.sikuli.script.ImagePath;


public class CocCoc_Omahacheck {
	
  @Test
  public void checkOmahaClient() throws FindFailed {
	  Screen s = new Screen();
	  Settings set = new Settings();
	 
//	  s.type("d", Key.WIN);
	  s.type("r", Key.WIN);
	  set.MoveMouseDelay = 1;
	  s.type(Key.DELETE); 
	  s.type("src\\main\\resources\\pictures\\CocCoc_OpenRunWindows.png", "%localappdata%");
	  set.MoveMouseDelay = 1;
	  s.type(Key.ENTER);
	  
	  if (s.find("src\\main\\resources\\pictures\\CocCoc_FolderCC.png") != null ) {
		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderCC.png");
		  set.MoveMouseDelay = 1;
		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderUpdate.png");
		  set.MoveMouseDelay = 1;
	      s.exists("src\\main\\resources\\pictures\\CocCoc_FolderOmaha.png");
		  s.hover("src\\main\\resources\\pictures\\CocCoc_CCUpdate.png");
		  set.MoveMouseDelay = 1;
		  s.rightClick("src\\main\\resources\\pictures\\CocCoc_CCUpdate.png");
		  set.MoveMouseDelay = 1;
		  s.click("src\\main\\resources\\pictures\\CocCoc_ClickPropeties.png");
		  set.MoveMouseDelay = 1;
		  s.click("src\\main\\resources\\pictures\\CocCoc_ClickDetail.png");
		  s.find("src\\main\\resources\\pictures\\CocCoc_ProducVersion.png");
		  s.click("src\\main\\resources\\pictures\\CocCoc_ClickBtOK.png");
		  s.click("src\\main\\resources\\pictures\\CocCoc_CloseWindows.png");
		  System.out.println("=================================================");
		  System.out.println("|     < PASSED | Omaha version is correct  >    |");
		  System.out.println("=================================================");	   
	  }  
	  
	  else  {
		  System.out.println("=================================================");
		  System.out.println("|    < FAILSED | Omaha version is incorrect >   |");
		  System.out.println("=================================================");
	  }
	  
			    
/*	  try {
*		  s.find("src\\main\\resources\\pictures\\CocCoc_FolderCC.png");
*		  set.MoveMouseDelay = 1;
*		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderCC.png");
*		  set.MoveMouseDelay = 1;
*		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderUpdate.png");
*		  set.MoveMouseDelay = 1;
*		  s.exists("src\\main\\resources\\pictures\\CocCoc_FolderOmaha.png");
*		  System.out.println("================================");
*		  System.out.println("|     < Check Omaha done >     |");
*		  System.out.println("================================");
*	  }
*	  catch (FindFailed e) {
*		  e.printStackTrace();
*	  	  System.out.println("=============================================");
*	      System.out.println("|   < CocCoc doesn't install on your PC >   |");
*	      System.out.println("=============================================");
*	      }
*/	      
 }  
}