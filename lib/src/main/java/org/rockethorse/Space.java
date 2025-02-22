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
    private boolean occupied;

    public Space(Color color) {
       this.color = color;
       this.occupied = false;
    }

    public Color getColor() {
        return this.color;
    }
}
