import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        for (Actor currentActor : listOfActors) {
            if (currentActor.equals(actor)) {
                System.out.println("Такой актёр уже присутствует в списке!");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor actor, Actor newActor) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(actor)) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр " + actor + " заменён на " + newActor + "!");
        } else {
            System.out.println("Такого актёра нет в списке.");
        }
    }
}
