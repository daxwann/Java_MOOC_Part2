
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String str) {
        int widthInSmileys = findWidthInSmileys(str);
        printSmileys(widthInSmileys);
        printStrLayer(str);
        printSmileys(widthInSmileys);
    }

    private static int findWidthInSmileys(String str) {
        int strLen = str.length();

        if (isStrOdd(str)) {
            strLen++;
        }

        strLen += 6;

        return strLen / 2;
    }

    private static boolean isStrOdd(String str) {
        return str.length() % 2 != 0;
    }

    private static void printSmileys(int widthInSmileys) {
        for (int i = 0; i < widthInSmileys; i++) {
            System.out.print(":)");
        }
        System.out.print("\n");
    }

    private static void printStrLayer(String str) {
        System.out.print(":) ");
        System.out.print(str);
        if (isStrOdd(str)) {
            System.out.print(" ");
        }
        System.out.print(" :)");
        System.out.print("\n");
    }
}
