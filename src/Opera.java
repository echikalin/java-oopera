public class Opera extends MusicalShow {
    private String choirSize;

    public Opera(MusicalShow musicalShow, String choirSize) {
        super(musicalShow.musicAuthor, musicalShow.librettoText);
        this.choirSize = choirSize;
    }

    public String getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(String choirSize) {
        this.choirSize = choirSize;
    }
}
