package AbstracSinif.InnerClassIStifadesi;

public class NestedClassIstifadesi {
    public static void main(String[] args) {
        String[] Seherler={"Baki","Istanbul","Berlin"};

        YaziciSinif yazicisinif =new YaziciSinif();
        YaziciSinif.StringSayiYazdir stringSayiYazdir =yazicisinif.new StringSayiYazdir();
        stringSayiYazdir.stringSayiYazdir(Seherler);

        A1.B1.C1 yenimethod1= new A1().new B1().new C1();
        yenimethod1.methodc1();

    }
}
