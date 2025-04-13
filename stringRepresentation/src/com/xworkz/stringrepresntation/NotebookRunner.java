package com.xworkz.stringrepresntation;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook();
        nb1.setPages(200);
        nb1.setType("Ruled");

        Notebook nb2 = new Notebook();
        nb2.setPages(200);
        nb2.setType("Ruled");

        System.out.println("Checking same location: " + (nb1 == nb2));
        boolean same = nb1.equals(nb2);
        System.out.println("nb1 is same as nb2: " + same);
    }
}
