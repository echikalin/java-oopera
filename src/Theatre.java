public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Евгений", "Чикалин", Gender.MALE, 168);
        Actor secondActor = new Actor("Марк", "Зубков", Gender.MALE, 168);
        Actor thirdActor = new Actor("Екатерина", "Петрова", Gender.FEMALE, 170);
        Director firstDirector = new Director("Алексей", "Вечкитов", Gender.MALE, 171);
        Director secondDirector = new Director("Серафима", "Долгова", Gender.FEMALE, 165);
        String musicAuthor = "Пётр Степанов";
        String choreographer = "Алиса Иванова";
        MusicalShow musicalShow = new MusicalShow("Афродита", 160, firstDirector, musicAuthor, "Текст1");
        Ballet ballet = new Ballet("Лебединное озеро", 150, secondDirector, musicAuthor, "Текст2", choreographer);
        Opera opera = new Opera("Приветствие", 200, firstDirector, musicAuthor, "Текст3", 12);

        musicalShow.addActor(secondActor);
        musicalShow.addActor(thirdActor);
        musicalShow.printListOfActors();

        ballet.addActor(firstActor);
        ballet.addActor(secondActor);
        ballet.printListOfActors();

        opera.addActor(firstActor);
        opera.addActor(thirdActor);
        opera.printListOfActors();

        musicalShow.replaceActor(secondActor, firstActor);

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
