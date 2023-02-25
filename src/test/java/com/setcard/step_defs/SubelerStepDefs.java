package com.setcard.step_defs;

import com.setcard.pages.Dashboard;
import com.setcard.pages.Subeler;
import com.setcard.utilities.BrowserUtils;
import com.setcard.utilities.SetUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SubelerStepDefs {

    Subeler sube = new Subeler();
    Dashboard dashboard = new Dashboard();

    SetUtil set = new SetUtil();
    @Then("User navigate to Subeler page successfully")
    public void userNavigateToSubelerPageSuccessfully() {
        BrowserUtils.hover(dashboard.menu);
        BrowserUtils.hover(sube.subeler);
        BrowserUtils.clickWithJS(sube.subeler);
        BrowserUtils.waitFor(1);
    }

    @And("User enter information in search box")
    public void userEnterInformationInSearchBox() {

        String vergiNumarasi = set.taxNumberConverter("Vergi Numarası");
        set.setInfoVergi(sube.enterInformation,vergiNumarasi);
        sube.taxNumberDropDown(vergiNumarasi);
        sube.button("Şubeleri Listele");
        BrowserUtils.waitFor(1);

    }

    @Then("User can see all branches successfully or can add branches successfully")
    public void userCanSeeAllBranchesSuccessfullyOrCanAddBranchesSuccessfully() {

        if(sube.warningMessage.isEnabled()){
        String warning = sube.warningMessage.getText();
        System.out.println(warning);
        Assert.assertTrue(warning.equals("Şube Bulunamadı"));
        sube.button("Şube Ekle");

        }else if(!sube.warningMessage.isEnabled()){

        }



    }
}
