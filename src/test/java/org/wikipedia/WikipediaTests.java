package org.wikipedia;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikipediaTests extends TestBase{
    @Test
    @DisplayName("Проверка загрузки стартовых страниц")
    void searchTest() {
        step("Загрузка первой страницы", () ->
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("The Free Encyclopedia …in over 300 languages")));
        step("Загрузка второй страницы", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("New ways to explore"));
        });
        step("Загрузка третьей страницы", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Reading lists with sync"));
        });
        step("Загрузка четвёртой страницы", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Send anonymous data"));
        });
        step("Нажимаем 'Начать'", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).
                    shouldBe(visible);
        });
    }
}
