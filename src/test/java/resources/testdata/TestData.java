package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobSearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill|"},
                {"Development Manager","Wembley","up to 7 miles","50000","70000","Per annum","Permanent","Permanent Developer jobs in Wembley,Greater London"},
                {"Teacher","Edgware","up to 5 miles","35000","37000","Per annum","Permanent","Permanent Teacher jobs in Edgware,Greater London"},
                {"Store Manager","Stanmore","up to 5 miles","48000","62000","Per annum","Permanent","Permanent Store Manager jobs in Stanmore,Greater London"},
                {"Marketing Executive","Harrow Weald","up to 10 miles","30000","45000","Per annum","Permanent","Permanent Marketing Executive jobs in Harrow Weald, Greater London"},
                {"QA Analyst","Harrowgate","up to 5 miles","35000","40000","Per annum","Permanent","Permanent QA Analyst jobs in Harrogate,North Yorkshire"},

        };
        return data;

    }



}
