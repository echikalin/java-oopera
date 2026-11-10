public class MusicalShow {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
