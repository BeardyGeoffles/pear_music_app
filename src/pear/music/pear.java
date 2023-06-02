package pear.music;
import pear.music.data.song;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
// song: title, artist, album, year, no of plays, rating


public class pear {
    public static void main(String[] args) {
      song song1 = new song(
              1, "Frog Prince", "Keane", 300, LocalDateTime.of(2006,6,12,0,0)
      );
        song song2 = new song(
                2, "Bat Out Of Hell", "Meat Loaf", 900, LocalDateTime.of(1977,6,12,0,0)
        );
        song song3 = new song(
                3, "I'd Do Anything For Love (But I Won't Do That)", "Meat Loaf", 1200, LocalDateTime.of(1993,6,12,0,0)
        );


    }
}
