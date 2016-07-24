/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passportcheck;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

/**
 *
 * @author ntko
 */
public class PassportAuthenticator {
    public void Authenticate(){
        try {
            File path = new File(PassportCheck.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            BufferedImage passport = null;
            BufferedImage tick = null;
            
            passport = ImageIO.read(new File(path, "\\passportcheck\\passport.jpg"));
            
            BufferedImage combined = new BufferedImage(passport.getWidth(), 
                    passport.getHeight(), BufferedImage.TYPE_INT_RGB);
            int size = Math.min(passport.getHeight(), passport.getWidth());
            
            tick = Thumbnails.of(new File(path, "\\passportcheck\\tick.png"))
                    .size(size, size)
                    .asBufferedImage();
            
            Graphics g = combined.getGraphics();
            
            g.drawImage(passport, 0, 0, null);
            g.drawImage(tick, 0, passport.getHeight()/6, null);
            
            ImageIO.write(combined, "JPG", new File(path, "passportAuthenticated.jpg"));
            
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(PassportAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
