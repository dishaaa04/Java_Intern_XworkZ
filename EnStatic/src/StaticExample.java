class StaticExample {
    static int count; // Static variable

    // Static block
    static {
        System.out.println("Static Block Executed!");
        count = 100; // Initializing static variable
    }

    // Constructor
    StaticExample() {
        count++;
    }

    void showCount() {
        System.out.println("Count: " + count);
    }
}


