
package regexmatch;

/**
 *
 * @author bddelacruz
 */
public class Regexmatch {

    public static boolean isTrue(String str){
        return str.matches("True");
    }
    
    public static boolean containsFalse(String str){
        return str.matches(".*false.*");
    
    }
    
    public static void main(String[] args) {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("asdcxzfalseasdxz"));
    }
    
}
