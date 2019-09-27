/**
 *
 * @author JuanCa
 */
public class Tests {

    public static void main(String[] args) {
        
        String[] soundsFrog = {"brr", "birip", "brrah", "croac"};
        Animal oFrog = new Animal("Frog", soundsFrog);

        String[] soundsDragonfly = {"fiu", "plop", "pep"};
        Animal oDragonfly = new Animal("Dragonfly", soundsDragonfly);

        String[] soundsCrikety = {"cric-cric", "trri-trri", "bri-bri"};
        Animal oCriket = new Animal("Criket", soundsCrikety);

        Songs oSongs = new Songs("|brr, fiu, cric-cric, brrah"
                + "|pep, birip, trri-trri, croac"
                + "|bri-bri, plop, cric-cric, brrah|");
        
        // test with all Frog sounds:
        for (String sound : oFrog.getSounds()) {
            System.out.println("The remaing sounds from " + sound
                    + ", produced by " + oFrog.getNonmbre() + " are: "
                    + oSongs.remaingSounds(sound, oSongs.getSongs()));
        }

        // test with all Dragonfly sounds:
        for (String sound : oDragonfly.getSounds()) {
            System.out.println("The remaing sounds from " + sound
                    + ", produced by " + oDragonfly.getNonmbre()
                    + " are: " + oSongs.remaingSounds(sound, oSongs.getSongs()));
        }

        // test with all Criket sounds:
        for (String sound : oCriket.getSounds()) {
            System.out.println("The remaing sounds from " + sound
                    + ", produced by " + oCriket.getNonmbre()
                    + " are: " + oSongs.remaingSounds(sound, oSongs.getSongs()));
        }
    }
}