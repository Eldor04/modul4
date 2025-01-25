package lesson8.classWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
//        numberChecked();
//        phonechecked();
//        replaceAll();
//        ex1();
//        ex2();
//        ex3();
//        ex4();

    }

    private static void ex4() {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(" dsfdDFSDF 5654DFSDF$# %%$dfsFD");
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }

    private static void ex3() {
        Pattern pattern = Pattern.compile("[\\d[\\W]]");
        Matcher matcher = pattern.matcher("*-/65664dsfdDFSD/*-F5654DFSDF$#%%$dfsFD");
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }

    private static void ex2() {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("7d#$s896fdDFSDF5654DFSDF$#%%$dfsFD");
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }

    private static void ex1() {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher("dsfdDFSDF5654DFSDF$#%%$dfsFD");
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }

    private static void replaceAll() {
        Pattern pattern = Pattern.compile("\\d");
        String str = "abc76%8**fdsf48485df";
        Matcher matcher = pattern.matcher(str);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()){
            builder.append(matcher.group());
        }
        System.out.println(builder);
    }

    private static void phonechecked() {
        Pattern pattern = Pattern.compile("^\\+998[0-9]{9}$");
        Matcher matcher = pattern.matcher("+998885632418");
        if (!matcher.find()){
            throw new RuntimeException("Invalid phone number");
        }else {
            System.out.println(matcher.group());
        }
    }

    private static void numberChecked() {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("abc76%8**fdsf48485df");
        boolean matches = matcher.matches();
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
