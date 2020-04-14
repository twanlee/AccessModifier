package privatemodifier;

public class A{

    private int data=40;
    protected int data1=40;
    int data2=40;
    public int data3=40;


}
class sample{
    public static void main(String[] args) {
        A a = new A();
        int aa = a.data1;
        int bb = a.data2;
        int cc = a.data3;
        int dd = a.data;
    }
}




