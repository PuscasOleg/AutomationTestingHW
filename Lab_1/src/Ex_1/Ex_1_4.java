package Ex_1;

public class Ex_1_4 {
    public static void main(String[] args) {
        System.out.println(isPolindrome(121) ? "is Polindrome" : "is Not Polindrome");


    }

    public static boolean isPolindrome(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        Integer check = number;
        sb = sb.reverse();
        if (sb.toString().equals(check.toString())) {
            return true;
        } else {
            return false;
        }


    }
}