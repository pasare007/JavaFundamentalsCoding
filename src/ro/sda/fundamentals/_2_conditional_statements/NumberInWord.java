package ro.sda.fundamentals._2_conditional_statements;

/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is
0, 1, 2, .... 9 or other for any other number including negative numbers.
You can use if-else statement or switch statement whatever is easier for you.
*/
public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(5);
        printNumberInWord(-100);
        printNumberInWord(9);
        String result1 = convertNumberToString(5);
        System.out.println(result1);
        System.out.println("NumberInWord.main");
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 7:
                System.out.println("Sapte");
                break;
            case 8:
                System.out.println("Opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            default:
                System.out.println("Other");


        }
    }

    public static String convertNumberToString(int number) {
        if (number == 0) {
            return "Zero";
        } else if (number == 1) {
            return "Unu";
        } else if (number == 2) {
            return "Doi";
        } else if (number == 3) {
            return "Trei";
        } else if (number == 4) {
            return "Patru";
        } else if (number == 5) {
            return "Cinci";
        } else if (number == 6) {
            return "Sase";
        } else if (number == 7) {
            return "Sapte";
        } else if (number == 8) {
            return "Opt";
        } else if (number == 9) {
            return "Noua";
        } else {
            return "Other";
        }
    }
}
