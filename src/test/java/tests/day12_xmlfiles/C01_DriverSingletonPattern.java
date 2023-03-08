package tests.day12_xmlfiles;

import com.github.dockerjava.api.model.Driver;
import org.testng.annotations.Test;

public class C01_DriverSingletonPattern {
    @Test
    public void test01(){
        /*
        POM webDriver olarak Driver classindaki getDriver() methodunun kullanilmasi uzerine kurgulanmistir.

        Driver.getdriver();

        driver classinin obje olusturularak kullanilmasini engellemek icin
        POM tasarlayanlar bir onlem koymak istemisler.
        Java'da bir class'dan obje olsturulmasini engellemek isterseniz SINGLETON PATTERN kullanabilirsniz.

        Singleton pattern  :bir class'dan obje olusturulmasini engellemek ve sinirlamak icin kullanilan bir yotemdir.
        Temel fikir obje olusturmak icin kullanilan default constructor yerine gorunur parametresiz
        bir constructor olusturup ,bu constructor'in access modifier'in private yapip,kullanilmasini engellemektir.

         */



      //  Driver objeDriver=new Driver();


    }
}
