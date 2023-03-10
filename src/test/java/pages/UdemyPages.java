package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UdemyPages {
public UdemyPages(){
   PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(xpath ="//button[text()='Log In']")
  public WebElement loginbuttonHomePage ;

}
