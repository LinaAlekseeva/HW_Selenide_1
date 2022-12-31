import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SearchCodeForJUnit5 {
    @Test
    void successfulSearchTest() {

        //Open Selenide in GitHub
        open("https://github.com/selenide/selenide");

        // Go to the Wiki section
        $("#wiki-tab").shouldHave(text("Wiki")).click();

        // Find page by text in filter "Soft"
        $("#wiki-pages-filter").setValue("Soft");

        // Make sure the "SoftAssertions" page is listed
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        //Go to page: "SoftAssertions"
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();

        // Open the SoftAssertions page, check that there is an example code for JUnit5 inside
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class")).getSearchCriteria();
    }
}
