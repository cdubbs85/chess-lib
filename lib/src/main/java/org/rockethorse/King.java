package org.rockethorse;

public class King extends Piece {
    @Override
    boolean canMove(int rank, int file) {
        return false;
    }
}
