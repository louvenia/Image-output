package edu.school21.printer.app;

import com.beust.jcommander.JCommander;
import edu.school21.printer.logic.Args;
import edu.school21.printer.logic.Logic;

import static edu.school21.printer.logic.Args.black;
import static edu.school21.printer.logic.Args.white;

public class Program {
    public static void main(String[] args) {
        try {
            Args arguments = new Args();
            JCommander.newBuilder()
                    .addObject(arguments)
                    .build()
                    .parse(args);

            Logic logic = new Logic();
            logic.inputBmp(white, black);
        } catch (Exception error) {
            System.out.println();
            System.err.println(error.getMessage());
            System.exit(-1);
        }
    }
}
