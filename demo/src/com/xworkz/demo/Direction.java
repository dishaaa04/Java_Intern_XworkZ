package com.xworkz.demo;

public class Direction {
    String Top;
    private String Left;
    public String Right;
    void whichDirection(String Top, String Left, String Right) {
        this.Top = Top;
        this.Left=Left;
        this.Right=Right;
    }

        void Display(){


            System.out.println("Showing Direction "+ Top );
            System.out.println("Showing Direction "+ Left);
            System.out.println("Showing Direction "+ Right);

    }

    public void Show()
    {
        System.out.println("Show the direction using Show method "+ Top);
        System.out.println("Show the direction using Show method "+ Left);
        System.out.println("Show the direction using Show method "+ Right);
        this.Length();

    }
    private void Length()
    {

        System.out.println("Length is " + Top);
        System.out.println("Length is " + Left);
        System.out.println("Length is " + Right);

    }

}
