package szachydekorator;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author A5US
 */
public class Piece {

    public static final int TILESIZE = 32;
    private static Image image = new ImageIcon("pieces4.png").getImage();

    private int index, x, y;

    public Piece(int idx, int xx, int yy) {
        index = idx;
        x = xx;
        y = yy;
    }

    public void draw(Graphics2D g) {
        g.drawImage(image, x, y, x + TILESIZE, y + TILESIZE,
                index * TILESIZE, 0, (index + 1) * TILESIZE, TILESIZE, null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveTo(int xx, int yy) {
        x = xx;
        y = yy;
    }
}
