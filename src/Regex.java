import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("press enter to go");
            String userInput = input.nextLine();
//            System.out.print("Enter your regex expression: ");
//            String regexPattern = input.nextLine();
//            String SSN = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
//            String SSN1 = "[0-9]{3}s[0-9]{2}s[0-9]{4}";
//            String SSN2 = "[0-9]{9}";

            //Pattern pattern = Pattern.compile(regexPattern);
//            System.out.print("Enter input to be parsed: ");
//            String parsePatternText = input.nextLine();


//            String parsePatternText0 = "123-45-6789";
//            String parsePatternText1 = "123 45 6789";
//            String parsePatternText2 = "123456789";
//            SSNChecker(parsePatternText0);
//            SSNChecker(parsePatternText1);
//            SSNChecker(parsePatternText2);

//            phoneNumberChecker("206-412-1852");
//            phoneNumberChecker("206 412 1852");
//            phoneNumberChecker("2064121852");
//            phoneNumberChecker("(206)-412-1852");
//            phoneNumberChecker("(206) 412 1852");
//            phoneNumberChecker("(206)4121852");
//            phoneNumberChecker("     (206)4121852      ");


//            nameChecker("nAlIvAyKo, MiChAeL");
//            nameChecker("nAlIvAyKo, MiChAeL, pavlovich");
            dateChecker("01-20-1999");

            //Matcher matcher = pattern.matcher(parsePatternText);


        }
    }

    public static void dateChecker(String parsePatternText) {
        //String PNRegex0 = "[0]{1}[1]{1}}-([0-2]{1}[0-9]{1})|([3]{1}[0-1]{1})-[0-9]{4}";

        String PNRegex0 = "[0]{1}[1]{1}-([0-2]{1}[0-9]{1})|([3]{1}[0-1]{1})-[0-9]{4}";
        Pattern pattern0 = Pattern.compile(PNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            System.out.println("fell into Regex0");
            System.out.println("found the text "
                    + matcher0.group() + " starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid phone number");
        }
    }

    public static void nameChecker(String parsePatternText) {
        String PNRegex0 = "[a-zA-Z]+[,]{1}\s[a-zA-Z]+";
        Pattern pattern0 = Pattern.compile(PNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        String PNRegex1 = "[a-zA-Z]+[,]{1}\s[a-zA-Z]+,\s[a-zA-Z]+";
        Pattern pattern1 = Pattern.compile(PNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            System.out.println("fell into Regex0");
            System.out.println("found the text "
                    + matcher0.group() + " starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
            System.out.println("fell into Regex1");
            System.out.println("found the text "
                    + matcher1.group() + " starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid phone number");
        }
    }

    public static void emailChecker(String parsePatternText) {

    }

    public static void phoneNumberChecker(String parsePatternText) {
        String PNRegex0 = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
        Pattern pattern0 = Pattern.compile(PNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        String PNRegex1 = "[0-9]{3}\s[0-9]{3}\s[0-9]{4}";
        Pattern pattern1 = Pattern.compile(PNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        String PNRegex2 = "[0-9]{10}";
        Pattern pattern2 = Pattern.compile(PNRegex2);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        String PNRegex3 = "[(]{1}[0-9]{3}[)]{1}-[0-9]{3}-[0-9]{4}";
        Pattern pattern3 = Pattern.compile(PNRegex3);
        Matcher matcher3 = pattern3.matcher(parsePatternText);

        String PNRegex4 = "[(]{1}[0-9]{3}[)]{1}\s[0-9]{3}\s[0-9]{4}";
        Pattern pattern4 = Pattern.compile(PNRegex4);
        Matcher matcher4 = pattern4.matcher(parsePatternText);

        String PNRegex5 = "[(]{1}[0-9]{3}[)]{1}[0-9]{7}";
        Pattern pattern5 = Pattern.compile(PNRegex5);
        Matcher matcher5 = pattern5.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            System.out.println("fell into Regex0");
            System.out.println("found the text "
                    + matcher0.group() + " starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
            System.out.println("fell into Regex1");
            System.out.println("found the text "
                    + matcher1.group() + " starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
            System.out.println("fell into Regex2");
            System.out.println("found the text "
                    + matcher2.group() + " starting at index "
                    + matcher2.start()
                    + " and ending at index "
                    + matcher2.end());
            found = true;
        }
        while (matcher3.find()) {
            System.out.println("fell into Regex3");
            System.out.println("found the text "
                    + matcher3.group() + " starting at index "
                    + matcher3.start()
                    + " and ending at index "
                    + matcher3.end());
            found = true;
        }
        while (matcher4.find()) {
            System.out.println("fell into Regex4");
            System.out.println("found the text "
                    + matcher4.group() + " starting at index "
                    + matcher4.start()
                    + " and ending at index "
                    + matcher4.end());
            found = true;
        }
        while (matcher5.find()) {
            System.out.println("fell into Regex5");
            System.out.println("found the text "
                    + matcher5.group() + " starting at index "
                    + matcher5.start()
                    + " and ending at index "
                    + matcher5.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid phone number");
        }
    }

    public static void SSNChecker(String parsePatternText) {
        String SSNRegex0 = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern0 = Pattern.compile(SSNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        String SSNRegex1 = "[0-9]{3}\s[0-9]{2}\s[0-9]{4}";
        Pattern pattern1 = Pattern.compile(SSNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        String SSNRegex2 = "[0-9]{9}";
        Pattern pattern2 = Pattern.compile(SSNRegex2);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
//            System.out.println("fell into SSNRegex0");
//            System.out.println("found the text "
//                    + matcher0.group() + " starting at index "
//                    + matcher0.start()
//                    + " and ending at index "
//                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
//            System.out.println("fell into SSNRegex1");
//            System.out.println("found the text "
//                    + matcher1.group() + " starting at index "
//                    + matcher1.start()
//                    + " and ending at index "
//                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
//            System.out.println("fell into SSNRegex2");
//            System.out.println("found the text "
//                    + matcher2.group() + " starting at index "
//                    + matcher2.start()
//                    + " and ending at index "
//                    + matcher2.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid SSN");
        }
    }
}
