package by.pizzatempo.tests;

import by.pizzatempo.pages.MenuMessage;
import by.pizzatempo.pages.MenuPage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {
    private MenuPage menuPage;

    @BeforeMethod
    public void setUpOrderPage() {
        menuPage = new MenuPage(driver);
        menuPage.clickButtonPizza();
    }

    @Test(description = "Добавление пиццы в корзину")
    public void testAddPizzatoBasket() {
        menuPage
                .addToBasketMargarita()
                .confirmAddToBasketMargarita()
                .clickButtonBasket();

        Assertions.assertEquals(menuPage.getTextPizzaMargarita(), MenuMessage.TEXT_PIZZA_MARGARITA_IN_BASKET);
    }

    @Test(description = "Добавление пиццы и напитка в корзину")
    public void testAddPizzaAndDrinksToBasket() {
        menuPage
                .addToBasketMargarita()
                .confirmAddToBasketMargarita()
                .clickButtonDrinks()
                .addToBasketDrinksKvas()
                .clickButtonBasket();

        Assertions.assertEquals(menuPage.getTextPizzaMargarita(), MenuMessage.TEXT_PIZZA_MARGARITA_IN_BASKET);
        Assertions.assertEquals(menuPage.getTextDrinksKvas(), MenuMessage.TEXT_DRINKS_KVAS_IN_BASKET);
    }
}
