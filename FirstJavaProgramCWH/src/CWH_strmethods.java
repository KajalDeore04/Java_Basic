import java.util.Locale;

public class CWH_strmethods {
    public static void main(String[] args) {
        String a  = "pumpkin    " ;

        System.out.println(+a.length());

        System.out.println(a.toLowerCase());

        System.out.println(a.toUpperCase());

        System.out.println(a.trim());

        System.out.println(a.substring(3));
        System.out.println(a.substring(2,4));

        System.out.println(a.replace('p','y'));
        System.out.println(a.replace("kin","mun"));

        System.out.println(a.startsWith("tar"));
        System.out.println(a.endsWith("kind"));

        System.out.println(a.charAt(3));
        //returns a because starts from 0

        System.out.println(a.indexOf("k"));
        System.out.println(a.indexOf("l",2));

        System.out.println(a.lastIndexOf('i'));
        System.out.println(a.lastIndexOf("m", 3));

        System.out.println(a.equals("Pumpkin"));
        System.out.println(a.equalsIgnoreCase("pumpkin "));
    }
}
