public class Director extends Person {
    private int numberOfShows;

    public Director(Person person, int numberOfShows) {
        super(person.name, person.surname, person.gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр{" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname +
                '}';
    }
}
