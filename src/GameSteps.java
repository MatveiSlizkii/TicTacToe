public class GameSteps {

    /**
     * Метод проверяет на выигрыш сразу двух игроков
     *
     * @param board   доска ТикТака 3х3
     * @param player1 передается символ игрока #1
     * @param player2 передается символ игрока #2
     * @return
     */
    public boolean checkWinner2Players(TicTacBoard board, char player1, char player2) {
        if (checkFields(board, player1)) {
            System.out.println("Выиграл игрок - " + player1);
            return checkFields(board, player1);
        } else if (checkFields(board, player2)) {
            System.out.println("Выиграл игрок - " + player2);
            return checkFields(board, player2);
        }
        return false;
    }

    /**
     * Метод проверяет победителя в игре
     *
     * @param board  доска ТикТака 3х3
     * @param player передается символ игрока
     * @return булевое значение есть ли победитель
     */


    private boolean checkFields(TicTacBoard board, char player) {
        //проверка по горизонтали и вертикали
        for (int i = 0; i < 2; i++) {
            if ((board.getBoard()[0][i] == player && board.getBoard()[1][i] == player && board.getBoard()[2][i] == player) ||
                    (board.getBoard()[i][0] == player && board.getBoard()[i][1] == player && board.getBoard()[i][2] == player)) {
                return true;
            }
        }

        // проверка по диагонали
        if ((board.getBoard()[0][0] == player && board.getBoard()[1][1] == player && board.getBoard()[2][2] == player) ||
                (board.getBoard()[0][2] == player && board.getBoard()[1][1] == player && board.getBoard()[2][0] == player)) {
            System.out.println("Выиграл игрок - " + player);
        }
        if ((board.getBoard()[0][0] == player && board.getBoard()[1][1] == player && board.getBoard()[2][2] == player) ||
                (board.getBoard()[0][2] == player && board.getBoard()[1][1] == player && board.getBoard()[2][0] == player)) {
            return true;
        }
        return false;
    }
}




