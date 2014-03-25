/*
 * Copyright (C) 2014 nauin
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.pemrogramangame.kelompok3.sokobandesktop;

import javax.swing.JFrame;

/**
 *
 * @author nauin
 */
public class Sokoban extends JFrame {
    private final int OFFSET = 30;
    
    public Sokoban() {
        showUI();
    }
    
    private void showUI() {
        Board board = new Board();
        add(board);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);
        setLocationRelativeTo(null);
        setTitle("Sokoban");
    }
    
    public static void main(String[] args) {
        Sokoban sokoban = new Sokoban();
        sokoban.setVisible(true);
    }
}
