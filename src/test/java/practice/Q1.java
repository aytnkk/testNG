package practice;

import org.testng.annotations.Test;

public class Q1 {
     /*   > priority annotation testlere oncelik vermek icin kullanilir,
    kucuk olan numara daha once calisir.
            > priority : TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir.
    > priority default degeri sifirdir.
            > enabled = false methodu : Testi gormezden gelmek icin @Test 'in yanina yazilir.
            */
    @Test(priority = 20)
    public void b(){
        System.out.println("b");
    }

    @Test(enabled = false)//testi gormezden gelir
    public void d(){
        System.out.println("d");
    }
    @Test(priority = -10)
    public void c(){
        System.out.println("c");
    }
    @Test(dependsOnMethods = "b")
    public void e(){
        System.out.println("e");
    }
    @Test(dependsOnMethods = "c")
    public void a(){
        System.out.println("a");
    }
    @Test
    public void f(){
        System.out.println("f");
    }
    @Test(dependsOnMethods = "f")
    public void g(){
        System.out.println("g");
    }
}
