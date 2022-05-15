package com.project.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.prompt;

public class AddPage extends PageBase{

    private By addTabLocator = By.xpath("//a[contains(text(),'ADD')]");
    private By nameLoc = By.cssSelector("input:nth-child(1)");
    private By lastNameLoc = By.cssSelector("input:nth-child(2)");
    private By phoneLoc = By.cssSelector("input:nth-child(3)");
    private By emailLoc = By.cssSelector("input:nth-child(4)");
    private By addressLoc = By.cssSelector("input:nth-child(5)");
    private By descriptionLoc = By.cssSelector("input:nth-child(6)");
    private By saveButton = By.cssSelector(".add_form__2rsm2 button");

    public void clickAddTab() {
        $(addTabLocator).click();
    }


    public void fillInContactForm (String name, String lastName, String phone, String email, String address, String description) {
        $(nameLoc).val(name);
        $(lastNameLoc).val(lastName);
        $(phoneLoc).val(phone);
        $(emailLoc).val(email);
        $(addressLoc).val(address);
        $(descriptionLoc).val(description);
    }

    public void clickSaveButton() {
        $(saveButton).click();
    }
}
