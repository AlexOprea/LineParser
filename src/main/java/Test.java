import helper.CountLines;
import helper.FileReaderHelper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args)
    {
        if (args.length ==0)
        {
            System.out.println("No file name parameter given");
        } else {
            try {
                File file = new File(args[0]);
                List<String> input = FileReaderHelper.readFile(file);
                FileWriter fileWriter = new FileWriter("Results.txt");
                BufferedWriter bw = new BufferedWriter(fileWriter);
                bw.write(CountLines.getLongestVerseByNumberOfApparition(input));
                bw.close();
            } catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
