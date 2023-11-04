package alyonachern.tests;

import alyonachern.pages.CartPage;
import alyonachern.pages.MainPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Корзина")
public class CartTests extends BaseTest {

    MainPage mainPage = new MainPage();
    CartPage cartPage = new CartPage();

    private String cartText = "В вашей корзине\n" +
            "пока пусто";

    @Test
    @DisplayName("Отображение корзины незарегистрированного пользователя")
    public void checkCartOfNonRegTest() {
        mainPage.openMainPage()
                .clickOnCartIcon();

        cartPage.checkCartTitleText(cartText);
    }
}
