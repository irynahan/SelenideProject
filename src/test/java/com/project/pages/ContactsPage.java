package com.project.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactsPage extends PageBase {

    private By contact = By.cssSelector("h3");

    public void isContactCreated(String text) {
        String res = $$(contact).last().getText();
        Assert.assertEquals(res, text);
    }
}
