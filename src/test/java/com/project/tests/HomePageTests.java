package com.project.tests;

import com.project.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTests {
    HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage();
    }

    @Test
    public void getHomePage() {
        homePage.isComponentPresent();
    }

}
