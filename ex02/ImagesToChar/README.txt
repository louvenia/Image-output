1.  Need to download libraries:
--->    mkdir lib
--->    curl https://repo1.maven.org/maven2/com/beust/jcommander/1.82/jcommander-1.82.jar -o lib/jcommander-1.82.jar
--->    curl https://repo1.maven.org/maven2/com/diogonunes/JCDP/4.0.0/JCDP-4.0.0.jar -o lib/JCDP-4.0.0.jar
2.  Need to create target folder for compiled *.class files, resources and *.jar
--->    mkdir target
3.  You need to migrate the resources folder using the command described below
--->    cp -R src/resources target/
4.  Go to 'target' directory
--->    cd target
5.  It's necessary to extract archives with libraries to the 'target' directory
--->    jar xf ../lib/jcommander-1.82.jar
--->    jar xf ../lib/JCDP-4.0.0.jar
6.  Go back to the root folder of the project (ImagesToChar)
--->    cd ..
7.  Run the command below to compile .java files
--->    javac -cp lib/\* src/java/edu/school21/printer/app/Program.java src/java/edu/school21/printer/logic/*.java -d target
8.  You need to create an application distribution kit - a JAR archive, this can be done using the code below
--->    jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .
9. You can run the *.jar file with the following command
--->    java -jar target/images-to-chars-printer.jar --white=RED --black=GREEN

Input parameters for running the application:
The first argument is to enter the name of the color in capital letters with '=' before the option name (--white);
The second argument is to enter the name of the color in capital letters through '=' before the option name (--black);