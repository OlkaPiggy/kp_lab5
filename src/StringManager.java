import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManager {

    private String str;
    private String[] sentences;
    private String[] wordsInFirstSentence;

    StringManager(String s)
    {
        str=s;
    }
    public boolean getFirstSentence()
    {
        String firstSentence = str.split("\\.")[0];
        if(isSentence(firstSentence)) {
            System.out.println("First sentence is: " + firstSentence);
            wordsInFirstSentence = firstSentence.split("\\s");
            return true;
        }
        else {
            System.out.println("Type at least 2 sentences");
            return false;
        }
    }

    public static boolean isSentence(String str)
    {
        if(str=="")
            return false;
        else if (str==" ") {
            return false;
        } else if (str.isBlank()) {
            return false;
        } else
            return true;
    }
    public boolean getSentences()
    {
        sentences = str.split("\\.");
        if(sentences.length==1||isSentence(sentences[1])==false)
        {
            System.out.println("Theres only 1 sentence.Type at least 2 sentences");
            return false;
        }
        else {
            return true;
        }
    }

    public boolean findWord()
    {
        int i=0;
        boolean anyWord=false;
        for(String word:wordsInFirstSentence)
        {
            i=0;
            boolean found=true;
            Pattern p =Pattern.compile(word);
            for(String sent:sentences)
            {
                if(i!=0) {
                    Matcher m = p.matcher(sent);
                    if (m.find()) {
                        found = false;
                        break;
                    }
                }
                i++;
            }
            if(found)
            {
                System.out.println("The serched word is: "+ word);
                anyWord=true;
                return true;
            }
        }
        if(anyWord==false)
        {
            System.out.print("There are no words matching ");
            return false;
        }
        return true;
    }
}
