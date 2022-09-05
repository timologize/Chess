package com.Chess.engine.player.ai;

import com.Chess.engine.board.Board;

public interface BoardEvaluator {
    int evaluate(Board board, int depth);
}
