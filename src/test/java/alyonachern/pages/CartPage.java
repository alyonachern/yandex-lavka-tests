package alyonachern.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private SelenideElement cartHeader = $(".lhyihcq");

    @Step("Проверить, что в корзине отображается заголовок {cartTitle}")
    public void checkCartTitleText(String cartTitle) {
        cartHeader.shouldHave(text(cartTitle));
    }
}
