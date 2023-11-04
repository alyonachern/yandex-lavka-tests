package alyonachern.tests;

import alyonachern.pages.MainPage;
import alyonachern.pages.SearchPage;
import alyonachern.utils.RandomDataUtils;
import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@Feature("Поисковая выдача")
public class SearchPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    RandomDataUtils ru = new RandomDataUtils();

    @ParameterizedTest(name = "При успешном поиске {0} на странице поиска отображается заголовок {1}")
    @CsvSource(value = {"сахар, Вот что мы нашли по запросу «сахар»", "сливки, Вот что мы нашли по запросу «сливки»"})
    void checkSearchTest(String searchText) {
        mainPage.openMainPage()
                .search(searchText);

        searchPage.checkSearchTitle(searchText);
    }

    @ParameterizedTest(name = "При неуспешном поиске отображается заголовок \"ничего не найдено\"")
    @ValueSource(strings = {"олололол", "kjshdfkhsd"})
    void checkSearchControlTest(String searchText) {
        mainPage.openMainPage()
                .search(searchText);

        searchPage.checkSearchControlPanel(searchText);
    }
}
