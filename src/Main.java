import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        TicTacBoard board = new TicTacBoard();
        Scanner sc = new Scanner(System.in);
        GameSteps gs = new GameSteps();
        char player1 = 0;
        char player2 = 0;


        System.out.println("Игра началась. Приятной игры. Да победит сильнейший");

        // Знакомство с игроками
        for (int i = 0; i < 2; i++) {
            boolean tmp = false;
            String input = null;
            while (!tmp) {
                tmp = true;
                System.out.println("Игроку #" + (i + 1) + " приготовиться, выберите свой символ для игры");
                input = sc.next();
                if (input.length() > 1) {
                    System.out.println("Игрок #" + (i + 1) + "  вы ввели больше одного симовла, попробуйте еще раз");
                    tmp = false;
                } else {
                    if (i % 2 == 0){
                        player1 = input.charAt(0);
                    } else {
                        player2 = input.charAt(0);
                    }
                }
            }

        }
        System.out.println("Игрок #1 - " + player1);
        System.out.println("Игрок #2 - " + player2);
        board.printBoard();
        System.out.println("Начинаем");

        //здесь должен быть цикл самой игры
        int count = 0;
        boolean isWin = false;

        while (!isWin) {
            char tmpPlayer;
            if (count % 2 == 0) {
                tmpPlayer = player1;
            } else {
                tmpPlayer = player2;
            }

            System.out.println("Игрок " + tmpPlayer + " - укажите ряд и столбец куда поставить ваш знак");
            int row = sc.nextInt();
            int col = sc.nextInt();
            boolean isCorrectStep = board.step(row, col, tmpPlayer);
            if (isCorrectStep) {
                count++;
            } else {
                continue;
            }
            board.printBoard();
            isWin = gs.checkWinner2Players(board, player1, player2);
        }


    }}
