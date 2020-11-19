package com.group2.tests.elements;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class FramesPage {
    SelenideElement iFrameElement= $(By.xpath("//div[@class='example']//a[contains(@href,'/iframe')]"));
    SelenideElement closePopUpButton= $(By.xpath("//button[@role='presentation']"));
    SelenideElement textBody= $(By.xpath("//iframe[@id='mce_0_ifr']"));
    private By iFrame = By.id("mce_0_ifr");
    private By textBodyFrame = By.id("tinymce");
    private By returnValueBackButton = By.xpath("//button[@role='c']//i[contains(@class,'mce-i-undo')]");

    public void iFrameAddText(String textForInput) {
        open("https://the-internet.herokuapp.com/frames");
        iFrameElement.click();
        closePopUpButton.click();
        switchTo(iFrame); ///???
        $(textBodyFrame).val(textForInput);
        $(returnValueBackButton).click();
        //textBody.setValue(textForInput);
    }

    /* private void switchTo(By iFrame) {


    }*/
}
