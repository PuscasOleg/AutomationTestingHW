package Ex_1;

public class Ex_1_2 {
    public static void main(String[] args) {
        String myString="ana";
        StringBuffer buffer=new StringBuffer(myString);
        buffer.reverse();
        String str=buffer.toString();
        if(myString.equals(str)){
            System.out.println("That string is polidrome");
        }else{
            System.out.println("That string is not polindrome");
        }
    }
}