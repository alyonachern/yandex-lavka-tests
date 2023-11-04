package alyonachern.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private SelenideElement catalogButton = $("button[aria-label=\"Каталог\"]"),
    demoCatalogPopUp = $("[data-testid-item=\"demo-catalog-popup\"]"),
    searchBar = $("#search-input-id"),
    cartIcon = $(".hg1jcme");

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Проверить, что кнопка каталога отображается")
    public void checkCatalogVisible() {
        catalogButton.shouldBe(visible);
    }

    @Step("Проверить текст в подсказке демо-каталога")
    public void checkTextInDemoCatalogPopup() {
        demoCatalogPopUp.shouldHave(text("Это демо-каталог. Укажите адрес, чтобы посмотреть настоящий"));
    }

    @Step("В поле поиска ввести {searchText}")
    public void search(String searchText) {
        searchBar.click();
        searchBar.setValue(searchText).pressEnter();
    }

    @Step("Кликнуть на иконку корзины")
    public void clickOnCartIcon() {
        cartIcon.click();
    }
}
