package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;

public class RegisterPage extends  GeneralPage{

    //Locator
    private final By inputEmail = By.xpath("//input[@id='email']");
    private final By inputPass = By.xpath("//input[@id='password']");
    private final By inputConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By inputPID = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By pSuccess = By.xpath("//div[@id='content']/p");


    //Elements
    protected WebElement getInputEmail(){
        return Constant.WEBDRIVER.findElement(inputEmail);
    }

    protected WebElement getInputPass(){
        return Constant.WEBDRIVER.findElement(inputPass);
    }

    protected WebElement getInputConfirmpass(){
        return Constant.WEBDRIVER.findElement(inputConfirmPass);
    }

    protected WebElement getInputPID(){
        return Constant.WEBDRIVER.findElement(inputPID);
    }

    protected WebElement getbtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }

    protected WebElement getpSuccess(){
        return Constant.WEBDRIVER.findElement(pSuccess);
    }

    //Methods
    public RegisterPage regist(String email, String pass, String confirmPass, String pid){
        System.out.println(email);

        System.out.println(pass);

        System.out.println(confirmPass);

        System.out.println(pid);

        this.getInputEmail().sendKeys(email);
        this.getInputPass().sendKeys(pass);
        this.getInputConfirmpass().sendKeys(confirmPass);
        this.getInputPID().sendKeys(pid);

        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("arguments[0].scrollIntoView(true);", this.getbtnRegister());

        this.getbtnRegister().getLocation();
        this.getbtnRegister().click();
        return this;
    }

    public String getMsgSuccess(){
        return this.getpSuccess().getText();
    }
}
