package com.setcard.utilities;

import com.setcard.pages.Dashboard;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class SetUtil {

    Dashboard dash = new Dashboard();

    String companyName;
    public  ExcelUtil excelUtil = new ExcelUtil("src/test/resources/SetCardInfo.xlsx", "Info");
    public  List<Map<String, String>> dataList = excelUtil.getDataList();


 public void setInfo (WebElement locater, int rowNumber, String columName){

       locater.sendKeys(dataList.get(rowNumber).get(columName));


 }

    public void setInfoVergi (WebElement locater, String value){

        locater.sendKeys(value);


    }




    //Negatif Senaryo da Kullanılacaktır.

    public String taxNumberConverter(String value){

         String vergiNumarasi = (dataList.get(0).get(value));
         String yeniNumara = vergiNumarasi.replace(".", "");
         String newNumber = yeniNumara.substring(0,10);

         return newNumber;
    }


    public void writeOptions (String options) {

        String value = dataList.get(0).get(options);

        switch (value) {

            case  "Koç":
                dash.koc.click();
                break;
            case  "Sabancı":
                dash.sabanci.click();
                break;
            case "Tümünü Seç":
                dash.tumunuSec.click();
                break;
            case "Tümünü Temizle":
                dash.tumunuTemizleme.click();
                break;
            case "Küçük":
                dash.kucuk.click();
                break;
            case "Büyük":
                dash.buyuk.click();
                break;
            case "Personel":
                dash.personel.click();
                break;
            case "Şirket":
                dash.sirket.click();
                break;
            case "Brüt":
                dash.brut.click();
                break;
            case "Net":
                dash.net.click();
                break;
            case "Kullanıyor":
                dash.kullaniyor.click();
                break;
            case "Kullanmıyor":
                dash.kullanmiyor.click();
                break;


        }
    }

    public String getInfo (int rowNumber, String value){

      return  dataList.get(rowNumber).get(value);
    }

    public WebElement locate (String value){
       return  Driver.get().findElement(By.xpath("//div[@title='"+getInfo(0,value)+"']//div[1]"));
    }

    public void equeals (String value1, String value2){

        Assert.assertTrue(value1.equals(value2));

    }

    public WebElement getWarning (String value){

       return Driver.get().findElement(By.xpath("//div[@class='ant-form-item-explain-error' and contains(text(),'"+value+"')]"));

    }

   public void getWarningAlertMessage (String aa){

     String value = getWarning(aa).getText();
     System.out.println(value);
     System.out.println(aa);
     Assert.assertTrue(value.equals(aa));
   }

   public void clickClose(){

       for (int i = 1; i <= 3; i++) {
            Driver.get().findElement(By.xpath("(//span[@class='anticon anticon-close ant-notification-notice-close-icon']//*[name()='svg'])["+i+"]")).click();

       }

   }

   public String searchResult (){

       List<WebElement> allCompanyNumber = Driver.get().findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
       companyName = allCompanyNumber.get(0).getText();
       return  companyName;
   }

   public String searchResultGetting(int number){
       searchResult();

       String [] newCompanyName = companyName.split(" ");
       String info = newCompanyName[number];

       return info;
   }

   public int searchResult2(){

       List<WebElement> allCompanyNumber = Driver.get().findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));
       int actualToplamFirma = allCompanyNumber.toArray().length;
       return actualToplamFirma;
   }



}
