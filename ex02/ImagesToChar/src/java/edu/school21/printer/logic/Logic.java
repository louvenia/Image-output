package edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Logic {
    private byte[] contentsArr;

    private void printBMP(String white, String black) {
        ColoredPrinter color = new ColoredPrinter();
        for(int i = 0; i < contentsArr.length; i++) {
            if(i % 16 == 0) {
                System.out.println();
            }
            if(contentsArr[i] == 1) {
                color.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(white));
            } else if(contentsArr[i] == 0) {
                color.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(black));
            }
        }
    }

    public void inputBmp(String white, String black) {
        try {
            File f = new File("src/resources/image.bmp");
            BufferedImage image = ImageIO.read(f);
            contentsArr = (byte[])image.getRaster().getDataElements(0,0,16,16,null);
            printBMP(white, black);
        } catch (Exception error) {
            System.out.println();
            System.err.println(error.getMessage());
            System.exit(-1);
        }
    }
}
