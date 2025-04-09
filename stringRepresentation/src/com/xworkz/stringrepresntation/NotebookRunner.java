package com.xworkz.stringrepresntation;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Classmate", 200, true);
        System.out.println("notebook" + notebook.toString());
    }
}
