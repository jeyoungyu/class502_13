package exam03;

public class q4 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단입니다");
            for (int j = 1; j <= 9; j++) {
                if (i > j) {
                    continue;
                }
                System.out.printf("%d * %d = %d입니다\n", i, j, i * j);

            }
        }
    }
}
