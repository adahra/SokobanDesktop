package org.pemrogramangame.kelompok3.sokobandesktop;

import java.util.ArrayList;

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
