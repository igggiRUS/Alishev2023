package Day07;

public class Player {
    // stamina выносливость
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)  // если игроков на поле больше 6 то добавляться не будут
            countPlayers++;
    }

    public void run() {
        if (stamina == 0) // если выносливость 0 то уменьшаться не будет
            return;
        stamina--;

        if (stamina == 0) // если выносливость == 0 то удаление с поля
            countPlayers--;
    }

    public static void info() { // инфо вызываем не на игроках а на общую статистику класса поле поэтому метод статичный
        if (countPlayers < 6) {
            System.out.println("комманда не полная еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("комманда полная");
        }
    }
}
