import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("would you like to manually test or redirect file? (1 for manual, 2 for file): ");
        String userChoice = input.nextLine();
        while (!(Objects.equals(userChoice, "1") || Objects.equals(userChoice, "2"))) {
            System.out.println("Please choose 1 or 2 (1 for manual, 2 for file): ");
            userChoice = input.nextLine();
            System.out.println(userChoice);

        }
        if (Objects.equals(userChoice, "2")) {
            System.out.println("the file is in the same folder as this project saved as testing.txt, " +
                    "press enter to continue");
            input.nextLine();
        }

        String relativePath = new File("").getAbsolutePath();
        File test = new File(relativePath + "\\src\\testing.txt");
        Scanner testReader = new Scanner(test);

        String choice = "";
        String parseText = "";
        boolean Continue = true;
        while (Continue) {

            if (Objects.equals(userChoice,"1")) {
                System.out.println("Select options A-L or Q: ");
                choice = input.nextLine().toUpperCase(Locale.ROOT);
                if (!Objects.equals(choice,"Q")) {
                    System.out.println("Enter String to be parsed: ");
                    parseText = input.nextLine();
                }
            } else if (Objects.equals(userChoice,"2")) {
                choice = testReader.nextLine().toUpperCase(Locale.ROOT);
                if (!Objects.equals(choice,"Q")) {
                    parseText = testReader.nextLine();
                }
            }

            switch (choice) {
                case "A" -> SSNChecker(parseText);
                case "B" -> phoneNumberChecker(parseText);
                case "C" -> emailChecker(parseText);
                case "D" -> nameChecker(parseText);
                case "E" -> dateChecker(parseText);
                case "F" -> houseAddressChecker(parseText);
                case "G" -> cityStateChecker(parseText);
                case "H" -> militaryTimeChecker(parseText);
                case "I" -> currencyChecker(parseText);
                case "J" -> urlChecker(parseText);
                case "K" -> passwordChecker(parseText);
                case "L" -> oddWordChecker(parseText);
                case "Q" -> Continue = false;
             }
            System.out.println();
        }
    }

    public static void oddWordChecker(String parsePatternText) {
        //regex checks for groups of 2 letters and ion at the end
        String word0 = "^([a-zA-Z]{2})*ion$";
        Pattern pattern0 = Pattern.compile(word0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into word0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid word");
        }
    }

    public static void passwordChecker(String parsePatternText) {
        //regex checks for no 3 consecutive lowercase characters, a punctuation char, lower and uppercase letter,
        //with a min length of 10
        String password0 = "^(?!.*[a-z]{3})(?=.*[.?!,:;_()'\"])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\w.?!,:;_()'\"]{10,}$";
        Pattern pattern0 = Pattern.compile(password0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into password0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid password");
        }
    }

    public static void urlChecker(String parsePatternText) {
        //regex that optionally allows http(s) and can end in any domain suffix
        String url0 = "(https://|http://|HTTPS://|HTTP://)?(www[.])?([a-zA-Z0-9]+[.])+(com|org|gov|edu|net)";
        Pattern pattern0 = Pattern.compile(url0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into url0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid URL");
        }
    }

    public static void currencyChecker(String parsePatternText) {
        //regex that allows for any length of currency with commas down to the cent
        String currency0 = "([0-9]|[0-9]{2}|[0-9]{3})([,][0-9]{3})*.[0-9]{2}";
        Pattern pattern0 = Pattern.compile(currency0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into currency0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid Currency");
        }
    }

    public static void militaryTimeChecker(String parsePatternText) {
        //regex that parses for military time with no spaces, :, or a whitespace between the hours, minutes, and seconds
        String time0 = "(([0-1][0-9][:|\s]?[0-5][0-9])|([2][0-3][:|\s]?[0-5][0-9])|([2][4][:|\s]?[0][0]))[\s|:][0-5][0-9]";
        Pattern pattern0 = Pattern.compile(time0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into time0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid Time");
        }
    }

    public static void cityStateChecker(String parsePatternText) {
        //regex that looks for letters of length 1 or more, then a comma and space, 2 more letters plus space and 5
        //number. This results in city, state zip
        String city0 = "[a-zA-Z\s]+[,]\s[a-zA-Z]{2}+\s[0-9]{5}";
        Pattern pattern0 = Pattern.compile(city0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into city0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid City");
        }
    }

    public static void houseAddressChecker(String parsePatternText) {
        //regex that looks for a combination of numbers 1 or more, then a space, then a combination of letters and
        //whitespaces to allow for multiple word streets, then a whitespace, and whatever road variation (st vs ave).
        String address0 = "[0-9]+\s[a-zA-Z0-9\s]+\s(rd|st|blvd|ave|road|street|boulevard|avenue" +
                "|Rd|St|Blvd|Ave|Road|Street|Boulevard|Avenue)";
        Pattern pattern0 = Pattern.compile(address0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into address0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid House");
        }
    }

    public static void dateChecker(String parsePatternText) {
        //regex for january that parses for the date and makes sure that the day is not too high for the month
        String january = "([0][1]-[0-2][0-9]-[0-9]{4})|([0][1]-[3][0-1]-[0-9]{4})" +
                "|(([0][1][/][0-2][0-9][/][0-9]{4})|([0][1][/][3][0-1][/][0-9]{4}))";
        Pattern pattern0 = Pattern.compile(january);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        //regex for february that parses for the date and makes sure that the day is not too high for the month
        String february = "([0][2]-[0-1][0-9]-[0-9]{4})|([0][2]-[2][0-9]-[0-9]{4})" +
                "|(([0][2][/][0-1][0-9][/][0-9]{4})|([0][2][/][2][0-9][/][0-9]{4}))";
        Pattern pattern1 = Pattern.compile(february);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        //regex for march that parses for the date and makes sure that the day is not too high for the month
        String march = "([0][3]-[0-2][0-9]-[0-9]{4})|([0][3]-[3][0-1]-[0-9]{4})" +
                "|(([0][3][/][0-2][0-9][/][0-9]{4})|([0][3][/][3][0-1][/][0-9]{4}))";
        Pattern pattern2 = Pattern.compile(march);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        //regex for april that parses for the date and makes sure that the day is not too high for the month
        String april = "([0][4]-[0-2][0-9]-[0-9]{4})|([0][4]-[3][0]-[0-9]{4})" +
                "|(([0][4][/][0-2][0-9][/][0-9]{4})|([0][4][/][3][0][/][0-9]{4}))";
        Pattern pattern3 = Pattern.compile(april);
        Matcher matcher3 = pattern3.matcher(parsePatternText);

        //regex for may that parses for the date and makes sure that the day is not too high for the month
        String may = "([0][5]-[0-2][0-9]-[0-9]{4})|([0][5]-[3][0-1]-[0-9]{4})" +
                "|(([0][5][/][0-2][0-9][/][0-9]{4})|([0][5][/][3][0-1][/][0-9]{4}))";
        Pattern pattern4 = Pattern.compile(may);
        Matcher matcher4 = pattern4.matcher(parsePatternText);

        //regex for june that parses for the date and makes sure that the day is not too high for the month
        String june = "([0][6]-[0-2][0-9]-[0-9]{4})|([0][6]-[3][0]-[0-9]{4})" +
                "|(([0][6][/][0-2][0-9][/][0-9]{4})|([0][6][/][3][0][/][0-9]{4}))";
        Pattern pattern5 = Pattern.compile(june);
        Matcher matcher5 = pattern5.matcher(parsePatternText);

        //regex for july that parses for the date and makes sure that the day is not too high for the month
        String july = "([0][7]-[0-2][0-9]-[0-9]{4})|([0][7]-[3][0-1]-[0-9]{4})" +
                "|(([0][7][/][0-2][0-9][/][0-9]{4})|([0][7][/][3][0-1][/][0-9]{4}))";
        Pattern pattern6 = Pattern.compile(july);
        Matcher matcher6 = pattern6.matcher(parsePatternText);

        //regex for august that parses for the date and makes sure that the day is not too high for the month
        String august = "([0][8]-[0-2][0-9]-[0-9]{4})|([0][8]-[3][0-1]-[0-9]{4})" +
                "|(([0][8][/][0-2][0-9][/][0-9]{4})|([0][8][/][3][0-1][/][0-9]{4}))";
        Pattern pattern7 = Pattern.compile(august);
        Matcher matcher7 = pattern7.matcher(parsePatternText);

        //regex for september that parses for the date and makes sure that the day is not too high for the month
        String september = "([0][9]-[0-2][0-9]-[0-9]{4})|([0][9]-[3][0]-[0-9]{4})" +
                "|(([0][9][/][0-2][0-9][/][0-9]{4})|([0][9][/][3][0][/][0-9]{4}))";
        Pattern pattern8 = Pattern.compile(september);
        Matcher matcher8 = pattern8.matcher(parsePatternText);

        //regex for october that parses for the date and makes sure that the day is not too high for the month
        String october = "([1][0]-[0-2][0-9]-[0-9]{4})|([1][0]-[3][0-1]-[0-9]{4})" +
                "|(([1][0][/][0-2][0-9][/][0-9]{4})|([1][0][/][3][0-1][/][0-9]{4}))";
        Pattern pattern9 = Pattern.compile(october);
        Matcher matcher9 = pattern9.matcher(parsePatternText);

        //regex for november that parses for the date and makes sure that the day is not too high for the month
        String november = "([1][1]-[0-2][0-9]-[0-9]{4})|([1][1]-[3][0]-[0-9]{4})" +
                "|(([1][1][/][0-2][0-9][/][0-9]{4})|([1][1][/][3][0][/][0-9]{4}))";
        Pattern pattern10 = Pattern.compile(november);
        Matcher matcher10 = pattern10.matcher(parsePatternText);

        //regex for december that parses for the date and makes sure that the day is not too high for the month
        String december = "([1][2]-[0-2][0-9]-[0-9]{4})|([1][2]-[3][0-1]-[0-9]{4})" +
                "|(([1][2][/][0-2][0-9][/][0-9]{4})|([1][2][/][3][0-1][/][0-9]{4}))";
        Pattern pattern11 = Pattern.compile(december);
        Matcher matcher11 = pattern11.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into january");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
            //System.out.println("fell into february");
            System.out.println("found the text '"
                    + matcher1.group() + "' starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
            //System.out.println("fell into march");
            System.out.println("found the text '"
                    + matcher2.group() + "' starting at index "
                    + matcher2.start()
                    + " and ending at index "
                    + matcher2.end());
            found = true;
        }
        while (matcher3.find()) {
            //System.out.println("fell into april");
            System.out.println("found the text '"
                    + matcher3.group() + "' starting at index "
                    + matcher3.start()
                    + " and ending at index "
                    + matcher3.end());
            found = true;
        }
        while (matcher4.find()) {
            //System.out.println("fell into may");
            System.out.println("found the text '"
                    + matcher4.group() + "' starting at index "
                    + matcher4.start()
                    + " and ending at index "
                    + matcher4.end());
            found = true;
        }
        while (matcher5.find()) {
            //System.out.println("fell into june");
            System.out.println("found the text '"
                    + matcher5.group() + "' starting at index "
                    + matcher5.start()
                    + " and ending at index "
                    + matcher5.end());
            found = true;
        }
        while (matcher6.find()) {
            //System.out.println("fell into july");
            System.out.println("found the text '"
                    + matcher6.group() + "' starting at index "
                    + matcher6.start()
                    + " and ending at index "
                    + matcher6.end());
            found = true;
        }
        while (matcher7.find()) {
            //System.out.println("fell into august");
            System.out.println("found the text '"
                    + matcher7.group() + "' starting at index "
                    + matcher7.start()
                    + " and ending at index "
                    + matcher7.end());
            found = true;
        }
        while (matcher8.find()) {
//            System.out.println("fell into september");
            System.out.println("found the text '"
                    + matcher8.group() + "' starting at index "
                    + matcher8.start()
                    + " and ending at index "
                    + matcher8.end());
            found = true;
        }
        while (matcher9.find()) {
//            System.out.println("fell into october");
            System.out.println("found the text '"
                    + matcher9.group() + "' starting at index "
                    + matcher9.start()
                    + " and ending at index "
                    + matcher9.end());
            found = true;
        }
        while (matcher10.find()) {
//            System.out.println("fell into november");
            System.out.println("found the text '"
                    + matcher10.group() + "' starting at index "
                    + matcher10.start()
                    + " and ending at index "
                    + matcher10.end());
            found = true;
        }
        while (matcher11.find()) {
//            System.out.println("fell into december");
            System.out.println("found the text '"
                    + matcher11.group() + "' starting at index "
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
        //regex for name with no middle name
        String PNRegex0 = "[a-zA-Z]+[,]{1}\s[a-zA-Z]+";
        Pattern pattern0 = Pattern.compile(PNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        //regex for name with a middle name
        String PNRegex1 = "[a-zA-Z]+[,]{1}\s[a-zA-Z]+,\s[a-zA-Z]+";
        Pattern pattern1 = Pattern.compile(PNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        boolean found = false;
        while (matcher1.find()) {
//            System.out.println("fell into Regex1");
            System.out.println("found the text '"
                    + matcher1.group() + "' starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher0.find() && !found) {
//            System.out.println("fell into Regex0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid name");
        }
    }

    public static void emailChecker(String parsePatternText) {
        //regex that parses for any length combination of upper or lowercase letters, numbers and periods, then an @
        //sign, then any combination of upper or lowercase letters followed by a period and 3 more letters for domain
        //suffix
        String word0 = "[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-zA-Z]{3}";
        Pattern pattern0 = Pattern.compile(word0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
            //System.out.println("fell into word0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid email");
        }
    }

    public static void phoneNumberChecker(String parsePatternText) {
        //regex for phone number with no parenthesis and with dashes
        String PNRegex0 = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
        Pattern pattern0 = Pattern.compile(PNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        //regex for phone number with no parenthesis and with whitespace
        String PNRegex1 = "[0-9]{3}\s[0-9]{3}\s[0-9]{4}";
        Pattern pattern1 = Pattern.compile(PNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        //regex for phone number with no parenthesis and no whitespace
        String PNRegex2 = "[0-9]{10}";
        Pattern pattern2 = Pattern.compile(PNRegex2);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        //regex for phone number with parenthesis and with dashes
        String PNRegex3 = "[(]{1}[0-9]{3}[)]{1}-[0-9]{3}-[0-9]{4}";
        Pattern pattern3 = Pattern.compile(PNRegex3);
        Matcher matcher3 = pattern3.matcher(parsePatternText);

        //regex for phone number with parenthesis and with whitespace
        String PNRegex4 = "[(]{1}[0-9]{3}[)]{1}\s[0-9]{3}\s[0-9]{4}";
        Pattern pattern4 = Pattern.compile(PNRegex4);
        Matcher matcher4 = pattern4.matcher(parsePatternText);

        //regex for phone number with parenthesis and with no whitespace
        String PNRegex5 = "[(]{1}[0-9]{3}[)]{1}[0-9]{7}";
        Pattern pattern5 = Pattern.compile(PNRegex5);
        Matcher matcher5 = pattern5.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
//            System.out.println("fell into Regex0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
//            System.out.println("fell into Regex1");
            System.out.println("found the text '"
                    + matcher1.group() + "' starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
//            System.out.println("fell into Regex2");
            System.out.println("found the text '"
                    + matcher2.group() + "' starting at index "
                    + matcher2.start()
                    + " and ending at index "
                    + matcher2.end());
            found = true;
        }
        while (matcher3.find()) {
//            System.out.println("fell into Regex3");
            System.out.println("found the text '"
                    + matcher3.group() + "' starting at index "
                    + matcher3.start()
                    + " and ending at index "
                    + matcher3.end());
            found = true;
        }
        while (matcher4.find()) {
//            System.out.println("fell into Regex4");
            System.out.println("found the text '"
                    + matcher4.group() + "' starting at index "
                    + matcher4.start()
                    + " and ending at index "
                    + matcher4.end());
            found = true;
        }
        while (matcher5.find()) {
//            System.out.println("fell into Regex5");
            System.out.println("found the text '"
                    + matcher5.group() + "' starting at index "
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
        //regex for SSN with dashes
        String SSNRegex0 = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern0 = Pattern.compile(SSNRegex0);
        Matcher matcher0 = pattern0.matcher(parsePatternText);

        //regex for SSN with whitespace
        String SSNRegex1 = "[0-9]{3}\s[0-9]{2}\s[0-9]{4}";
        Pattern pattern1 = Pattern.compile(SSNRegex1);
        Matcher matcher1 = pattern1.matcher(parsePatternText);

        //regex for SSN with no whitespace
        String SSNRegex2 = "[0-9]{9}";
        Pattern pattern2 = Pattern.compile(SSNRegex2);
        Matcher matcher2 = pattern2.matcher(parsePatternText);

        boolean found = false;
        while (matcher0.find()) {
//            System.out.println("fell into SSNRegex0");
            System.out.println("found the text '"
                    + matcher0.group() + "' starting at index "
                    + matcher0.start()
                    + " and ending at index "
                    + matcher0.end());
            found = true;
        }
        while (matcher1.find()) {
//            System.out.println("fell into SSNRegex1");
            System.out.println("found the text '"
                    + matcher1.group() + "' starting at index "
                    + matcher1.start()
                    + " and ending at index "
                    + matcher1.end());
            found = true;
        }
        while (matcher2.find()) {
//            System.out.println("fell into SSNRegex2");
            System.out.println("found the text '"
                    + matcher2.group() + "' starting at index "
                    + matcher2.start()
                    + " and ending at index "
                    + matcher2.end());
            found = true;
        }
        if (!found) {
            System.out.println("Match not found");
        } else {
            System.out.println("Valid SSN");
        }
    }
}
