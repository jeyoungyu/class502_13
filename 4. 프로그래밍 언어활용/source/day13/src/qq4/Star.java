package qq4;

public class Star {
    int money;

    public String brewing(int money) {

        this.money += money;
        if(money == Menu.Samericano) {
            return " 별다방 아메리카노를 구입했습니다";
        }
        else if(money == Menu.Slatte) {
            return " 별다방 라떼를 구입했습니다";
        }
        else {
            return null;
        }
    }

}
