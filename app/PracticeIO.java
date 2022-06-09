package app;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeIO {

    public static void main(String[] args) {

        Path p = Paths.get("C:/Users/user/VTTP/practice/day03/readme.txt");
        File f =p.toFile();
        Path file = Paths.get("C:/Users/user/VTTP/practice/day03/readme.txt");
        if(!f.exists()){
            System.out.println("The File does not exists");
        } else if(f.isFile()){
            System.out.printf("The Size of the file is %d\n",f.length());
        } else {
            //System.out.println("It is a directory");
            for(File file: f.listFiles()){
                System.out.printf("filename: %s\n",f.getName());
            }
        } 
        
    }
    
}
