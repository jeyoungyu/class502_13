package qq2;

class Mydog {
    String name;
    String type;

    // 생성자 추가
    public Mydog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // toString() 메서드 오버라이드
    @Override
    public String toString() {
        return type + " " + name;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Mydog dog = new Mydog("멍멍이", "진돗개");
        System.out.println(dog);
    }
}