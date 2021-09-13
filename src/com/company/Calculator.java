package com.company;

public class Calculator {
    public static void calculator(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int val2 = Integer.parseInt(args[0]);
        int result = 0;
        //Scanner scanner= new Scanner(System.in);

        switch (operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "/":
                result = val1 / val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            default: result = 0;
                break;

        }
        Parser.parser(result);
    }

}
