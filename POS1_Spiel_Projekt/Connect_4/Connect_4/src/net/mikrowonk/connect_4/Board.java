package net.mikrowonk.connect_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private final int lines;
    private final int columns;
    private String[][] boardMatrix;
    private int[] coinsPutPerColumn;


    public Board(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.boardMatrix = new String[lines][columns];
        this.coinsPutPerColumn = new int[columns];
        for (int integer: coinsPutPerColumn) {
            integer = 0;
        }
        for (int i = 0; i < lines; i++) {
            int j = 0;
            for (; j < columns; j++) {
                this.boardMatrix[i][j] = "o";
            }
        }
    }

    public void showBoard() {
        for (int i = lines - 1; i >= 0 ; i--) {
            System.out.println(Arrays.toString(boardMatrix[i]));
        }
    }

    public void decideMove(boolean isPlayer, int column) {
        String moveSign;
        if (isPlayer) {
            moveSign = "P"; // Player
        } else {
            moveSign = "E"; // Enemy
        }
        this.boardMatrix[coinsPutPerColumn[column]][column] = moveSign;
        coinsPutPerColumn[column]++;
    }

    public int getCoinsPutPerColumn(int index) {
        return coinsPutPerColumn[index];
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public String[][] getBoardMatrix() {
        return boardMatrix;
    }

    public boolean hasWon(String sign) {
        // horizontalCheck
        for (int j = 0; j < columns-3 ; j++ ){
            for (int i = 0; i< lines; i++){
                if (this.boardMatrix[i][j] == sign && this.boardMatrix[i][j+1] == sign && this.boardMatrix[i][j+2] == sign && this.boardMatrix[i][j+3] == sign){
                    return true;
                }
            }
        }
        // verticalCheck
        for (int i = 0; i<columns-3 ; i++ ){
            for (int j = 0; j<this.lines; j++){
                if (this.boardMatrix[i][j] == sign && this.boardMatrix[i+1][j] == sign && this.boardMatrix[i+2][j] == sign && this.boardMatrix[i+3][j] == sign){
                    return true;
                }
            }
        }
        // ascendingDiagonalCheck
        for (int i=3; i<columns; i++){
            for (int j=0; j<lines-3; j++){
                if (this.boardMatrix[i][j] == sign && this.boardMatrix[i-1][j+1] == sign && this.boardMatrix[i-2][j+2] == sign && this.boardMatrix[i-3][j+3] == sign)
                    return true;
            }
        }
        // descendingDiagonalCheck
        for (int i=3; i<columns; i++){
            for (int j=3; j<lines; j++){
                if (this.boardMatrix[i][j] == sign && this.boardMatrix[i-1][j-1] == sign && this.boardMatrix[i-2][j-2] == sign && this.boardMatrix[i-3][j-3] == sign)
                    return true;
            }
        }
        return false;
    }
}