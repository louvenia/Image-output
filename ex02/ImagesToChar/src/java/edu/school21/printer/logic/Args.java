package edu.school21.printer.logic;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")
public class Args {
    @Parameter(names = "--white")
    public static String white;
    @Parameter(names = "--black")
    public static String black;
}
