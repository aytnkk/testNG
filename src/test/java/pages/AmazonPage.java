package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class AmazonPage {

    /*
    Pages classlari surekli kullandigimiz locate'leri tekrar tekrar
    locate etmek zorunda kalmaktan kurtulmak icin kullanilir.

    Her pages classi Driver classinda olusturulan driver'kullanir
   @FindBy notasyonunun Driver classindaki webDriveri kullanabilmesi icin
   bu classa tanitmamiz gerekiyor.
   Bunun icin her pages sayfasi ilk olusturuldugunda basina parametresiz bir constuctor
   olusturup icerisinde driver'i bu classa tanitiyoruz.
     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public  WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ilkUrunIsimElementi;
    @FindBy(xpath = "//h4[.='Prime programs']")
    public WebElement primePrograms;

    @FindBy(xpath = "(//input[@class='a-button-input'])[1]")
    public WebElement todaysdealsilkUrun;

    @FindBy(id = "ap_email")
    public WebElement signIn;

    @FindBy(id = "auth-error-message-box")
    public WebElement errorKutusu;
}
