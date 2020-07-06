package validate;

import entity.Candidate;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    static Scanner input = new Scanner(System.in);

    // method return input is integer number   ( check choice, birthdate, ..)
    public static int getInt(String mess, int min, int max) {
        String inputInt = "";
        while (true) {
            System.out.print(mess);
            inputInt = input.nextLine().trim();
            if (inputInt.isEmpty()) {
                System.err.println("Input is empty, please input data.");
            }
            try {
                int number = Integer.parseInt(inputInt);
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Input out of ranger !!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid value !!");
            }
        }
    }

    // getString() 
    public static String getString(String mess) {
        String inputString = "";
        while (true) {
            System.out.print(mess);
            inputString = input.nextLine().trim();
            if (inputString.isEmpty()) {
                System.err.println("Input is empty, please input data");
            } else {
                return inputString;
            }
        }
    }

    // getName () : method use for firstName and lastName with fomat : Aelbrecht Stefan
    public static String getName(String mess) {
        String inputName = "";
        while (true) {
            System.out.print(mess);
            inputName = input.nextLine().toLowerCase().trim();
            if (inputName.isEmpty()) {
                System.err.println("Input is empty, please input data");
            } else {
                return inputName.replace((inputName.charAt(0) + ""), (inputName.charAt(0) + "").toUpperCase());
            }
        }

    }

    // Phone : is  number with minimum  10 character 
    public static String getPhone(String mess) {
        String inputPhone = "";
        while (true) {
            System.out.print(mess);
            inputPhone = input.nextLine();
            if (inputPhone.matches("\\d{10,}")) {
                return inputPhone;
            } else {
                System.err.println("The phone is number with minimum 10 characters");
            }
        }
    }

    // email : with fomat < account name > @ <domain>.com
    //validEmail = "[A-Za-z]+[\\w]*@[\\w]+(\\.[A-Za-z]+){1,3}"
    public static String getEmail(String mess) {
        String inputMail = "";
        while (true) {
            System.out.print(mess);
            inputMail = input.nextLine();
            if (inputMail.matches("[A-Za-z]+[\\w]*@[\\w]+(\\.[A-Za-z]+){1,3}")) {
                return inputMail;
            } else {
                System.err.println("Email must be fomat <account name>@<domain>.com");
            }
        }
    }

    // rank : of graduation with one of 4 value < exellence, good, fair, poor >
    public static String getRank(String mess) {
        String[] data = {"exellence", "good", "fair", "poor"};
        String inputRank = "";
        int count = 0;
        while (true) {
            System.out.print(mess);
            inputRank = input.nextLine().toLowerCase();
            for (String x : data) {
                if (x.equals(inputRank)) {
                    count = 1;
                    return inputRank;
                }
            }
            if (count == 0) {
                System.out.println("Rank of graduation with one of 4 value: exellence, good, fair, poor");
            }
        }
    }

    // check ID , phone , email: 
    public static boolean checkExisted(String name, ArrayList<Candidate> list) {
        boolean isExist = false;
        for (Candidate x : list) {
            if (x.getId().equals(name) || x.getEmail().equals(name) || x.getPhone().equals(name)) {
                isExist = true;
            }
        }
        return isExist;
    }



}
