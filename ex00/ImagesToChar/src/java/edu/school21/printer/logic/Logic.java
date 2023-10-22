package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Logic {
    private byte[] contentsArr;

    private void replaceChar(String characterA, String characterB) {
        byte[] chByteA, chByteB;
        chByteA = characterA.getBytes();
        chByteB = characterB.getBytes();
        for(int i = 0; i < contentsArr.length; i++) {
            if(contentsArr[i] == 1) {
                contentsArr[i] = chByteA[0];
            } else if(contentsArr[i] == 0) {
                contentsArr[i] = chByteB[0];
            }
        }
    }

    private void printBMP(String[] args) {
        replaceChar(args[0], args[1]);
        for(int i = 0; i < contentsArr.length; i++) {
            if(i % 16 == 0) {
                System.out.println();
            }
            System.out.print((char)contentsArr[i]);
        }
    }

    public void inputBmp(String[] args) {
        try {
            File f = new File(args[2]);
            BufferedImage image = ImageIO.read(f);
            if (image.getWidth() != 16 || image.getHeight() != 16) {
                throw new Exception();
            }
            contentsArr = (byte[])image.getRaster().getDataElements(0,0,16,16,null);
        } catch (Exception error) {
            System.err.println("An error has occurred, possibly the wrong file format or incorrect image size");
            System.exit(-1);
        }
        printBMP(args);
    }
}
