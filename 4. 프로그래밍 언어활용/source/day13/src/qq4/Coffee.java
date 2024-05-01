package qq4;

public class Coffee {
    public static void main(String[] args) {

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 10000);
        Star starCoffee = new Star();
        Bean beanCoffee = new Bean();

        kim.buyStarCoffee(starCoffee, 4000);
        lee.buyBeanCoffee(beanCoffee, 4500);

    }
}
