package com.project.tests;

import com.project.pages.AddPage;
import com.project.pages.ContactsPage;
import com.project.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import com.project.utils.PropertiesLoader;

public class CreateContactTest {

    ContactsPage contactsPage;
    LoginPage loginPage;
    AddPage addPage;

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    @Before
    public void ensurePreconditions() {
        contactsPage = new ContactsPage();
        loginPage = new LoginPage();
        loginPage.clickOnLoginTab();
        loginPage.with(validEmail, validPassword);
        loginPage.validLogin();
        addPage = new AddPage();

    }

    @Test
    public void createNewContactTest() {
        addPage.clickAddTab();
        addPage.fillInContactForm("Olga", "Korsa", "+493245367", "ss@ss.com", "MaxStr. 134", "business partner");
        addPage.clickSaveButton();
        contactsPage.isContactCreated("+493245367");
    }

}
