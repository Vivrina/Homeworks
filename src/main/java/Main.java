public class Main {

    public static boolean main(String[] args) {
	// write your code here
        Exception.exception(args);
        System.out.println(Parser.parser(Calculator.calculator(args)));
        return true;
    }

}
