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
public class IF110119011Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Film fl = new Film();
        
        System.out.println("====Daftar Film Sedang Tayang====");
        fl.filmName = "Venom";
        fl.filmGenre = "Action, Horror, Scifi";
        fl.filmRating = 8.5;
        fl.filmDuration = 120;
        fl.daftarFilm(fl.filmName, fl.filmGenre, fl.filmRating, fl.filmDuration);
        
        System.out.println();
        
        fl.filmName = "Small Foot";
        fl.filmGenre = "Animation";
        fl.filmRating = 9.0;
        fl.filmDuration = 96;
        fl.daftarFilm(fl.filmName, fl.filmGenre, fl.filmRating, fl.filmDuration);
        
        System.out.println();
        
        fl.filmName = "Crazy Rich Asian";
        fl.filmGenre = "Comedy";
        fl.filmRating = 7.8;
        fl.filmDuration = 119;
        fl.daftarFilm(fl.filmName, fl.filmGenre, fl.filmRating, fl.filmDuration);
        
        System.out.println();
        
        fl.filmName = "Asih";
        fl.filmGenre = "Horror";
        fl.filmRating = 6.0;
        fl.filmDuration = 100;
        fl.daftarFilm(fl.filmName, fl.filmGenre, fl.filmRating, fl.filmDuration);
    }
    
}
