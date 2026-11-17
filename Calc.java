public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
        }

        String operation = args[0];


        int result;
        if (operation.equals("add")) {
            result = 0;
        } else if (operation.equals("mult")) {
            result = 1;
        } else if (operation.equals("max")) {
            result = Integer.MIN_VALUE;
        } else if (operation.equals("min")) {
            result = Integer.MAX_VALUE;
        } else{
			System.out.println("Unknown operation: " + operation);
			result = -1;
		}

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            if (operation.equals("add")) {
                result += number;
          } else if (operation.equals("mult")) {
                result *= number;
         } else if (operation.equals("max")) {
             result = Math.max(result, number);
            } else {
                result = Math.min(result, number);
        }
        }
		if (operation.equals("add")||operation.equals("mult")||operation.equals("max")||operation.equals("min")){
        System.out.println(result);}
    }
}
