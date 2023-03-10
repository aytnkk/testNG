package tests.practise;

import org.testng.annotations.Test;
import pages.UdemyPages;
import utilities.Driver;

public class test1 {
    UdemyPages udemyPages=new UdemyPages();
    @Test
    public void test01() {


        // Kullanici https:// www.iienstitu.com/en sayfasina gider
        Driver.getDriver().get("https://www.iienstitu.com/en/");
        // Login butonuna tiklar
       udemyPages.loginbuttonHomePage.click();
        // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder

        // headers da bulunan egitimler kismina tiklar
        // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
        // ucretsiz egitimlerden herhangi birini alir
        // kimlik dogrulama islemlerini girer
        // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
        // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test eder
    }
}