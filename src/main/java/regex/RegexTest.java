package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        String str = "Даша пошла гулять. hello world. 13";
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.print(m.group());
        }
        System.out.println();

        String s = "5 * x^3 - 6 * x^1 + 1";
        System.out.println(s.replaceAll("\\^([0-9]+)", "<sup>$1</sup>"));

        String z = "5 * x^3 - 6 * x^1 + 1";
        z = z.replaceAll("(?x)(\\d+)(\\s+?\\*?\\s+?)(\\w+?)(\\^+?)(\\d+?)", "$1$3<sup>$5</sup>");
        System.out.println(z);
    }
}
