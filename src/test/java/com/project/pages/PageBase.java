package com.project.pages;

import com.project.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.open;

public class PageBase {

    private static String url = PropertiesLoader.loadProperty("url");

    public PageBase() {
        open(url);
    }
}
