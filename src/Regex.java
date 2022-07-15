import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //while (true) {
            Scanner input = new Scanner(System.in);
//            System.out.println("press enter to go");
//            String userInput = input.nextLine();
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
            dateChecker("12/32/1999");
        System.out.println();
            dateChecker("12/31/1999");
        System.out.println();
            dateChecker("12/29/1999");
        System.out.println();
            dateChecker("12-32-1999");
        System.out.println();
            dateChecker("12-31-1999");
        System.out.println();
            dateChecker("12-29-1999");

            //Matcher matcher = pattern.matcher(parsePatternText);


       // }
    }

    public static void dateChecker(String parsePatternText) {
        //String PNRegex0 = "[0]{1}[1]{1}}-([0-2]{1}[0-9]{1})|([3]{1}[0-1]{1})-[0-9]{4}";

        String january = "([0][1]-[0-2][0-9]-[0-9]{4})|([0][1]-[3][0-1]-[0-9]{4})" +
                "|(([0][1][/][0-2][0-9][/][0-9]{4})|([0][1][/][3][0-1][/][0-9]{4}))";
        Pattern pattern0 = Pattern.compile(january);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        String february = "([0][2]-[0-1][0-9]-[0-9]{4})|([0][2]-[2][0-8]-[0-9]{4})" +
                "|(([0][2][/][0-1][0-9][/][0-9]{4})|([0][2][/][2][0-8][/][0-9]{4}))";
        Pattern pattern1 = Pattern.compile(february);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        String march = "([0][3]-[0-2][0-9]-[0-9]{4})|([0][3]-[3][0-1]-[0-9]{4})" +
                "|(([0][3][/][0-2][0-9][/][0-9]{4})|([0][3][/][3][0-1][/][0-9]{4}))";
        Pattern pattern2 = Pattern.compile(march);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        String april = "([0][4]-[0-2][0-9]-[0-9]{4})|([0][4]-[3][0]-[0-9]{4})" +
                "|(([0][4][/][0-2][0-9][/][0-9]{4})|([0][4][/][3][0][/][0-9]{4}))";
        Pattern pattern3 = Pattern.compile(april);
        Matcher matcher3 = pattern3.matcher(parsePatternText);

        String may = "([0][5]-[0-2][0-9]-[0-9]{4})|([0][5]-[3][0-1]-[0-9]{4})" +
                "|(([0][5][/][0-2][0-9][/][0-9]{4})|([0][5][/][3][0-1][/][0-9]{4}))";
        Pattern pattern4 = Pattern.compile(may);
        Matcher matcher4 = pattern4.matcher(parsePatternText);

        String june = "([0][6]-[0-2][0-9]-[0-9]{4})|([0][6]-[3][0]-[0-9]{4})" +
                "|(([0][6][/][0-2][0-9][/][0-9]{4})|([0][6][/][3][0][/][0-9]{4}))";
        Pattern pattern5 = Pattern.compile(june);
        Matcher matcher5 = pattern5.matcher(parsePatternText);

        String july = "([0][7]-[0-2][0-9]-[0-9]{4})|([0][7]-[3][0-1]-[0-9]{4})" +
                "|(([0][7][/][0-2][0-9][/][0-9]{4})|([0][7][/][3][0-1][/][0-9]{4}))";
        Pattern pattern6 = Pattern.compile(july);
        Matcher matcher6 = pattern6.matcher(parsePatternText);

        String august = "([0][8]-[0-2][0-9]-[0-9]{4})|([0][8]-[3][0-1]-[0-9]{4})" +
                "|(([0][8][/][0-2][0-9][/][0-9]{4})|([0][8][/][3][0-1][/][0-9]{4}))";
        Pattern pattern7 = Pattern.compile(august);
        Matcher matcher7 = pattern7.matcher(parsePatternText);

        String september = "([0][9]-[0-2][0-9]-[0-9]{4})|([0][9]-[3][0]-[0-9]{4})" +
                "|(([0][9][/][0-2][0-9][/][0-9]{4})|([0][9][/][3][0][/][0-9]{4}))";
        Pattern pattern8 = Pattern.compile(september);
        Matcher matcher8 = pattern8.matcher(parsePatternText);

        String october = "([1][0]-[0-2][0-9]-[0-9]{4})|([1][0]-[3][0-1]-[0-9]{4})" +
                "|(([1][0][/][0-2][0-9][/][0-9]{4})|([1][0][/][3][0-1][/][0-9]{4}))";
        Pattern pattern9 = Pattern.compile(october);
        Matcher matcher9 = pattern9.matcher(parsePatternText);

        String november = "([1][1]-[0-2][0-9]-[0-9]{4})|([1][1]-[3][0]-[0-9]{4})" +
                "|(([1][1][/][0-2][0-9][/][0-9]{4})|([1][1][/][3][0][/][0-9]{4}))";
        Pattern pattern10 = Pattern.compile(november);
        Matcher matcher10 = pattern10.matcher(parsePatternText);

        String december = "([1][2]-[0-2][0-9]-[0-9]{4})|([1][2]-[3][0-1]-[0-9]{4})" +
                "|(([1][2][/][0-2][0-9][/][0-9]{4})|([1][2][/][3][0-1][/][0-9]{4}))";
        Pattern pattern11 = Pattern.compile(december);
        Matcher matcher11 = pattern11.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            System.out.println("fell into january");
            System.out.println("found the text "
                    + matcher0.group() + " starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
            System.out.println("fell into february");
            System.out.println("found the text "
                    + matcher1.group() + " starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
            System.out.println("fell into march");
            System.out.println("found the text "
                    + matcher2.group() + " starting at index "
                    + matcher2.start()
                    + " and ending at index "
                    + matcher2.end());
            found = true;
        }
        while (matcher3.find()) {
            System.out.println("fell into april");
            System.out.println("found the text "
                    + matcher3.group() + " starting at index "
                    + matcher3.start()
                    + " and ending at index "
                    + matcher3.end());
            found = true;
        }
        while (matcher4.find()) {
            System.out.println("fell into may");
            System.out.println("found the text "
                    + matcher4.group() + " starting at index "
                    + matcher4.start()
                    + " and ending at index "
                    + matcher4.end());
            found = true;
        }
        while (matcher5.find()) {
            System.out.println("fell into june");
            System.out.println("found the text "
                    + matcher5.group() + " starting at index "
                    + matcher5.start()
                    + " and ending at index "
                    + matcher5.end());
            found = true;
        }
        while (matcher6.find()) {
            System.out.println("fell into july");
            System.out.println("found the text "
                    + matcher6.group() + " starting at index "
                    + matcher6.start()
                    + " and ending at index "
                    + matcher6.end());
            found = true;
        }
        while (matcher7.find()) {
            System.out.println("fell into august");
            System.out.println("found the text "
                    + matcher7.group() + " starting at index "
                    + matcher7.start()
                    + " and ending at index "
                    + matcher7.end());
            found = true;
        }
        while (matcher8.find()) {
            System.out.println("fell into september");
            System.out.println("found the text "
                    + matcher8.group() + " starting at index "
                    + matcher8.start()
                    + " and ending at index "
                    + matcher8.end());
            found = true;
        }
        while (matcher9.find()) {
            System.out.println("fell into october");
            System.out.println("found the text "
                    + matcher9.group() + " starting at index "
                    + matcher9.start()
                    + " and ending at index "
                    + matcher9.end());
            found = true;
        }
        while (matcher10.find()) {
            System.out.println("fell into november");
            System.out.println("found the text "
                    + matcher10.group() + " starting at index "
                    + matcher10.start()
                    + " and ending at index "
                    + matcher10.end());
            found = true;
        }
        while (matcher11.find()) {
            System.out.println("fell into december");
            System.out.println("found the text "
                    + matcher11.group() + " starting at index "
                    + matcher11.start()
                    + " and ending at index "
                    + matcher11.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid Date");
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
