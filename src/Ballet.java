public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(MusicalShow musicalShow, String choreographer) {
        super(musicalShow.musicAuthor, musicalShow.librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
