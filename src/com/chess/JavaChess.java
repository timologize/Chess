package com.Chess;

import com.Chess.engine.board.Board;
import com.Chess.gui.Table;

public class JavaChess {
    public static void main(String[] args) {
        Board board = Board.createStandardBoard();
        System.out.println(board);

        Table.get().show();
    }
}
