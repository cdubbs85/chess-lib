package org.rockethorse;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Collections;
import java.util.List;

public class Chessboard {
    private static final int l = 8;
    private static final Space[][] board;

    static {
        board = new Space[l][l];
        for (int rank = 0; rank < l; rank++) {
            for (int file = 0; file < l; file++) {
                Space.Color spaceColor;
                if ((rank + file) % 2 == 0) {
                    spaceColor = Space.Color.DARK;
                }
                else {
                    spaceColor = Space.Color.LIGHT;
                }
                board[rank][file] = new Space(spaceColor);
            }
        }
    }


    private static String[] files = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
    private static String[] ranks = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};

    public Chessboard() {
   }

    public void print() {
        print(Piece.Color.WHITE);
    }

    public void print(Piece.Color orientation) {
        System.out.println("Perspective: " + orientation);
        if (orientation.equals(Piece.Color.WHITE)) {
            printForward();
        }
        else {
            printReverse();
        }
    }

    private void printForward() {
        for (int rank = l - 1; rank >= 0; rank--) {
            String rs = ranks[rank] + " ";
            for (int file = 0; file < l; file++) {
               rs += board[rank][file].getColor().getAbr();
               if (file != l - 1)
                   rs += " ";
            }
            System.out.println(rs);
        }

        String header = "  " + String.join(" ", files);
        System.out.println(header);
    }

    private void printReverse() {
        for (int rank = 0; rank < l; rank++) {
            String rs = ranks[rank] + " ";
            for (int file = l - 1; file >= 0; file--) {
                rs += board[rank][file].getColor().getAbr();
                if (file != 0)
                    rs += " ";
            }
            System.out.println(rs);
        }
        String header = " ";
        for (int i = files.length - 1; i >= 0; i--) {
            header += files[i];
            if (i != 0)
                header += " ";
        }
        System.out.println(header);
    }
}
