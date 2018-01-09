package com.testSikuli;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;

public class TestSikuli1 {
	
  @Test
  public void openFileTest() throws FindFailed, InterruptedException {
	  Screen s = new Screen();
//	  s.type("d", Key.WIN);
	  s.exists("\\src\\main\\resources\\pictures\\Notepad_Shortcut.png");
	  s.doubleClick("\\src\\main\\resources\\pictures\\Notepad_Shortcut.png");
	  System.out.println("Notepad shortcut added to desktop");
 }
}
