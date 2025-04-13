package com.xworkz.stringrepresntation;

public class BoardRunner {
    public static void main(String[] args) {

        Board board1 = new Board();
        board1.setMaterial("Whiteboard");

        Board board2 = new Board();
        board2.setMaterial("Whiteboard");

        System.out.println("Checking same location: " + (board1 == board2));
        System.out.println("board1 is same as board2: " + board1.equals(board2));
    }
}
