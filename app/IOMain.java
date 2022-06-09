package app;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;



public class IOMain{

    public static void main(String[] args) {
        
        Path p = Paths.get("C:/Users/user/VTTP/practice/day03");
        // File object
        File f = p.toFile();
        System.out.println(" ");
        System.out.printf("%s\n%s\n%s\n%s\n", p.toAbsolutePath(),p.getRoot(),p.getParent(),p.getFileName());
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",f.getAbsolutePath(),f.exists(),f.getAbsoluteFile(),f.getParentFile(),f.getName(),f.toPath());

        /*
        toAbsolutePath() = c:\..\..\day03
        getRoot() = c:\
        getParent() = c:\..\..\practice
        getFileName() = day03
        exists() = true/false
        getAbsoluteFile() = c:\..\..\day03
        getParentFile() = c:\..\..\practice
        getName() = day03
        toPath() = c:\..\..\day03
        */
        File hostFile = new File("C:/Users/user/VTTP/practice/day03");
        File etcDir = new File("/etc");
        System.out.printf("%s is directory? %b\n", hostFile.getName(),hostFile.isDirectory());
        System.out.printf("%s is directory? %b\n", etcDir.getName(),etcDir.isDirectory());
    }

}