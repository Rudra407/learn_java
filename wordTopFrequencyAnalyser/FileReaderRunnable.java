package tech.codingclub.wordTopFrequencyAnalyser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tech.codingclub.wordTopFrequencyAnalyser.Utility.FileUtility;
import tech.codingclub.wordTopFrequencyAnalyser.Utility.TaskManager;

import java.util.*;

public class FileReaderRunnable implements Runnable {

    public String filePath;

    public FileReaderRunnable(String filePath) {
        this.filePath = filePath;
    }

    public void run() {

        Scanner sc = null;

        ArrayList<String> words = FileUtility.readAndPrint(filePath);
        Map<String, Integer> keywordCounter = new HashMap<String, Integer>();

        for(String row : words)
        {
            String keywords[] = row.split(" ");
            for (String s : keywords)
            {
                String str = s.toLowerCase();
                if (keywordCounter.containsKey(str)) {
                    int count = keywordCounter.get(str);
                    keywordCounter.put(str, count + 1);
                    } else {
                        keywordCounter.put(str, 1);
                    }
                }
            }

        ArrayList<KeywordCount> keywordCountArrayList = new ArrayList<KeywordCount>();
        for(String keyword:keywordCounter.keySet())
        {
            KeywordCount keywordCount = new KeywordCount(keyword,keywordCounter.get(keyword));
            keywordCountArrayList.add(keywordCount);
        }

        Collections.sort(keywordCountArrayList, new Comparator<KeywordCount>() {
            public int compare(KeywordCount o1, KeywordCount o2) {
                if(o2.count == o1.count)
                    return o1.keyword.compareTo(o2.keyword);

                return o2.count - o1.count;
            }
        });

//        for(KeywordCount keywordCount1 : keywordCountArrayList)
//        {
//            System.out.println(keywordCount1.count + " : " + keywordCount1.keyword);
//
//        }

        String json = new Gson().toJson(keywordCountArrayList);
        System.out.println(json);

        String convertJson = "{\"keyword\":\"Hello GSON\",\"count\":100}";
        KeywordCount keywordCount = new Gson().fromJson(convertJson, KeywordCount.class);
        System.out.println("Converted to object " + keywordCount.keyword + " : "+ keywordCount.count);

        String convertJsonArray = "[{'keyword':'Hello GSON','count':100},{'keyword':'Hello GSON2','count':150}]";

        ArrayList<KeywordCount> keywordCountArrayList1 = new Gson().fromJson(convertJsonArray, new TypeToken<ArrayList<KeywordCount>>(){}.getType());

        System.out.println("ArrayList From Json");
        for (KeywordCount keyCount : keywordCountArrayList1) {
            System.out.println(keyCount.keyword+" : "+keyCount.count);
        }

    }

    public static void main(String[] args) {
        String filePath = "/home/rudradevmishra/IdeaProjects/CodingClubBackend/data/practice/file/IndianNationalAnthem.txt";
        FileReaderRunnable runnable1 = new FileReaderRunnable(filePath);
        TaskManager taskManager = new TaskManager(1);
        taskManager.waitTillQueueIsFreeAndAddTask(runnable1);
    }
}
