package com.project.tests;

import com.project.pages.LoginPage;
import com.project.utils.PropertiesLoader;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.screenshot;

public class LoginTests {

    LoginPage loginPage;

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    @Before
    public void setUp() {
        loginPage = new LoginPage();
    }

    @Test
    public void loginPositiveTest() {
        loginPage.clickOnLoginTab();
        loginPage.with(validEmail, validPassword);
        loginPage.validLogin();
    }

    @Test
    public void loginWithInvalidPassword() {
        loginPage.clickOnLoginTab();
        loginPage.with(validEmail,"a1234567$");
        loginPage.invalidLogin();
    }

}
