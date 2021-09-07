package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if (args.length < 3){
            System.out.println("Arg format is: val1 +|-|*|/ val2");
            System.exit(1);
            return;
        }
        boolean isVal1Int = isInt(args[0]);
        if (!isVal1Int){
            System.out.println("Val1 is not int");
            System.exit(2);
            return;
        }
        boolean isVal2Int = isInt(args[2]);
        if (!isVal2Int){
            System.out.println("Val2 is not int");
            System.exit(2);
            return;
        }

        int val1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int val2 = Integer.parseInt(args[0]);
        int result = 0;
        //Scanner scanner= new Scanner(System.in);

        switch (operator){
            case "+": result = val1 + val2; break;
            case "-": result = val1 - val2; break;
            case "/": result = val1/val2; break;
            case "*": result = val1*val2; break;

        }
        System.out.println("Result is:" + result);
    }

    private static boolean isInt(String arg) {
        try{
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
