public class Exception {
    public static boolean exception(String[] args) {
        if (args.length != 3) {
            throw new ArrayIndexOutOfBoundsException ("Arg format is: val1 +|-|*|/ val2");
        }
        boolean isVal1Int = isInt(args[0]);
        if (!isVal1Int) {
            throw new NumberFormatException ("Val1 is not int");
        }
        boolean isVal2Int = isInt(args[2]);
        if (!isVal2Int) {
            throw new NumberFormatException ("Val2 is not int");
        }
        String operator = args[1];
        if ("+".equals(operator) ||
                "-".equals(operator) ||
                "/".equals(operator) ||
                "*".equals(operator)) {
            return true;
        } else {
            throw new NumberFormatException ("Operator not found");
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
