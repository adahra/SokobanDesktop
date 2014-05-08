package org.pemrogramangame.kelompok3.sokobandesktop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PembacaLevel {
    public ArrayList<Level> level;
    
    public Konten konversi(char c) {
        if (c == '#') return Konten.DINDING;
        if (c == '@') return Konten.PEMAIN;
        if (c == '$') return Konten.KOTAK;
        if (c == '.') return Konten.TUJUAN;
        if (c == '*') return Konten.KOTAKTUJUAN;
        if (c == '+') return Konten.PEMAINTUJUAN;
        
        return Konten.KOSONG;
    }
    
    public int bacaLevel(String namaFile) {
        level = new ArrayList<Level>();
        Level levelSekarang = new Level();
        String deskripsi = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(namaFile));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                if (line.trim().equals("")) {
                    line = br.readLine();
                    continue;
                }
                
                if (line.startsWith(";")) {
                    if (levelSekarang.getTinggi() > 0) {
                        level.add(levelSekarang);
                        levelSekarang = new Level();
                    }
                    
                    levelSekarang.setDeskripsi(line.substring(1).trim());
                } else {
                    levelSekarang.tambahBaris(line);
                }
                
                line = br.readLine();
            }
            
            level.add(levelSekarang);
        } catch (IOException ioe) {
            System.out.println("Kesalahan pembacaan berkas level");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                
            } catch (IOException ioe) { }
        }
        
        return level.size();
    }
    
    public int getTinggi(int level) {
        return this.level.get(level).getTinggi();
    }
    
    public int getLebar(int level) {
        return this.level.get(level).getLebar();
    }
    
    public String getDeskripsi(int level) {
        return this.level.get(level).getDeskripsi();
    }
    
    public Konten getTile(int level, int x, int y) {
        return this.level.get(level).getCell(x, y);
    }
}
