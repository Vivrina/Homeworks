package com.company;

public class Exception {
    public static void exception(String[] args) {
        if (args.length != 3) {
            System.out.println("Arg format is: val1 +|-|*|/ val2");
            System.exit(1);
            return;
        }
        boolean isVal1Int = isInt(args[0]);
        if (!isVal1Int) {
            System.out.println("Val1 is not int");
            System.exit(2);
            return;
        }
        boolean isVal2Int = isInt(args[2]);
        if (!isVal2Int) {
            System.out.println("Val2 is not int");
            System.exit(2);
            return;
        }
        String operator = args[1];
        if ("+".equals(operator) ||
                "-".equals(operator) ||
                "/".equals(operator) ||
                "*".equals(operator)) {
        } else {
            System.out.println("Operator not found");
            System.exit(3);
            return;
        }

    }
    private static boolean isInt(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
