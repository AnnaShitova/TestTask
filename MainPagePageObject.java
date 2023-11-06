package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MainPagePageObject {
    private final WebDriver webDriver;

    private By regionSelector = By.tagName("select");
    private By destinitionMenu = By.tagName("nav");
    private By banner = By.xpath(".//img[@alt='Кредит с кешбэком!']");
    private By vacancyButton = By.xpath(".//button[text()='Смотреть вакансии']");

    private By enterButton = By.linkText("Войти");

    private By recomendedProduct = By.xpath(".//h2['Рекомендуемые продукты']");
    private By news = By.xpath(".//h2['Новости']");


    public MainPagePageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String clickOnRegion(){
        webDriver.findElement(regionSelector).click();
        return webDriver.findElement(regionSelector).getText();
    }

    public String destinitionMenuResult(){
        return webDriver.findElement(destinitionMenu).getText();
    }

    public void clickEnterButton(){
        webDriver.findElement(enterButton).click();
    }

    public boolean foundBanner()
    {
        return webDriver.findElement(banner).isDisplayed();
    }

    public String RecomendedProduct()
    {
        return webDriver.findElement(recomendedProduct).getText();
    }

    public void findVacancyInformation()
    {
        WebElement element = webDriver.findElement(vacancyButton);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(vacancyButton).click();
    }

    public boolean foundNews()
    {
        WebElement element = webDriver.findElement(news);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        return webDriver.findElement(news).isDisplayed();
    }
}
