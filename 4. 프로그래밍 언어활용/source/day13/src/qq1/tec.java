package qq1;

public class tec {
    private static tec instance = new tec();

    private tec() {}

    public static tec getInstance() {
        if (instance == null) {
            instance = new tec();
        }

        return instance;
    }

}

