package com.xworkz.stringrepresntation;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Classmate", 200, "Ruled");
        System.out.println("notebook = " + notebook.toString());

        int code = notebook.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("paper = " + "paper".hashCode());
        System.out.println("cover = " + "cover".hashCode());
        System.out.println("binding = " + "binding".hashCode());
    }
}
