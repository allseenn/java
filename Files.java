import java.io.File;
public class Files{
    public static void main(String[] args) {
        String dirname = System.getProperty("user.dir"); // D:\github\java
        File filename = new File("file.txt"); 
        filename.getAbsolutePath(); // D:\github\java\file.txt
        filename.getName(); // file.txt
        try {
            filename.createNewFile();
            System.out.println("created"); // created
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println(filename.exists()); // true
        }
        filename.getFreeSpace(); // 56628682752
        filename.length(); // 356
        filename.isHidden(); //false
        filename.lastModified(); // 1678613508445
        File newDir = new File("newDir");
        newDir.mkdir(); // true
        newDir.list(); // [Ljava.lang.String;@35fc6dc4
        newDir.listFiles(); // [Ljava.io.File;@35fc6dc4
        // newDir.renameTo(dirname)
        System.out.println(); 
    }
}