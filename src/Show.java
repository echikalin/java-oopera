import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private String director;
    static ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public static void addActor(Actor actor) {
        for (Actor currentActor : listOfActors) {
            if (currentActor.equals(actor)) {
                System.out.println("Такой актёр уже присутствует в списке!");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public static void replaceActor(Actor actor, Actor newActor) {
        for (Actor currentActor : listOfActors) {
            if (currentActor.equals(actor)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
    }
}
