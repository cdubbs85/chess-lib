package org.rockethorse;

public class Bishop extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
