package com.group2.tests.elements;

import com.codeborne.selenide.Condition;
//import jdk.internal.module.ModuleHashesBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileNotFoundException;

public class TestElements {
    DropdownPage dropdownPage = new DropdownPage();
    DownloadFilePage downloadFilePage = new DownloadFilePage();
    FramesPage framesPage = new FramesPage();


    @Test
    public void dropdownSelectionByOption(){
        SoftAssert softAssert = new SoftAssert();
        dropdownPage.dropdownSelection("Option 2");
       // Assert.assertEquals(dropdownPage.dropdownSelection("Option 2"),"Option 2", "Option is Not selected"); //???
    }

    @Test
    public void downloadTxtFile(String filename) throws FileNotFoundException {
        SoftAssert softAssert = new SoftAssert();
       String fileName = "some-file.txt";
        downloadFilePage.downloadFile(fileName);
       // Assert.assertTrue(downloadFilePage.downloadFile(fileName),"some-file.txt" + fileName + "isn't found on page"); //???
    }

    @Test
    public void iFrameInputText(){
        SoftAssert softAssert = new SoftAssert();
        framesPage.iFrameAddText("123");
        //String textBody = framesPage.textBody;
        Assert.assertTrue(framesPage.textBody.has(Condition.attribute("123")));
    }

}

