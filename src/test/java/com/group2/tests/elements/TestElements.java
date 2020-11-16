package com.group2.tests.elements;

import org.testng.annotations.Test;

public class TestElements {
    DropdownPage dropdownPage = new DropdownPage();
    DownloadFilePage downloadFilePage = new DownloadFilePage();

    @Test
    public void dropdownSelectionByOption(){
        dropdownPage.dropdownSelection("Option 2");
    }

    @Test
    public void downloadTxtFile(){
        downloadFilePage.downloadFile();
    }

}

