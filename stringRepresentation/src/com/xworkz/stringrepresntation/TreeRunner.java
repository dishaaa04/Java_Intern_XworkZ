package com.xworkz.stringrepresntation;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.setSpecies("Neem");
        tree1.setAge(20);
        tree1.setHeight(15.2);

        Tree tree2 = new Tree();
        tree2.setSpecies("Neem");
        tree2.setAge(20);
        tree2.setHeight(15.2);

        System.out.println("Checking same location: " + (tree1 == tree2));
        boolean same = tree1.equals(tree2);
        System.out.println("tree1 is same as tree2: " + same);
    }
}
