package org.rockethorse;

public class Knight extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
