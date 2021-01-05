package AbstracSinif.InnerClassIStifadesi;

public class YaziciSinif {
    private int privateDeyisen = 1;
    int defaultDeyisen = 2;
    protected int protectedDeyisen=3;
    public  int publicDeyisen = 4;

    private void privateMethof(){

        StringSayiYazdir sn1 = new StringSayiYazdir();
        System.out.println(sn1.defaultDeyisenDaxili);
        System.out.println(sn1.privateDeyisenDaxili);
        System.out.println(sn1.publicDeyisenDaxili);
        System.out.println(sn1.defaultDeyisenDaxili);

    }
    void defaultMethod(){}
    protected void protectedMethod(){}
    public void publicMethod(){}




     class StringSayiYazdir{

        private int privateDeyisenDaxili = 1;
        int defaultDeyisenDaxili = 2;
        protected int protectedDeyisenDaxili=3;
        public  int publicDeyisenDaxili = 4;

        public void stringSayiYazdir(String[] yazdir){

            System.out.println(privateDeyisen);
            System.out.println(defaultDeyisen);
            System.out.println(protectedDeyisen);
            System.out.println(publicDeyisen);
            privateMethof();
            defaultMethod();
            protectedMethod();
            publicMethod();

            for(String mueyyen : yazdir){
                System.out.println(mueyyen);
            }
        }
    }

    abstract class AbstractInnerClass{}


}

class A1{
    class B1{
        class C1{
            void methodc1(){}
        }
    }
}
