package com.tech.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sridhar Bandi on 28/01/19.
 */
public class SearchResultsPage {

    private WebDriver _driver = null;

    @FindBy(partialLinkText = "Selenium")
    public WebElement _lnkSelenium;

    public SearchResultsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }

}
