import java.io.File;

public class WriteToFile {
  public static void main(String[] args) {
    // create file object
    File file = new File("./testFile.txt");
    
    try {
      // create new file
      boolean value = file.createNewFile();
      if (value) {
        System.out.print("file succesfully created\n");
      } else {
        System.out.print("File aready exists!\n");
      }
    } catch(Exception e){
      e.getStackTrace();
    }
  }
}
