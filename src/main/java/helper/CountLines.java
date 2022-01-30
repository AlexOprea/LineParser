package helper;

import java.util.*;
import java.util.stream.Collectors;


public class CountLines {

    public static String getLongestVerseByNumberOfApparition(List<String> input)
    {
        Map<String,Integer> content = countLines(input);
        List<Integer> values = content.values().stream().collect(Collectors.toList());
        int max = Integer.MIN_VALUE;
        List<String> verses = new ArrayList<>();
        for (int val : values)
        {
            if (val>max)
            {
                max = val;
            }
        }
        Set<String> contentKeys = content.keySet();
        for (String key : contentKeys)
        {
            if (content.get(key) == max)
            {
                verses.add(key);
            }
        }
        Collections.sort(verses, new LengthComparator().reversed());
        return verses.get(0);
    }

    private static Map<String,Integer> countLines(List<String> input)
    {
        Map<String,Integer> counter = new HashMap<>();
        for (String ind : input)
        {
            if (counter.containsKey(ind))
            {
                int count = counter.get(ind);
                counter.put(ind,count++);
            } else
            {
                counter.put(ind,1);
            }
        }
        return counter;
    }
}
