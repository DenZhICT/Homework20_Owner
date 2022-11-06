package guru.qa.tests;

import guru.qa.pages.RegFormPage;
import guru.qa.restaker.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class ToolsQATest extends TestBase {
    String site = "https://demoqa.com/automation-practice-form";
    TestData data = new TestData();
    RegFormPage autoPracticeForm = new RegFormPage();

    public ToolsQATest() throws Exception {
    }

    @DisplayName("Fill registration form on https://demoqa.com/automation-practice-form and check result")
    @Test
    void check() {
        step("Open " + site, () -> {
            autoPracticeForm.openPage();
        });
        step("Fill registration form", () -> {
            autoPracticeForm.fillPageForm(data);
        });
        step("Check result", () -> {
            autoPracticeForm.checkPageForm(data);
        });

    }
}


