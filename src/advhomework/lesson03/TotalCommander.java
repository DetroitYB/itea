package advhomework.lesson03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TotalCommander {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Temp");
        File file2 = null;

        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        while(true){
            switch (in.next()) {

                case("exit") :
                    System.exit(0);
                    break;
                case("ls"):
                    getFiles(file.listFiles());
                    break;
                case(".."):
                    String s = file.getAbsolutePath().substring(0,file.getAbsolutePath().lastIndexOf("\\"));
                    System.out.println(s);
                    file = new File(s);
                    break;
                case("-copy"):
                    System.out.println("Enter name of file for copy: ");
                    String fileName = in1.nextLine();
                    System.out.println("Enter path to copy in: ");
                    String path = in1.nextLine();
                    File pathToCopy = new File(path);
                    if(pathToCopy.exists()) {
                        pathToCopy = new File(path + "\\" + fileName);
                        Files.copy(new File(file.getAbsolutePath()+"\\"+fileName).toPath(), pathToCopy.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                    break;
                case ("-rm"):
                    System.out.println("Enter name of file to delete(current location)");
                    String fileName1 = in1.nextLine();
                    file2 = new File(file.getAbsolutePath() + "\\" + fileName1);

                    if(file2.exists()) {
                        System.out.println("Are you sure that you want to delete this file : " + fileName1 + "[Y\\N]");
                        String wantToDelete = in1.nextLine();
                        if(wantToDelete.equals("Y")){
                            Files.delete(Paths.get(file.toPath() + "\\" + fileName1));
                        }
                    }
                    break;
                case ("-mkdir"):
                    System.out.println("Enter the name of the desired a directory: ");
                    String createFolderName = file.getAbsolutePath() + "\\" + in1.nextLine();
                    file2 = new File(createFolderName);
                    System.out.println(file2.toString());
                    if(file2.mkdir()){
                        System.out.println("Folder Created");
                    }else{
                        System.out.println("Folder Not Created");
                    }
                    in1.close();
                    break;
                case ("cd"):
                    String ss  = in.next();

                    File checkFile = new File(file.getAbsolutePath() + "\\" +ss);
                    if(checkFile.exists()){
                        file = checkFile;
                    }else{
                        System.out.println(file.toString());
                    }
                    break;
                default:
                    System.out.println("Current Path " + file.getAbsolutePath());

            }
        }
    }
    public static void getFiles(File[] file){
        List<File> arrFiles = new ArrayList<>();

        for( File files : file){
            if(files.isDirectory()){
                System.out.println(files.getName());
            }else{
                arrFiles.add(files);
            }
        }
        for (File arrFile : arrFiles) {
            System.out.println(arrFile.getName());

        }
    }
}
