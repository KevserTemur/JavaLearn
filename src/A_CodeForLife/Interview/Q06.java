package A_CodeForLife.Interview;

import java.util.Scanner;

public class Q06 {

 //   6  -->>  Write a return method that can verify if a password is valid or not.
 //
 //   requirements:
 //   Password MUST be at least have 6 characters and should not contain space
 //   Password should at least contain one upper case letter
 //   Password should at least contain one lowercase letter
 //   Password should at least contain one special characters
 //   Password should at least contain a digit
 //
 //   if all requirements above are met, the method returns true, otherwise returns false


        /*6  -->>  Write a return method that can verify if a password is valid or not.
        requirements:
        Password MUST be at least have 6 characters and should not contain space
        Password should at least contain one upper case letter
        Password should at least contain one lowercase letter
        Password should at least contain one special characters
        Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
    */
        static String spesials = "!#$%&'()*+,-./:;<=>?@[\\]^_{|}~";
        static String digits = "0123456789";
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bir parola belirleyiniz :");
            String paswd = sc.nextLine();
            if (checkValidate(paswd)) {
                System.out.println(paswd+ " -> Şifre geçerlilik kriterlerini taşıdığından uygundur.");
            } else {
                System.out.println(paswd+ " -> Şifre geçerlilik kriterlerine uygun değildir.");
            }
            System.out.println("paswd = " + paswd);
        }   //main sonu
        public static boolean checkValidate(String password) {
            boolean a = true;
            System.out.println("isincludeSpace = " + checkSpaces(password));
            System.out.println("special = " + checkSpecial(password));
            System.out.println("lower = " + checkLower(password));
            System.out.println("upper = " + checkUpper(password));
            System.out.println("length = " + checkLength(password));
            System.out.println("isincludeDigit = " + checkDigit(password));
            if ((!checkLower(password))   ||
                    (!checkUpper(password))   ||
                    (!checkDigit(password))   ||
                    (!checkSpaces(password))  ||
                    (!checkSpecial(password)) ||
                    (!checkLength(password)))  {
                return a = false ;
            }
            return a;
        }
        private static boolean checkSpaces(String paswd) {
            return paswd.contains(" ") ? false : true;
        }
        private static boolean checkDigit(String paswd) {
            boolean a = false;
            char str[] = paswd.toCharArray();
            for (int i = 0; i < paswd.length(); i++) {
                if (digits.contains(String.valueOf(paswd.charAt(i)))) {
                    a = true;
                    break;
                } else a = false;
            }
            return a;
        }
        private static boolean checkSpecial(String paswd) {
            boolean a = false;
            for (int i = 0; i < paswd.length(); i++) {
                if (spesials.contains(String.valueOf(paswd.charAt(i)))) {
                    a = true;
                    break;
                } else a = false;
            }
            return a;
        }
        private static boolean checkLower(String paswd) {
            boolean a = false;
            char str[] = paswd.toCharArray();
            for (int i = 0; i < paswd.length(); i++) {
                if (paswd.charAt(i) >='a'  && paswd.charAt(i) <= 'z') {
                    a = true;
                    break;
                } else a = false;
            }
            return a;
        }
        private static boolean checkUpper(String paswd) {
            boolean a = false;
            char str[] = paswd.toCharArray();
            for (int i = 0; i < paswd.length(); i++) {
                if (paswd.charAt(i) >='A'  && paswd.charAt(i) <= 'Z') {
                    a = true;
                    break;
                } else a = false;
            }
            return a;
        }
        private static boolean checkLength(String paswd) {
            return paswd.length() > 5 ? true : false;
        }
    }


