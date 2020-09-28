package string;

public class StringTest {

    public static void main(String[] args) {

        var aString = "    Java 11!   .         ";

        System.out.println("repeat: " + aString.repeat(3));
        System.out.println("isBlank: " + aString.isBlank());
        System.out.println("strip: '" + aString.strip()+"'");


        System.out.println();

        var aString2 = '\u2001'+"String    with    space"+ '\u2001';
        // In short: strip() is "Unicode-aware" evolution of trim().
        // A common characteristic of these new methods is that
        //  they use a different (newer) definition of "whitespace" than did old methods such as String.trim().
        //  Bug on trim method: https://bugs.openjdk.java.net/browse/JDK-8200373
        // https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11
        System.out.println("Before: '" + aString2+"'");
        System.out.println("After trim: '" + aString2.trim()+"'");
        System.out.println("After strip: '" + aString2.strip()+"'");

        System.out.println();

        var aString3 = '\u2001'+" \t\t  \n\n "+ '\u2001';//only spaces
        System.out.println("Is Blank: " + aString3.isBlank());

    }
}
