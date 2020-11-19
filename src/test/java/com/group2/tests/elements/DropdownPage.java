package com.group2.tests.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class DropdownPage {
    SelenideElement dropdownElement = $(By.id("dropdown"));
    public String dropdownSelection(String option) {
        open("https://the-internet.herokuapp.com/dropdown");
        dropdownElement.selectOption(option);
        String result = dropdownElement.getSelectedText();
        return result;
    }
}

