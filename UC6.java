public class Main {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "";

        // Loop through arguments
        for (String name : args) {
            result += name + ", ";
        }

        // Remove last ", "
        result = result.substring(0, result.length() - 2);

        System.out.println("Hello, " + result);
    }
}
