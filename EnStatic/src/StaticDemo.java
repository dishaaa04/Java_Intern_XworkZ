public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("Main Method Executed!");
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.showCount(); // Displays the same count for all objects
        obj2.showCount();
    }
}