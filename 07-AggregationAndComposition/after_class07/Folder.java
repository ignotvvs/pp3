package after_class07;
import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files = new ArrayList<File>();
    
    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Folder fd1 = new Folder("Folder1");
        File f1 = new File("file1.txt", 10, false);
        File f2 = new File("file2.txt", 9, false);
        fd1.addFile(f1);
        fd1.addFile(f2);
        System.out.println(fd1.getFiles());
        File f3 = new File("file3.txt", 11, false);
        fd1.addFile(f3);
        System.out.println(fd1.getFiles());
        fd1.removeFile(f3);
        System.out.println(fd1.getFiles());
    }
}