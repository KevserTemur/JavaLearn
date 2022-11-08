package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Pc\\IdeaProjects\\javalearn\\src\\j29_Exceptions\\ebikGabık");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
