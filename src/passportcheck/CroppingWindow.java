/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passportcheck;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author ntko
 */
public class CroppingWindow extends JPanel{
    private BufferedImage cropImage(BufferedImage src, Rectangle rect) {
        BufferedImage dest = src.getSubimage(rect.x, rect.y, rect.width, rect.height);
        return dest; 
   }
}
