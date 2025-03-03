package org.rockethorse;

public class Pawn extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
