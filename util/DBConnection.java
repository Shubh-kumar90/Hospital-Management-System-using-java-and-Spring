package util;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection() {
        System.out.println("DB Connected (simulated)");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}