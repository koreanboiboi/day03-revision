package app;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Iotest {

    public static void main(String[] args) {
        
        Path readme = Paths.get("C:/Users/user/VTTP/practice/day03/readme.txt");
        //Path p = Path.createFile(readme);
        File f = readme.toFile();

        //File file = Paths.get("C:/Users/user/VTTP/practice/day03/readme.txt");
        if(!f.exists()){
            System.out.printf("The file does not exists");
        }
        else if (f.isFile()){
            System.out.printf("The size of the file is %d\n",f.length());
        }
        else {
            System.out.println("it is a directory");
        }// it is a directory
            System.out.printf("filename: %s\n",f.getName());

    }
    
}
