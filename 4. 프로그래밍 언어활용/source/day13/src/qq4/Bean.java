package qq4;

public class Bean {
    int money;

    public String brewing(int money) {

        this.money += money;
        if(money == Menu.Bamericano) {
            return " 콩다방 아메리카노를 구입했습니다";
        }
        else if(money == Menu.Blatte) {
            return " 콩다방 라떼를 구입했습니다";
        }
        else {
            return null;
        }
    }
}
