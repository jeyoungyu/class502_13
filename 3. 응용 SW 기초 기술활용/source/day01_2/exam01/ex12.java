package exam01;

public class ex12 {
    public static void main(String[] args) {
        int num1 = 13;
        double num2 = 3.6;

        //double num3 = num1 * num2;
        //int num4 = (int)num3;   답은 맞지만 코드가 늘어났음 num3를 굳이 double로 정의할 필요x


        int num3 = (int)(num1 * num2);

        System.out.println(num3);

        // 곱셈 결과를 정수로 표현해보기


    }
}
