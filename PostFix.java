/**
 * Postfix
 * Create a method that properly integrates the postfix calculation method
 * Author: William Writer
 * Collaborator(s): Jake
 * Collaboration: essentially told me whenever I did something incorrect
 * Date: 11/28/21
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class PostFix {
    // 2 3 + 5 3 7 * - +
    // 5 5 3 7 * - +
    // 5 5 21 - +
    // 5 -16 +
    // -11

    /*
    |    |    |    |    |   |   |    |     |     |   |
    |    |    |    |    |   |   |    |     |     |   |
    |    |    |    |    |   |   |    |     |     |   |
    |    |    |    |    |   |   |    |     |     |   |
    |    |    |    |    |   | 7 |    |     |     |   |
    |    |    |    |    | 3 | 3 | 21 |     |     |   |
    |    |  3 |    | 5  | 5 | 5 | 5  | -16 |     |   |
    | 2  |  2 | 5  | 5  | 5 | 5 | 5  |  5  | -11 |   |
     */
// Calculate method that properally utilizes the postfix
    public int calculate(String eq){
        Stack<Integer> s = new Stack<Integer>();
        String[] newEq = eq.split(" "); // splits up the String into a list of its components
        for(int i = 0; i < newEq.length; i++){
            //System.out.println(s.peek());
            switch (newEq[i]){
                case "+": s.push(s.pop() + s.pop()); break;// adds top two elements in the stack s
                case "-": int var1 = s.pop(); // stores the first pop
                    s.push(s.pop()-var1); break; // subtracts top two elements in the stack correctly
                case "*": s.push(s.pop() * s.pop()); break;// multiplies the first two elements and pushes it.
                case "/": int popper = s.pop(); // stores the first pop
                    s.push(s.pop()/popper); break; // divides first two elements using int division
                default: s.push(Integer.parseInt(newEq[i])); // makes a string into an integer and push it to the stack
            }
        }
        if (s.size() != 1) {
            throw new IllegalArgumentException("Invalid Postfix Notation");
        }
        return s.pop(); //returns the last
    }

}
