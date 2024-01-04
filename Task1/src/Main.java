import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine = new Wine("Кристал", "Шампанское", "Франция",
                LocalDate.of(1968, 10, 26),"Игристое");
        wine.bottlingDate(LocalDate.now());
    }
}