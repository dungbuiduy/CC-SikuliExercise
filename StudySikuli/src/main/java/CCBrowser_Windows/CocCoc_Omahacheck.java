package CCBrowser_Windows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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
	  try {
		  s.find("src\\main\\resources\\pictures\\CocCoc_FolderCC.png");
		  set.MoveMouseDelay = 1;
		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderCC.png");
		  set.MoveMouseDelay = 1;
		  s.doubleClick("src\\main\\resources\\pictures\\CocCoc_FolderUpdate.png");
		  set.MoveMouseDelay = 1;
		  s.exists("src\\main\\resources\\pictures\\CocCoc_Omaha.png");
		  System.out.println("================================");
		  System.out.println("|     < Check Omaha done >     |");
		  System.out.println("================================");
	  }
	  catch (FindFailed e) {
		  e.printStackTrace();
	  	  System.out.println("=============================================");
	      System.out.println("|   < CocCoc doesn't install on your PC >   |");
	      System.out.println("=============================================");
	      }
	      
 }  
}