import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    String password = scanner.nextLine();
    scanner.close();
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update(password.getBytes());
    byte[] digest = md.digest();
    String myHash = javax.xml.bind.DatatypeConverter.printHexBinary(digest).toLowerCase();
    System.out.println(myHash);
    }
}
