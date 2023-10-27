package ru.mirea.lab4;

public enum Seasons {
    SUMMER("Summer", "О, Лето", 20.0),
    WINTER("Winter", "О, Зима", -3.5),
    AUTUMN("Autumn", "О, а, о, Зеленоглазое такси", 12.9),
    SPRING("Spring", "О, Весна", 15.6);

    private final String season_name;
    private final String season_text;
    private final double season_temp;

    Seasons(String season_name, String season_text, double season_temp) {
        this.season_name = season_name;
        this.season_text = season_text;
        this.season_temp = season_temp;
    }

    public void message(Seasons buff) {
        switch (buff) {
            case SUMMER:
                System.out.println("Season name: " + season_name + "\n" + "Season description: " + season_text + "\n" +
                        "Season temp: " + season_temp);
                break;
            case WINTER:
                System.out.println("Season name: " + season_name + "\n" + "Season description: " + season_text + "\n" +
                        "Season temp: " + season_temp);
                break;
            case SPRING:
                System.out.println("Season name: " + season_name + "\n" + "Season description: " + season_text + "\n" +
                        "Season temp: " + season_temp);
                break;
            case AUTUMN:
                System.out.println("Season name: " + season_name + "\n" + "Season description: " + season_text + "\n" +
                        "Season temp: " + season_temp);
                break;
        }
    }

    public void description(Seasons buff) {
        switch (buff) {
            case SUMMER:
                System.out.println("Season description: " + season_text + "\n");
                break;
            case WINTER:
                System.out.println("Season description: " + season_text + "\n");
                break;
            case SPRING:
                System.out.println("Season description: " + season_text + "\n");
                break;
            case AUTUMN:
                System.out.println("Season description: " + season_text + "\n");
                break;
        }
    }

}