package ROBOTAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.input.Input;
import org.openqa.selenium.devtools.v124.input.model.MouseButton;

import com.aventstack.extentreports.gherkin.model.But;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
public class RobotApiDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
    	
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zamzar.com/convert/pdf-to-xls/"); // sample url
        driver.findElement(By.xpath("//button[@id='btn-input-file']")).click();
//        driver.findElement(By.linkText("Courses")).click();
//        Robot robot = new Robot();  // Robot class throws AWT Exception
//        Thread.sleep(4000);
//        robot.keyPress(KeyEvent.VK_DOWN);// moving the keyboard key down.
//        Thread.sleep(4000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(4000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(4000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(4000);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        System.out.println("a");
//        
//        robot.keyPress(KeyEvent.VK_TAB);//pressing the tab key
//        Thread.sleep(4000);
//        System.out.println("b");
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(4000);
//        System.out.println("c");
//        robot.mouseMove(30, 100);//moving the mouse.
//        Thread.sleep(4000);
///        System.out.println("d");
        try {
        StringSelection ss = new StringSelection("‪‪‪C:\\Users\\gnane\\Household_Inventory_List_V1.0.xls");//about clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
        
        Thread.sleep(3000);
        
        Robot rb = new Robot();
        //KeyBoard action: cntl+v
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
       
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
      
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER); 
        }
        catch(Exception e) {
        	System.out.println("file not uploaded");
        }
    }
}
