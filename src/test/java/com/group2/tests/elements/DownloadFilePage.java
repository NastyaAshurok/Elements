package com.group2.tests.elements;
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class DownloadFilePage {
    public void downloadFile()  {
        // System.setProperty("webdriver.somefile.text", "C:\\some-file.txt"); // нужна ли эта строчка?
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
    }

}