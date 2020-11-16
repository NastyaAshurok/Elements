package com.group2.tests.elements;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.FileFilters.withExtension;

public class DownloadFilePage {
    SelenideElement downloadTxtFile = $(By.xpath("//div[@class='example']//a[contains(@href,'download/some-file.txt')]"));

    public void downloadFile() throws FileNotFoundException {
   /*     // System.setProperty("webdriver.somefile.text", "C:\\some-file.txt"); // нужна ли эта строчка?
        String baseUrl = "https://the-internet.herokuapp.com/download";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.name("https://the-internet.herokuapp.com/download/some-file.txt")); //how to find this link?
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
        driver.close();
    } */
        Configuration.reportsFolder = "C:\\Wget\\";
        open("https://the-internet.herokuapp.com/download");
        downloadTxtFile.download(3000, withExtension("txt"));

    }
}