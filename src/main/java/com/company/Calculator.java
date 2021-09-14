package com.company;

public class Calculator {
    public static int calculator(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int val2 = Integer.parseInt(args[2]);
        int result = 0;

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
        return result;
        //Parser.parser(result);
    }

}
