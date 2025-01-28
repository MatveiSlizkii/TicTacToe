import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        TicTacBoard board = new TicTacBoard(3);
        Scanner sc = new Scanner(System.in);
        GameSteps gs = new GameSteps(board);

        Player player1 = new Player();
        Player player2 = new Player();
        // Знакомство с игроками
        System.out.println("Игра началась. Приятной игры. Да победит сильнейший");
        System.out.println("Игроку #1 приготовиться, выберите свой символ для игры");
        player1.setSign(sc.next());
        System.out.println("Игроку #2 приготовиться, выберите свой символ для игры");
        player2.setSign(sc.next());

        System.out.println("Игрок #1 - " + player1.getSign());
        System.out.println("Игрок #2 - " + player2.getSign());
        board.printBoard();
        System.out.println("Начинаем");

        //здесь должен быть цикл самой игры
        int count = 0;
        boolean isWin = false;

        while (!isWin) {
            Player tmpPlayer;
            if (count % 2 == 0) {
                tmpPlayer = player1;
            } else {
                tmpPlayer = player2;
            }

            System.out.println("Игрок " + tmpPlayer.getSign() + " - укажите ряд и столбец куда поставить ваш знак");
            int row = sc.nextInt();
            int col = sc.nextInt();
            boolean isCorrectStep = board.step(row, col, tmpPlayer);
            if (isCorrectStep) {
                count++;
            } else {
                continue;
            }
            board.printBoard();
            isWin = gs.checkWinner2Players(player1, player2);
        }


    }}
