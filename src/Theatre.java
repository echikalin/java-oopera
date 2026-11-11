public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Евгений", "Чикалин", Gender.MALE, 168);
        Actor secondActor = new Actor("Марк", "Зубков", Gender.MALE, 168);
        Actor thirdActor = new Actor("Екатерина", "Петрова", Gender.FEMALE, 170);

        Director firstDirector = new Director("Алексей", "Вечкитов", Gender.MALE, 171);
        Director secondDirector = new Director("Серафима", "Долгова", Gender.FEMALE, 165);

        String musicAuthor = "Пётр Степанов";
        String choreographer = "Алиса Иванова";

        MusicalShow musicalShow = new MusicalShow("Афродита", 160,
                firstDirector, musicAuthor, "Текст либретто 1");
        Ballet ballet = new Ballet("Лебединое озеро", 150,
                secondDirector, musicAuthor, "Текст либретто 2", choreographer);
        Opera opera = new Opera("Новая опера", 200,
                firstDirector, musicAuthor, "Текст либретто 3", 12);

        System.out.println("Спектакль \"Афродита\"");
        musicalShow.printLibrettoText();
        System.out.println("Режиссёр " + firstDirector);
        musicalShow.addActor(secondActor);
        musicalShow.addActor(thirdActor);
        System.out.println("Актёры:");
        musicalShow.printListOfActors();
        System.out.println();

        System.out.println("Балет \"Лебединое озеро\"");
        ballet.printLibrettoText();
        System.out.println("Режиссёр " + secondDirector);
        ballet.addActor(firstActor);
        ballet.addActor(secondActor);
        System.out.println("Актёры:");
        ballet.printListOfActors();
        System.out.println();

        System.out.println("Опера \"Новая опера\"");
        opera.printLibrettoText();
        System.out.println("Режиссёр " + firstDirector);
        opera.addActor(firstActor);
        opera.addActor(thirdActor);
        System.out.println("Актёры:");
        opera.printListOfActors();
        System.out.println();

        musicalShow.replaceActor(secondActor, firstActor);
    }
}
