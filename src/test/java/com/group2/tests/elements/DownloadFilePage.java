package com.group2.tests.elements;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.FileFilters.withExtension;

public class DownloadFilePage {
    SelenideElement downloadTxtFile = $(By.xpath("//div[@class='example']//a[contains(@href,'download/some-file.txt')]"));

    public String downloadFile(String fileName) throws FileNotFoundException {
        Configuration.reportsFolder = "C:\\Wget\\";
        open("https://the-internet.herokuapp.com/download");
        java.io.File downloadedFile = downloadTxtFile.download(3000, withExtension("txt"));
String downloadedFileName = downloadedFile.getName();
        return downloadedFileName;
    }
}