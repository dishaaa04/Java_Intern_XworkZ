public class Router {
    // Constructor
    public Router() {
        System.out.println("Router class initialized");
    }

    // 5 instance methods in parent class
    public void connectToInternet() {
        System.out.println("Router is connecting to the internet");
    }

    public void createWiFiNetwork() {
        System.out.println("Router is creating a WiFi network");
    }

    public void manageTraffic() {
        System.out.println("Router is managing network traffic");
    }

    public void assignIPAddresses() {
        System.out.println("Router is assigning IP addresses to devices");
    }

    public void displayInfo() {
        System.out.println("This is a router");
    }
}