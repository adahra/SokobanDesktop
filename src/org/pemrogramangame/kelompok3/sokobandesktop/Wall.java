package org.pemrogramangame.kelompok3.sokobandesktop;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Wall extends Actor {
	
    public Wall(int x, int y) {
        super(x, y);
        try {
            URL urlLocation = this.getClass().getResource("wall.png");
            ImageIcon imageIcon = new ImageIcon(urlLocation);
            Image image = imageIcon.getImage();
            this.setImage(image);
        } catch (Exception e) {
            System.err.println("DEBUG: Kelas Wall tidak dapat menemukan file wall.png");
        }
    }
	
}
