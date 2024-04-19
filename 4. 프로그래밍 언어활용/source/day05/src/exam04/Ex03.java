package exam04;

public class Ex03 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();
        if (ad instanceof C) {
            C c = (C) ad;
        }
    }
}
