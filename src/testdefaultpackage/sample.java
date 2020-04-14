package testdefaultpackage;

import privatemodifier.A;

public class sample {
        public static void main(String[] args) {
            A a = new A();
            int aa = a.data1;
            int bb = a.data2;
            int cc = a.data3;
            int dd = a.data;
        }
    }
    public class B extends A {
        public static void main(String[] args) {
            A a = new A();
            int aa = a.data1;
            int bb = a.data2;
            int cc = a.data3;
            int dd = a.data;
        }
    }
