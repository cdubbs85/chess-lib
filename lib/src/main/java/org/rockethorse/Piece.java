package org.rockethorse;

abstract class Piece {
    public enum Color {WHITE, BLACK}

    private boolean hasMoved = false;

    abstract boolean canMove(int rank, int file);

    public void setHasMoved() {
        this.hasMoved = true;
    }
}
