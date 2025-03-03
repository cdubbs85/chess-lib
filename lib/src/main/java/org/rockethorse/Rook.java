package org.rockethorse;

public class Rook extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
