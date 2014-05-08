package org.pemrogramangame.kelompok3.sokobandesktop;

import javax.swing.JFrame;

public class Sokoban extends JFrame {
    private final int OFFSET = 30;
    
    public Sokoban() {
        showUI();
    }
    
    private void showUI() {
        Board board = new Board();
        add(board);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);
        setLocationRelativeTo(null);
        setTitle("Sokoban");
    }
    
    public static void main(String[] args) {
        Sokoban sokoban = new Sokoban();
        sokoban.setVisible(true);
    }
}
