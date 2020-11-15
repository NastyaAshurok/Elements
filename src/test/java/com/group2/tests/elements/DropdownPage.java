package com.group2.tests.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class DropdownPage {

    WebDriver driver = new ChromeDriver();
    Select dropdownElement = new Select(driver.findElement(By.id("dropdown")));
    public void dropdownSelection(int index) {
        open("https://the-internet.herokuapp.com/dropdown");
        dropdownElement.selectByIndex(index);
        List<WebElement> allValues = dropdownElement.getAllSelectedOptions();
        System.out.println(allValues);
    }
}

