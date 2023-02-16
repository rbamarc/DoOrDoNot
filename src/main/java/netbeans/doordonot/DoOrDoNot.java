
package netbeans.doordonot;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class DoOrDoNot {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Should i do it? (y/n)");
        boolean doIt;
        
        if (input.next().equals("y")){
            doIt = true; //DO IT!!
        } else {
            doIt = false; // DONT YOU DARE
        }
        
        boolean iDidIt = false;
        
        do {
            iDidIt = true;
            break;
        } while (doIt);
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know i said not to.... but i totally did anyways");
        } else {
            System.out.println("Don't look at me, i didn't do anything!");
        }
    }
}
