package com.group2.tests.elements;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestElements {
    DropdownPage dropdownPage = new DropdownPage();
    DownloadFilePage downloadFilePage = new DownloadFilePage();

    @Test
    public void dropdownSelectionByOption(){
        dropdownPage.dropdownSelection("Option 2");
    }

    @Test
    public void downloadTxtFile() throws FileNotFoundException {
        downloadFilePage.downloadFile();
    }

}

