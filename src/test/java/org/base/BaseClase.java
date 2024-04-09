package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert ;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions ;
import org.openqa.selenium.support.ui.Select;
import com.fasterxml.jackson.annotation.JacksonInject.Value;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClase {

	public static WebDriver driver;
	public static Actions a;
	public static Alert b;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	
	public static void chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void lanchURL(String URL) {
		driver.get(URL);
	}
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void  pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void fillTextBox(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void buttonclick(WebElement ele) {
		ele.click();
	}
	public static void moveToElement(WebElement element) {
		
		a= new Actions (driver);
		a.moveToElement(element).perform();
	}
	public static void dragAnddrop(WebElement src, WebElement dec) {
		a.dragAndDrop(src, dec).perform();
	}
	public static void doubleclick(WebElement click) {
		a.doubleClick().perform();
	}
	public static void contextclick(WebElement click) {
		a.contextClick().perform();
	}
	public static void paste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	// Alert
	public static void getText() {
		Alert b = driver.switchTo().alert();
		
		String text = b.getText();
		System.out.println(text);
	}	
	public static void dismiss() {
		b.dismiss();
	}
	public static void accept() {
		b.accept();
	}
	// java script
	public static void sendkey(WebElement element, String value) {
		js= (JavascriptExecutor) driver;
		js.executeScript(value, element);
	}
	public static void click(WebElement element, String value) {
		js.executeScript(value, element);
	}
	public static void getattribute(WebElement element, String value) {
		Object attribute = js.executeScript(value,element);
		System.out.println(attribute);
	}
	//screenshot
	public static void screenshot(String value) throws IOException {
		ts = (TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dec =new File(value);
		FileUtils.copyFile(src, dec);
	}
	// exception handling
	public static void getwindowhandle() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
	}
	public static void getwindowshandle() {
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);
	}
	public static void selectbyvalue(WebElement value, String value1) {
		Select selectvalue = new Select(value);
		selectvalue.selectByValue(value1);
	}
	public static void selectbyvisibletext(WebElement value,String value1) {
		Select selecttext = new Select(value);
		selecttext.selectByVisibleText(value1);
	}
	public static void selectbyindex(WebElement value, int value1) {
		Select selectindex = new Select(value);
		selectindex.selectByIndex(value1);
	}
	public static void getoption() {
		Select Selectoption = new Select(driver.findElement(By.id("Search")));
		List<WebElement> elementCount = Selectoption.getOptions();
		System.out.println(elementCount.size());
	}
	public static void deselectbyvalue(WebElement value,String value1) {
		Select selectvalue = new Select(value);
		selectvalue.selectByValue(value1);
	}
	public static void deselectbyvisibletext(WebElement value, String value1) {
		Select selecttext = new Select(value);
		selecttext.selectByVisibleText(value1);
	}
	public static void deselectbyindex(WebElement value,int value1) {
		Select selectindex = new Select(value);
		selectindex.selectByIndex(value1);
	}
	public static void scrollupanddown(WebElement element, String value) {
		js.executeScript(value, element);
	}
	public static void ismultiply(WebElement ismultiple) {
		Select S = new Select(ismultiple);
		boolean multiple = S.isMultiple();
		System.out.println(multiple);
	}
	//public static void getfirstSelect() {
		//WebElement getfse = S.getFirstSelectedOption();
		//System.out.println(getfse.getText());}
	//public static void deselect() {
		//S.deselectAll();}	
	//public static void getallselect() {
	//List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
	//for(WebElement selectopt : allSelectedOptions) {
		//System.out.println(selectopt);}}
	public static void framesindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameid(String id) {
		driver.switchTo().frame(id);
	}
	public static void Framename(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void Frameelement(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	public static void WindowURL(String URL) {
		driver.switchTo().window(URL);
	}
	public static void WindowTitle(String Title) {
		driver.switchTo().window(Title);
	}
	public static void Win(String WindowsID) {
		driver.switchTo().window(WindowsID);
	}
	public static void thread(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public static void wait1(long time,TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);
	}
}

	
		

	


