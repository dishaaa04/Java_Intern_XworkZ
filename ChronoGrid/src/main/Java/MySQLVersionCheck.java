import com.mysql.cj.jdbc.Driver;

public class MySQLVersionCheck {
    public static void main(String[] args) {
        Package p = Driver.class.getPackage();
        System.out.println("MySQL JDBC Driver Version: " + p.getImplementationVersion());
    }
}
