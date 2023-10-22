package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

public class Program {
    private static void errorMessage(String message) {
        System.err.println(message);
        System.exit(-1);
    }

    public static void main(String[] args) {
        if(args.length == 2) {
            if(args[0].length() > 1 || args[1].length() > 1) {
                errorMessage("One character must be entered as a display for pixels");
            }
        } else {
            errorMessage("Incorrect number of input arguments");
        }

        Logic logic = new Logic();
        logic.inputBmp(args);
    }
}
