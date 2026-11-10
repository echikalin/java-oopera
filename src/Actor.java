import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(Person person, int height) {
        super(person.name, person.surname, person.gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр{" +
                "имя=" + name +
                ", фамилия='" + surname + '\'' +
                ", рост=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                gender == actor.gender &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
