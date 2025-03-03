package org.rockethorse;

public class Queen extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
