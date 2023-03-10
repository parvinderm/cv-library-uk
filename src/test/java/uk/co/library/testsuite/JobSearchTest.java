package uk.co.library.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
   HomePage homePage=new HomePage();
   ResultPage resultPage = new ResultPage();
   @BeforeMethod
    public void inIt(){
      homePage= new HomePage();
      resultPage= new ResultPage();

    }


    @Test(dataProvider = "JobSearch",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {
//       homePage.clickOnAcceptAllCookies();
        homePage.acceptCookiesandSwitchToFrame();
       homePage.enterJobTitle(jobTitle);
       homePage.enterLocation(location);
       homePage.selectDistanceFromDropDown(distance);
       homePage.clickOnMoreSearchOptionLink();
       homePage.enterMinSalary(salaryMin);
       homePage.enterMaxSalary(salaryMax);
       homePage.selectSalaryType(salaryType);
       homePage.selectJobType(jobType);
       homePage.clickOnFindJobsButton();
       resultPage.verifyTheResultText(result);
//       String actualMessage=resultPage.getResultPerPage();
//       String expectedMessage= " Result Per Page ";
//        Assert.assertEquals(actualMessage,expectedMessage,"Verified Result Per Page");

    }
}
