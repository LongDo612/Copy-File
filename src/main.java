import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a directory: ");
        String inputDir = scanner.nextLine();
        File file = new File(inputDir);
        String line = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            File newFile = new File("/Users/longdo/CopyFileText/src/NewFile.txt");
            if (!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
            while ((line=bf.readLine())!=null) {
                bw.write(line+"\n");
            }
            bw.flush();
            bf.close();
            bw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Your directory is not exist");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
