package CCBrowser_Windows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;
import org.sikuli.script.Region;
import org.sikuli.script.Match;

public class CocCoc_CheckInstall {
	
  @Test
  public void checkCocCocShortcut() {
	  Screen s = new Screen();
	  
	  s.type("d", Key.WIN); 
	  if (s.exists("src\\main\\resources\\pictures\\CocCoc_Shortcut.png") != null) {
		  System.out.println("=====================================");
		  System.out.println("| Coc Coc shortcut added to desktop |");
	      System.out.println("=====================================");
	  }
	  else {
		  System.out.println("=====================================");
		  System.out.println("|  CocCoc shortcut find not found   |");
		  System.out.println("=====================================");  
  }
}
}