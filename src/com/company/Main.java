package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*System.out.println(2.0/ 0.0);
	try{
        System.out.println(2/ 0);
    }
	catch(ArithmeticException e){
	    System.out.println("Ошибка деления на ноль");
    }
    Scanner myScanner = new Scanner( System.in );
    System.out.print( "Enter an integer ");
    try {
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }catch (NumberFormatException e){
        System.out.println("error");
    }
    finally {
        System.out.println("использую finally");
    }*/
    ThrowsDemo t = new ThrowsDemo();
    t.printMessage("ключ");
    }
}
