package page.index.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import page.Base;


public class Header extends Base {
    /* Данный класс используется,для реализации выполняемых действия для тестирования Header сайта*/
    private String url = "http://localhost:3000/";
    private String pathSearch = "//input[@class='Header_input_search__+cGOK']";
    private String pathCloseButtonNotActive = "//div[@class='Header_input_delete__ZwrxE']";
    private String pathCloseButtonActive = "//div[@class='Header_input_delete__ZwrxE Header_input_dispaly__7BKTn']";

    public String getTextSearch(String arg){


        setURL(url);
        setText(pathSearch,arg);
        String response = driver.findElement(By.xpath(pathSearch)).getAttribute("value");
        return response;
    }

    public boolean getCloseButtonNotActive1(){

        setURL(url);
        boolean response = driver.findElement(By.xpath(pathCloseButtonNotActive)).isDisplayed();
        return response;
    }

    public boolean getCloseButtonNotActive2(){
        setURL(url);
        click(pathSearch);
        boolean response = driver.findElement(By.xpath(pathCloseButtonNotActive)).isDisplayed();
        return response;
    }

    public boolean getCloseButtonActive(){
        setURL(url);
        setText(pathSearch,"Test");
        boolean response = driver.findElement(By.xpath(pathCloseButtonActive)).isDisplayed();

        return response;
    }

    public boolean getCloseButtonNotActive3() {
        setURL(url);
        click(pathSearch);
        String value = "Test";
        setText(pathSearch,value);
        for(int i = 0;i<value.length();i++){
            driver.findElement(By.xpath(pathSearch)).sendKeys(Keys.BACK_SPACE);
        }
        boolean response = driver.findElement(By.xpath(pathCloseButtonNotActive)).isDisplayed();
        return response;


    }
}
