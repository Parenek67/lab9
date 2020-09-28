package com.company;

import java.util.Scanner;

public class ThrowsDemo {
    /*public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            //какое исключение я здесь должен обрабатывать, если null не является ошибкой вообще?
            return "data for" + key;
        }
        catch (NullPointerException e){
            return "ошибка";
        }
    }*/
    /*public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try {  String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }*/
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        for (int i = 0;i<2;i++){
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

}
