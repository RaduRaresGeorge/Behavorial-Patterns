package src.main.java.IMediaPlayer;

import src.main.java.IMediaPlayer.ui.*;

/**
 * src.main.java.IMediaPlayer.Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}