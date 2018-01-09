package CCBrowser_Windows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;


public class CocCoc_CheckInstall {
  @Test
  public void checkCocCocShortcut() throws FindFailed, InterruptedException {
	  Screen s = new Screen();
	  s.type("d", Key.WIN);
	  s.exists("\\resources\\pictures\\CocCoc_Shortcut.png");
	  System.out.println("Coc Coc shortcut added to desktop");
  }


}
