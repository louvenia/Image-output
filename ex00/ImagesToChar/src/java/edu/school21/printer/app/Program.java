package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import java.io.File;

public class Program {
    private static void errorMessage(String message) {
        System.err.println(message);
        System.exit(-1);
    }

    public static void main(String[] args) {
        if(args.length == 3) {
            File bmpFile = new File(args[2]);
            if(args[0].length() > 1 || args[1].length() > 1) {
                errorMessage("One character must be entered as a display for pixels");
            } else if(!bmpFile.isAbsolute()) {
                errorMessage("You must specify the full path to the image on your disk");
            } else if(!bmpFile.exists()) {
                errorMessage("File does not exist");
            } else if(!bmpFile.getName().endsWith(".bmp")) {
                errorMessage("The file must have the bmp extension");
            }
        } else {
            errorMessage("Incorrect number of input arguments");
        }
        Logic.inputBmp(args);
    }
}
