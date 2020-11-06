/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan32.daftarfilm;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void daftarFilm(String filmName, String filmGenre, double filmRating, int filmDuration) {
        
        System.out.println("Judul film\t :" + filmName);
        System.out.println("Genre film\t :" +filmGenre);
        System.out.println("Rating film\t :" + filmRating);
        System.out.println("Durasi film\t :" + filmDuration + " Menit");
    }
}
        
