
import java.util.Scanner;

/**
 *
 * @author JuanCa
 */
public class Main {
    public static void main(String[] args) {
        Songs oSongs = new Songs("|brr, fiu, cric-cric, brrah"
                + "|pep, birip, trri-trri, croac"
                + "|bri-bri, plop, cric-cric, brrah|");

        Scanner oScanner = new Scanner(System.in);
        System.out.println("Enter your animal sound: ");
        String sound = oScanner.nextLine();

        System.out.println("The remaing sounds from " + sound
                + ", are: " + oSongs.remaingSounds(sound, oSongs.getSongs()));
    }
}
