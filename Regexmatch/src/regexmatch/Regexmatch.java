
package regexmatch;

/**
 *
 * @author bddelacruz
 */
public class Regexmatch {

    public static boolean isTrue(String str){
        return str.matches("True");
    }
    
    public static void main(String[] args) {
        System.out.println(isTrue("False"));
    }
    
}
