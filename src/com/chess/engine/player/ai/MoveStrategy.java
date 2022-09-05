package com.Chess.engine.player.ai;

import com.Chess.engine.board.Board;
import com.Chess.engine.board.Move;

public interface MoveStrategy {
    Move execute(Board board);
    
}
