package org.rockethorse;

public class Space {
    public enum Color {
        DARK("D") , LIGHT("L");

        private String abr;

        Color(String abr) {
            this.abr = abr;
        }

        public String getAbr() {
            return this.abr;
        }
    }

    private final Color color;
    private Piece piece;

    public Space(Color color, Piece piece) {
        this.color = color;
        this.piece = piece;
    }

    public Space(Color color) {
        this(color, null);
    }

    public Color getColor() {
        return this.color;
    }

    public boolean occupied() {
        return this.piece != null;
    }

    public boolean place(Piece piece) {
        if (!occupied()) {
            this.piece = piece;
            return true;
        }
        else {
            return false;
        }
    }

    public Piece uplace() {
        Piece temp = this.piece;
        this.piece = null;
        return temp;
    }
}
