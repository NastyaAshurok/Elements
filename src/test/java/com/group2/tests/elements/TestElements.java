package com.group2.tests.elements;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Data
public class TestElements {
    DropdownPage dropdownPage = new DropdownPage();

    @Test
    public void dropdownSelectionByIndex(){
        dropdownPage.dropdownSelection(1);
    }

}

