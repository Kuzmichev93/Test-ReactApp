package page;

import config.Conftest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base extends Conftest {
    /*Данный класс используется,как предварительное условие для тест кейса*/

    public void setURL(String url){
        driver.get(url);
    }

    public void setText(String path,String str){
        driver.findElement(By.xpath(path)).sendKeys(str);
    }

    public void click(String path){
        driver.findElement(By.xpath(path)).click();
    }



}
