1. Need to create target folder for compiled .class files
--->    mkdir target
2. Run the command below to compile .java files
--->    javac src/java/edu/school21/printer/app/Program.java src/java/edu/school21/printer/logic/Logic.java -d target
3. The following command is used to run the compiled files
--->    java -classpath target edu.school21.printer.app.Program . 0  D:\School_21\Java_Bootcamp.Day04-1\src\ex01\ImagesToChar\src\resources\image.bmp

Input parameters for running the application:
The first argument is to enter a character to be used for white;
The second argument is to enter a character to be used for black;
The third argument is the full path to the image on your disk (*.bmp file; Image size is 16*16 pixels);