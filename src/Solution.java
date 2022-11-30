import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        File file = new File("G:/Days Gone");
        System.out.println(Arrays.toString(file.listFiles()));
        for(File s : file.listFiles()){
            if(s.isDirectory()){
                System.out.println(s.getName());
            }
        }
        for(File s : file.listFiles()) {
            if (s.isFile()) {
                System.out.print(s.getName());
            }
        }

        Set<Integer> treeSet = new TreeSet<>((o1, o2) -> o2-o1);

    }
}
