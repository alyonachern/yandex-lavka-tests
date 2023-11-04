package alyonachern.tests;

import alyonachern.pages.MainPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Главная страница")
public class MainPageTests extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("На главной странице есть кнопка каталога")
    void checkCatalogButtonTest() {
        mainPage.openMainPage()
                .checkCatalogVisible();
    }

    @Test
    @DisplayName("На главной странице есть подсказка про демо-каталог")
    void checkTextInDemoCatalogPopupTest() {
        mainPage.openMainPage()
                .checkTextInDemoCatalogPopup();
    }
}
