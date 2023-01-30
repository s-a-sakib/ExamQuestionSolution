package QuestionThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Find {
    public static void findAndPrint(String wordToFind, String filename)
    {
        try (Scanner inFile = new Scanner(new File(filename)))
        {
            while (inFile.hasNextLine())
            {
                String line = inFile.nextLine();
                if (line.contains(wordToFind))
                {
                    System.out.printf("%s: %s\n", filename, line);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(filename + " not found!");
        }
    }

    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            String wordToFind = args[0];

            for (int i = 1; i < args.length; i++)
            {
                findAndPrint(wordToFind, args[i]);
            }
        }
    }
}
