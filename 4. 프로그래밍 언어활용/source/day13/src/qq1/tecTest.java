package qq1;

public class tecTest {

    public static void main(String[] args) {

       tec  tec1 = tec.getInstance();
        tec tec2 = tec.getInstance();

        System.out.println(tec1 == tec2);
    }
}