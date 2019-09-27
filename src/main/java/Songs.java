
/**
 *
 * @author JuanCa
 */
public class Songs {

    private String songs;

    public Songs(String songs) {
        this.songs = songs;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    public String remaingSounds(String sound, String songs) {
        String result = "";
        int startIndex;

        if (songs.indexOf(sound) != -1) {
            startIndex = songs.substring(songs.indexOf(sound), songs.indexOf(sound) + songs.substring(songs.indexOf(sound), songs.length()).indexOf("|")).indexOf(",");

            if (startIndex != -1) {
                result = songs.substring(songs.indexOf(sound) + startIndex + 2, songs.indexOf(sound) + songs.substring(songs.indexOf(sound), songs.length()).indexOf("|"));
            }
        }
        return result;
    }
}
