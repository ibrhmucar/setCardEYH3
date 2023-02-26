package com.setcard.step_defs;

import com.setcard.pages.Dashboard;
import com.setcard.utilities.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class DashBoardStepDefs {

    Date date = new Date();
    Dashboard dashboard = new Dashboard();

    SetUtil set = new SetUtil();

    String newVergiNumarasi;

    Scenario scenario;

    @Given("User navigate to Firmalar page successfully")
    public void userNavigateToFirmalarPageSuccessfully() {
        BrowserUtils.hover(dashboard.menu);
        BrowserUtils.clickWithJS(dashboard.firmalar);
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("corporatefirm"));
    }

    @And("User can click Firma Ekle button successfully")
    public void userCanClickFirmaEkleButtonSuccessfully() {
        dashboard.firmaEkle.click();
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("corporatefirm"));
    }

    @Given("User get new Vergi Numarası")
    public void userGetNewVergiNumarası() {

        String url = EnvUtil.getFromEnv("url");
        String vergi = EnvUtil.getFromEnv("vergiUrl");
        Driver.get().get(vergi);
        BrowserUtils.waitFor(1);
        newVergiNumarasi= dashboard.yeniVergiNumarasi.getText();
        BrowserUtils.waitFor(2);
        System.out.println(newVergiNumarasi);
        BrowserUtils.switchToWindow(url);
        Driver.get().get(url);

    }

    @Then("Enter all information")
    public void enterAllInformation() {

        LocalDate d = LocalDate.now();

        set.setInfo(dashboard.firmaBilgileri,0,"Unvan");
        set.setInfo(dashboard.vergiDairesi,0,"Vergi Dairesi");

        //dashboard.vergiNumarası.sendKeys(newVergiNumarasi);
        dashboard.vergiNumarası.sendKeys(set.taxNumberConverter("Vergi Numarası"));
        System.out.println(set.taxNumberConverter("Vergi Numarası"));
        dashboard.ileriButton.click();

        dashboard.dropDown.click();

        set.writeOptions("Şirket Grubu");
        set.writeOptions("Sektör");
        set.writeOptions("Segment");
        set.writeOptions("Avantaj Tipi");
        set.writeOptions("Çalışma Şekli");

        dashboard.next.click();

        dashboard.musteriTemsilcisi.click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//div[@title='"+set.getInfo(0,"Müşteri Temsilcisi")+"']//div[1]")).click();
        dashboard.satisSorumlusu.click();
        Driver.get().findElement(By.xpath("(//div[@title='"+set.getInfo(0,"Satış Sorumlusu")+"'])[2]")).click();
        dashboard.kontratTarihi.click();
        Driver.get().findElement(By.xpath("//td[@title='"+d+"']")).click();
        Driver.get().findElement(By.xpath("//span[contains(text(),'"+set.getInfo(0,"Yemek Kartı Kullanımı")+"')]")).click();
        dashboard.next.click();

        dashboard.odemeYontemi.click();
        Driver.get().findElement(By.xpath("//div[contains(text(),'"+set.getInfo(0,"Ödeme Yöntemi")+"')]")).click();

        set.setInfo(dashboard.odemeVadesi,0,"Ödeme Vadesi");
        set.setInfo(dashboard.siparisLimiti,0,"Sipariş Limiti");

        dashboard.next.click();
        BrowserUtils.waitFor(1);
        dashboard.evet.click();
        BrowserUtils.waitFor(2);

    }

    @And("User check the numbers of the company information")
    public void userCheckTheNumbersOfTheCompanyInformation() {
        BrowserUtils.waitFor(1);
        String expectedToplamFirma = dashboard.getNumberOfInformation(dashboard.toplamFirmaSayisi);
        String expectedAktifFirma = dashboard.getNumberOfInformation(dashboard.aktifFirmaSayisi);
        String expectedPasifFirma = dashboard.getNumberOfInformation(dashboard.pasifFirmaSayisi);
        String expectedYemekKartiFirma = dashboard.getNumberOfInformation(dashboard.yemekKartiKullananFirmalar);

        dashboard.sayfaNumarasi.click();
        dashboard.selectlastPage.click();
        BrowserUtils.waitFor(1);

        List<WebElement> allCompanyNumber = Driver.get().findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));

        String actualToplamFirma = String.valueOf(allCompanyNumber.toArray().length);
        Assert.assertTrue(expectedToplamFirma.equals(actualToplamFirma));

        List<String> allCompany = BrowserUtils.getElementsText(allCompanyNumber);

        int aktifCompany=0;
        int pasifCompnay=0;
        int kullanan=0;

        for (String list : allCompany) {
          if(list.contains("Aktif")){
              aktifCompany ++;
          }else if(list.contains("Pasif")) {
              pasifCompnay++;

          }
        }

        for (String list :allCompany){
          if(list.contains("Kullanıyor")){
              kullanan ++;
          }
       }

        System.out.println("aktifCompany = " + aktifCompany);
        System.out.println("pasifCompnay = " + pasifCompnay);
        System.out.println("Kullanan = " + kullanan);

        set.equeals(expectedAktifFirma,Integer.valueOf(aktifCompany).toString());
        set.equeals(expectedYemekKartiFirma,Integer.valueOf(kullanan).toString());
        set.equeals(expectedPasifFirma,Integer.valueOf(pasifCompnay).toString());

        Log4j.info("Check all information successfully");

    }



}
