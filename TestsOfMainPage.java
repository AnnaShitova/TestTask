package Tests;

import org.example.MainPagePageObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestsOfMainPage extends TestBase{
    @Test
    public void EnterButtonClick() {
        MainPagePageObject enterButton = new MainPagePageObject(driver);
        enterButton.clickEnterButton();
    }

    @Test
    public void HeaderExists() {
        MainPagePageObject header = new MainPagePageObject(driver);
        String actualSelectVariants = header.clickOnRegion();
        String expectedSelectVariants = "ВНЕ РЕГИОНА\n" +
                "САНКТ-ПЕТЕРБУРГ\n" +
                "ЛЕНИНГРАДСКАЯ ОБЛАСТЬ\n" +
                "МОСКОВСКАЯ ОБЛАСТЬ\n" +
                "НОВОСИБИРСКАЯ ОБЛАСТЬ\n" +
                "КАЛИНИНГРАДСКАЯ ОБЛАСТЬ\n" +
                "КАЛИНИНГРАД\n" +
                "НОВОСИБИРСК\n" +
                "МОСКВА";
        assertEquals(expectedSelectVariants, actualSelectVariants);

        String actualDestinitionMenu = header.destinitionMenuResult();
        String expectedDestinitionMenu = "ЧАСТНЫМ КЛИЕНТАМ\n" +
                "БИЗНЕСУ\n" +
                "ВЭД\n" +
                "ФИНАНСОВЫЕ РЫНКИ\n" +
                "PRIVATE BANKING\n" +
                "ИНВЕСТОРАМ";
        assertEquals(expectedDestinitionMenu, actualDestinitionMenu);
    }

    @Test
    public void BannerExists() {
        MainPagePageObject findBanner = new MainPagePageObject(driver);
        assertTrue(findBanner.foundBanner());
    }

    @Test
    public void RecomendedExists() {
        MainPagePageObject recommended = new MainPagePageObject(driver);
        String expectedNameOfSection = "Рекомендуемые продукты";
        String actualNameOfSection = recommended.RecomendedProduct();
        assertEquals(expectedNameOfSection, actualNameOfSection);
    }

    @Test
    public void FindAndClickVacansies() {
        MainPagePageObject vacancies = new MainPagePageObject(driver);
        vacancies.findVacancyInformation();
    }

    @Test
    public void FindNewd() {
        MainPagePageObject news = new MainPagePageObject(driver);
        news.foundNews();
    }
}