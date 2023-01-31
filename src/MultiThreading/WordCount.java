package MultiThreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        for(String FileName : args){
            FileAndWordCount fileAndWordCount = new FileAndWordCount(FileName);
            Thread thread = new Thread(fileAndWordCount);
            thread.start();
        }
    }
}

class FileAndWordCount implements Runnable{
    private int count = 0;
    private String FileName;

    public FileAndWordCount(String fileName) {
        FileName = fileName;
    }

    @Override
    public void run() {
        try (Scanner inFile = new Scanner(new File(FileName)))
        {
            while (inFile.hasNextLine())
            {
                String line = inFile.nextLine();
                count = count + 1;
            }
            System.out.printf("%s: %s\n", FileName, count);
        }catch (FileNotFoundException e)
        {
            System.out.println(FileName + " not found!");
        }
    }
}