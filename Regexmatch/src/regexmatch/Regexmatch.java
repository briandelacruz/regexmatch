
package regexmatch;

/**
 *
 * @author bddelacruz
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
        
public class Regexmatch {

    public static boolean isTrue(String str){
        return str.matches("True");
    }
    
    public static boolean containsFalse(String str){
        return str.matches(".*false.*");
    
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("asdcxzfalseasdxz"));
        Scanner sc = new Scanner (new FileReader("input.txt"));
        //Reads the file input.txt
        
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
    
}
