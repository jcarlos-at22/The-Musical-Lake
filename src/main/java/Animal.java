
/**
 *
 * @author Juan Carlos Anasicha
 */
public class Animal {

    private String nonmbre;
    private String[] sounds;

    public Animal(String nonmbre, String[] sounds) {
        this.nonmbre = nonmbre;
        this.sounds = sounds;
    }

    public String getNonmbre() {
        return nonmbre;
    }

    public void setNonmbre(String nonmbre) {
        this.nonmbre = nonmbre;
    }

    public String[] getSounds() {
        return sounds;
    }

    public void setSounds(String[] sounds) {
        this.sounds = sounds;
    }

}
