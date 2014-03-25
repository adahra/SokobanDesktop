package org.pemrogramangame.kelompok3.sokobandesktop;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Player extends Actor {

    public Player(int x, int y) {
        super(x, y);
        try {
            URL urlLocation = this.getClass().getResource("sokoban.png");
            ImageIcon imageIcon = new ImageIcon(urlLocation);
            Image image = imageIcon.getImage();
            this.setImage(image);
        } catch (Exception e) {
            System.err.println("DEBUG: Kelas Player tidak dapat menemukan file sokoban.png");
        }
    }
	
    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }

}
