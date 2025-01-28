public class TicTacBoard {
    private char[][] board;

    public TicTacBoard(int size) {
        board = new char[size][size]; // Создаем массив 3 на 3
        initializeBoard();
        this.board = board;

    }

    public char[][] getBoard() {
        return board;
    }

    /**
     * Заполняем массив символом '-'
     */
    private void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * выводит доску
     */
    public void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    /**
     * Пользователь указывает ряд и столбец в котором надо поставить свой символ,
     * ВАЖНО!!! Пользователь указывает данные в человеческом исчеслении
     *
     * @param row    ряд
     * @param col    столбец
     * @param player   игрок
     * @return статус успеха действия
     */
    public boolean step(int row, int col, Player player ) {
        char playerSign = player.getSign();
        if (row > board.length || row < 1 || col > board.length || col < 1 || this.board[row - 1][col - 1] != '-') {
            System.out.println("Вы указали неверные значение поля, попробуйте еще раз");
            return false;
        }
        this.board[row - 1][col - 1] = playerSign ;
        return true;
    }

}
