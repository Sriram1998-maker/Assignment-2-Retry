package homeassignmentretry;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Checkbox {

		public static void main(String[] args) {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/checkbox.xhtml");
			driver.findElement(By.xpath("(//span[normalize-space()='Basic'])[1]")).click();
			driver.findElement(By.xpath("(//span[normalize-space()='Ajax'])[1]")).click();
			driver.findElement(By.xpath("(//label[normalize-space()='Java'])[1]")).click();
			driver.findElement(By.xpath("(//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]'])[1]")).click();
			driver.findElement(By.xpath("(//div[@class='ui-toggleswitch-slider'])[1]")).click();
			boolean disable= driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt102'])[1]")).isDisplayed();
			System.out.println(disable);
			driver.findElement(By.xpath("(//ul[@data-label='Cities'])[1]")).click();
			driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
			driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]")).click();    

		}

	}

