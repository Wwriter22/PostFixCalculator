import java.io.*;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {

        PostFix pf = new PostFix();

        System.out.println(pf.calculate("2 3 + 5 3 7 * - +"));

    }
}
