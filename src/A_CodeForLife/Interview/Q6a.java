package A_CodeForLife.Interview;

public class Q6a {
    public static void main(String[] args) {

        String password = "asdFH98.";
        System.out.println("isValid(password) = " + isValid(password));
    }

    public static boolean isValid(String password) {

        String upperCase = "(.*[A-Z, a-z, 0-9, !#$%&'()*+,-./:;<=>?@^_{|}~ ].*)"; // REGEX
        //String lowerCase="(.*[a-z].*)"; // REGEX
        //String number="(.*[0-9].*)"; // REGEX
        //String specialChar="(.*[!#$%&'()*+,-./:;<=>?@^_{|}~].*)";

        boolean hasUpper = password.matches(upperCase);
        //boolean hasLower=password.matches(lowerCase);
        //boolean hasNumber=password.matches(number);
        //boolean hasSpecialChar=password.matches(specialChar);
        boolean isValid = false;

        if (password.length() >= 6 && !(password.contains(" "))) {
            if (hasUpper) {
                isValid = true;
            }
        }

        return isValid;
    }
}
