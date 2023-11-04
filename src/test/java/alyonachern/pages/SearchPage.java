package alyonachern.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private SelenideElement content = $("#main-content-id");

    @Step("Проверить заголовок поиска")
    public void checkSearchTitle(String title) {
        content.shouldHave(text(title));
    }

    @Step("Проверить заголовок выдачи")
    public void checkSearchControlPanel(String text) {
        content.shouldHave(text("По запросу «" + text + "» ничего не найдено"));
    }
}
