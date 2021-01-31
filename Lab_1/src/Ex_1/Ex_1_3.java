package Ex_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_1_3 {
    public static void main(String[] args) {
        int vowelsC = 0;
        int consonantsC = 0;
        String str = "aaaaIbfnpV";
        Pattern patternV = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);
        Pattern patternC = Pattern.compile("[b-df-hj-np-tv-xz]", Pattern.CASE_INSENSITIVE);

        Matcher matcherV = patternV.matcher(str);
        Matcher matcherC = patternC.matcher(str);

        while (matcherV.find()) {
            vowelsC++;
        }
        while (matcherC.find()) {
            consonantsC++;
        }
        System.out.println("Entered String:" + str + "\nvowels" + "[" + vowelsC + "]" + "\nconsonants" + "[" + consonantsC + "]");


    }

}