
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.coobird.thumbnailator.Thumbnails;
import passportcheck.ChecksumCalculator;
import passportcheck.PassportCheck;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntko
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            File path = new File(PassportCheck.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            Thumbnails.of(new File(path, "\\passportcheck\\tick.png"))
                    .size(250, 250)
                    
                    .asBufferedImage();
                    
        } catch (URISyntaxException ex) {
            Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestMain.class.getName()).log(Level.SEVERE, null, ex);
        }
}

