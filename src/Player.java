import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private char sign;

    public Player(char sign) {
        this.sign = sign;
    }

    public Player() {
    }

    public char getSign() {
        return sign;
    }

    public void setSign(String sign) {

        if (sign.length() > 1) {
            System.out.println("Вы ввели больше одного симовла, попробуйте еще раз");
            this.setSign(sc.next());
        }

        this.sign = sign.charAt(0);
    }

    @Override
    public String toString() {
        return "Player{" +
                "sign=" + sign +
                '}';
    }
}
