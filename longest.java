public class longest{


public static void main(String[] args){

int max = Integer.MIN_VALUE;
String first = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";



for (String arg : args) {
    int value = args.length;
    if (value > max) {
        max = value;
    }
    if (first.compareTo(arg)>0) {
        first = arg;
    }

}
int len = args[max-1].length();

System.out.println("Longest: "+ args[max] +"(" + len +  " letters)");
System.out.println("First alphabetically: " + first);
}
}
