/**
 * PostFixDriver
 * Driver for  PostFixCalculator class
 * Author: Ishan Tandon
 * Collaborator(s):
 * Collaboration:
 * Date: 11/28/21
 **/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PostFixDriver {
    public static void main(String[] args) {

        PostFix pf = new PostFix();//declaration and initialization

        try { //try catch to run through program
            String res = "";
            Scanner s = new Scanner(new File("Tests.txt")); //call to tests file
            BufferedWriter w = new BufferedWriter(new FileWriter("Res.txt")); //calls to res file
            while (s.hasNext()) {
                String[] info = s.nextLine().split("   ");
                res += "Test Case: " + info[0] + " | Is Correct: " //checks to see if the test case is correct
                        + info[1].equals("" + pf.calculate(info[0])) + "\n";
            }
            w.write(res);
            w.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
