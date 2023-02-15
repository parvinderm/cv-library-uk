package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;
    @FindBy(xpath ="//span[contains(text(),'Accept All')]")
    WebElement AcceptAll;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void acceptCookiesandSwitchToFrame() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        Thread.sleep(500);
       WebElement acceptCookies =driver.findElement(By.xpath("//span[contains(text(),'Accept All')]"));
        acceptCookies.click();
    }
    public void clickOnAcceptAll(){
        clickOnElement(AcceptAll);
    }
    public void clickOnCVLibrarayCookies(){
        log.info("clicking on Accept All Cookies"+AcceptAll.toString());
      clickOnElement(AcceptAll);
    }
    public void enterJobTitle(String jobTitle){
        log.info("click on job title"+ jobTitle.toString());
        sendTextToElement(JobTitle,jobTitle);
    }
    public void enterLocation(String location){
        log.info("Click on Location "+location.toString());
        sendTextToElement(Location,location);
    }
    public void selectDistanceFromDropDown(String distance){
      log.info("clicking on distance"+distanceDropdown.toString());
    selectByVisibleTextFromDropDown(distanceDropdown,distance);

    }
    public void clickOnMoreSearchOptionLink(){
        log.info("Clicking on More Search Option link "+moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        log.info("click on min salary "+salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary) {
        log.info("click on max salary " + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        log.info("click on salary type "+salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        log.info("click on job type"+jobTypeDropDown.toString());
       selectByValueFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        log.info("Clicking on Find Jobs Button"+findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }




}