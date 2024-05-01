package qq4;

public class Person {
    String name;
    int money;

    Person(String name, int money ){
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(Star sCoffee, int money) {
        String message = sCoffee.brewing(4000);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "는" + money +"원"  + message);
        }
    }

    public void buyBeanCoffee(Bean bCoffee, int money) {
        String message = bCoffee.brewing(4500);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "는" + money + "원"  + message);
        }
    }
}
