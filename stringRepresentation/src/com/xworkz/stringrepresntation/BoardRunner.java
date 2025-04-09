package com.xworkz.stringrepresntation;

public class BoardRunner {
    public static void main(String[] args) {
        Board board = new Board("Whiteboard", 36, "Glass");
        System.out.println("board" + board.toString());
    }
}
