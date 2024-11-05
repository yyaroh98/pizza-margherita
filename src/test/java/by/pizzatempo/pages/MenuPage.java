package by.pizzatempo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public MenuPage clickButtonPizza() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_MENU_PIZZA)).click();
        return this;
    }

    public MenuPage addToBasketMargarita() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_ADD_TO_BASKET_PIZZA_MARGARITA)).click();
        return this;
    }

    public MenuPage confirmAddToBasketMargarita() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_CONFIRM_ADD_TO_BASKET_PIZZA_MARGARITA)).click();
        return this;
    }

    public MenuPage clickButtonBasket() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_BASKET)).click();
        return this;
    }

    public String getTextPizzaMargarita() {
        return driver.findElement(By.xpath(MenuXpath.TEXT_PIZZA_MARGARITA)).getText();
    }

    public MenuPage addToBasketDrinksKvas() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_ADD_TO_BASKET_DRINKS)).click();
        return this;
    }

    public MenuPage clickButtonDrinks() {
        driver.findElement(By.xpath(MenuXpath.BUTTON_MENU_DRINKS)).click();
        return this;
    }

    public String getTextDrinksKvas() {
        return driver.findElement(By.xpath(MenuXpath.TEXT_DRINKS_KVAS)).getText();
    }
}
