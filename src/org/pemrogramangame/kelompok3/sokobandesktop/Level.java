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

import java.util.ArrayList;

/**
 *
 * @author nauin
 */
public class Level {
    private int lebar = 0;
    public ArrayList<String> baris = new ArrayList<String>();
    private String deskripsi = "";
    
    public int getTinggi() {
        return this.baris.size();
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void tambahBaris(String baris) {
        this.baris.add(baris);
        if (baris.length() > lebar) {
            lebar = baris.length();
        }
    }

    public int getLebar() {
        return this.lebar;
    }
    
    public String getDeskripsi() {
        return this.deskripsi;
    }
    
    public Konten getCell(int x, int y) {
        String brs = this.baris.get(y);
        if (x >= brs.length()) return Konten.KOSONG;
        else return konversi(brs.charAt(x));
    }
    
    public Konten konversi(char c) {
        if (c == '#') return Konten.DINDING;
        if (c == '@') return Konten.PEMAIN;
        if (c == '$') return Konten.KOTAK;
        if (c == '.') return Konten.TUJUAN;
        if (c == '*') return Konten.KOTAKTUJUAN;
        if (c == '+') return Konten.PEMAINTUJUAN;
        return Konten.KOSONG;
    }
    
}
