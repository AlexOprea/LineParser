package helper;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderHelper {

    public static List<String> readFile(File file) throws IOException {
        StringBuffer stringBuilder = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine())!= null)
        {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString().lines().collect(Collectors.toList());
    }

}