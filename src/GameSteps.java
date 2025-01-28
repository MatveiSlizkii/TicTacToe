public class GameSteps {

    private TicTacBoard board;

    public GameSteps(TicTacBoard board) {
        this.board = board;
    }

    /**
     * Метод проверяет на выигрыш сразу двух игроков
     *
     * @param player1 игрок #1
     * @param player2 игрок #2
     * @return
     */
    public boolean checkWinner2Players( Player player1, Player player2) {
        if (checkFields(player1)) {
            System.out.println("Выиграл игрок - " + player1.getSign());
            return checkFields(player1);
        } else if (checkFields(player2)) {
            System.out.println("Выиграл игрок - " + player2.getSign());
            return checkFields(player2);
        }
        return false;
    }

    /**
     * Метод проверяет победителя в игре
     *
     * @param player игрок
     * @return булевое значение есть ли победитель
     */


    private boolean checkFields(Player player) {
        char playerSign = player.getSign();
        //проверка по горизонтали и вертикали
        for (int i = 0; i < 2; i++) {
            if ((this.board.getBoard()[0][i] == playerSign &&
                    this.board.getBoard()[1][i] == playerSign &&
                    this.board.getBoard()[2][i] == playerSign) ||
                    (this.board.getBoard()[i][0] == playerSign &&
                            this.board.getBoard()[i][1] == playerSign &&
                            this.board.getBoard()[i][2] == playerSign)) {
                return true;
            }
        }

        // проверка по диагонали
        if ((board.getBoard()[0][0] == playerSign &&
                board.getBoard()[1][1] == playerSign &&
                board.getBoard()[2][2] == playerSign) ||
                (board.getBoard()[0][2] == playerSign &&
                        board.getBoard()[1][1] == playerSign &&
                        board.getBoard()[2][0] == playerSign)) {
            System.out.println("Выиграл игрок - " + playerSign);
        }
        if ((board.getBoard()[0][0] == playerSign &&
                board.getBoard()[1][1] == playerSign &&
                board.getBoard()[2][2] == playerSign) ||
                (board.getBoard()[0][2] == playerSign &&
                        board.getBoard()[1][1] == playerSign &&
                        board.getBoard()[2][0] == playerSign)) {
            return true;
        }
        return false;
    }
}




