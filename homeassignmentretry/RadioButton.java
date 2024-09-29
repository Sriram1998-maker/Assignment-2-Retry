package homeassignmentretry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	 public static void main(String[] args) {
	        ChromeDriver driver = new ChromeDriver();
	            driver.get("https://www.leafground.com/radio.xhtml");
	            driver.manage().window().maximize();
	            WebElement favoriteBrowser = driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::input"));
	            favoriteBrowser.click();
	            System.out.println("Selected 'Your most favourite browser': Chrome");
	            favoriteBrowser.click();
	            if (favoriteBrowser.isSelected()) {
	                System.out.println("The radio button 'Chrome' is still selected.");
	            } else {
	                System.out.println("The radio button 'Chrome' is now unselected.");
	            }
	            WebElement selectedAgeGroup = driver.findElement(By.xpath("//input[@name='age' and @checked]/following-sibling::label"));
	            System.out.println("Initially selected age group: " + selectedAgeGroup.getText());
	            WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::input"));
	            if (!ageGroup.isSelected()) {
	                ageGroup.click();
	                System.out.println("Selected the age group: 21-40 Years");
	            } else {
	                System.out.println("The age group '21-40 Years' was already selected.");
	            }

	            driver.quit();
	        }
	}

