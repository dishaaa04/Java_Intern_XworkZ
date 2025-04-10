package com.xworkz.stringrepresntation;

public class BoardRunner {
    public static void main(String[] args) {
        Board board = new Board("Wood", "Notice", 30);
        String boardString = board.toString();
        System.out.println("board = " + boardString);

        int code = board.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "chalk";
        System.out.println("chalk = " + value.hashCode());

        String value2 = "marker";
        System.out.println("marker = " + value2.hashCode());

        String value3 = "eraser";
        System.out.println("eraser = " + value3.hashCode());
    }
}
