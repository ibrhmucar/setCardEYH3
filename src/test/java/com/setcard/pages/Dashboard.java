package com.setcard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class Dashboard extends BasePage {


    @FindBy(xpath = "(//li[@class='ant-menu-submenu ant-menu-submenu-vertical'])[1]")
    public WebElement menu;

    @FindBy(xpath = "//a[@href='/corporatefirm']")
    public WebElement firmalar;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary addMemberButton btn-block']")
    public WebElement firmaEkle;

    @FindBy(id = "corporateFirmAddForm_CommercialName")
    public WebElement firmaBilgileri;

    @FindBy(id = "corporateFirmAddForm_TaxOffice")
    public WebElement vergiDairesi;

    @FindBy(id = "corporateFirmAddForm_TaxNumber")
    public WebElement vergiNumarası;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']")
    public WebElement ileriButton;

    @FindBy(xpath = "//div[@class='ant-select ant-select-lg ant-select-in-form-item ant-select-single ant-select-allow-clear ant-select-show-arrow']")
    public WebElement dropDown;

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
    public WebElement koc;

    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[2]")
    public WebElement sabanci;

    @FindBy (xpath = "(//button[@type='button'])[3]")
    public WebElement tumunuSec;

    @FindBy (xpath = "(//button[@type='button'])[2]")
    public WebElement tumunuTemizleme;

    @FindBy (xpath = "//span[normalize-space()='Büyük']")
    public WebElement buyuk;

    @FindBy (xpath = "//span[normalize-space()='Küçük']")
    public WebElement kucuk;

    @FindBy (xpath = "//span[normalize-space()='Şirket']")
    public WebElement sirket;

    @FindBy (xpath = "//span[normalize-space()='Personel']")
    public WebElement personel;

    @FindBy (xpath = "//span[normalize-space()='Net']")
    public WebElement net;

    @FindBy (xpath = "//span[normalize-space()='Brüt']")
    public WebElement brut;

    @FindBy (xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']")
    public WebElement next;

    @FindBy (xpath = "//tbody[@class='ant-table-tbody']")
    public List<WebElement> list;

    @FindBy (id = "corporateFirmAddForm_CustomerServiceRepresentativeID")
    public WebElement musteriTemsilcisi;

    @FindBy (id = "corporateFirmAddForm_SalesOfficerID")
    public WebElement satisSorumlusu;

    @FindBy (id = "corporateFirmAddForm_ContractStartDate")
    public WebElement kontratTarihi;

    @FindBy (xpath = "(//span[@class='ant-radio-button'])[7]")
    public WebElement kullaniyor;

    @FindBy (xpath = "(//span[@class='ant-radio-button'])[8]")
    public WebElement kullanmiyor;

    @FindBy (id = "corporateFirmAddForm_CreditPaymentTypeID")
    public WebElement odemeYontemi;

    @FindBy (id = "corporateFirmAddForm_CreditPaymentDueDay")
    public WebElement odemeVadesi;

    @FindBy (id = "corporateFirmAddForm_OrderCreditLimit")
    public WebElement siparisLimiti;

    @FindBy (xpath = "//span[normalize-space()='Gönder']")
    public WebElement gonderButton;

    @FindBy (xpath = "//span[normalize-space()='Evet, gönder']")
    public WebElement evet;

    @FindBy (xpath = "//h1[@id='vergiDiv']")
    public WebElement yeniVergiNumarasi;

    @FindBy (xpath = "//h3[@class='wg-mb-0 wg-mt-auto wg-text-primary wg-text-24 wg-mb-0']")
    public WebElement toplamFirmaSayisi;

    @FindBy (xpath = "//h3[@class='wg-mb-0 wg-mt-auto wg-text-success wg-text-24 wg-mb-0']")
    public WebElement aktifFirmaSayisi;

    @FindBy (xpath = "//h3[@class='wg-mb-0 wg-mt-auto wg-text-danger wg-text-24 wg-mb-0']")
    public WebElement pasifFirmaSayisi;

    @FindBy (xpath = "//h3[@class='wg-mb-0 wg-mt-auto wg-text-secondary wg-text-24 wg-mb-0']")
    public WebElement yemekKartiKullananFirmalar;

    @FindBy (xpath = "//span[@class='ant-select-selection-item']")
    public WebElement sayfaNumarasi;

    @FindBy (xpath = "//div[contains(text(),'100 / sayfa')]")
    public WebElement selectlastPage;

    @FindBy (xpath = "//tbody[@class='ant-table-tbody']")
    public WebElement listofCompany;

    @FindBy (xpath = "//div[@class='ant-notification-notice-message']")
    public WebElement successfullyCreatedMessage;

    @FindBy (xpath = "//span[@class='anticon anticon-close ant-notification-notice-close-icon']//*[name()='svg']")
    public WebElement closeButton;

    @FindBy (xpath = "//span[@aria-label='search']//*[name()='svg']")
    public WebElement searchButton;

    @FindBy (xpath = "//input[@placeholder='Ara']")
    public WebElement searchBox;

    @FindBy (xpath = "//span[normalize-space()='Ara']")
    public WebElement aramaButonu;

    @FindBy (xpath = "//span[@aria-label='calendar']//*[name()='svg']")
    public WebElement tarihButton;

    @FindBy (xpath = "//input[@placeholder='Başlangıç']")
    public WebElement baslangic;

    @FindBy (xpath = "//input[@placeholder='Bitiş']")
    public WebElement bitis;

    @FindBy (xpath = "//td[@title='2023-02-26']")
    public WebElement selectTarih;

    @FindBy (xpath = "//td[@title='2023-02-27']")
    public WebElement select2Tarih;

    @FindBy (xpath = "(//span[@role='button'])[3]")
    public WebElement yemekKartiFiltre;
    @FindBy (xpath = "//span[@class='ant-dropdown-menu-title-content']//span[contains(text(),'Kullanmıyor')]")
    public WebElement kartKullanmiyor;

    @FindBy (xpath = "//button[@type='button']//span[contains(text(),'Tamam')]")
    public WebElement tamamButton;





    public String getNumberOfInformation(WebElement value){


        return value.getText();

    }




}
