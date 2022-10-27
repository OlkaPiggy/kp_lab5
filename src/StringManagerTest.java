import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManagerTest {

    @Test
    void getFirstSentenceTest1() {
        String str ="One sentence.";
        StringManager stringManager = new StringManager(str);
        assertEquals(true,stringManager.getFirstSentence());
    }

    @Test
    void getSentencesTest1() {
        String str ="One sentence.";
        StringManager stringManager = new StringManager(str);
        stringManager.getFirstSentence();
        assertEquals(false,stringManager.getSentences());
    }

    @Test
    void getSentencesTest2() {
        String str ="One sentence.Second Sentence";
        StringManager stringManager = new StringManager(str);
        stringManager.getFirstSentence();
        assertEquals(true,stringManager.getSentences());
    }

    @Test
    void getFirstSentencesTest2() {
        String str =" .";
        StringManager stringManager = new StringManager(str);
        assertEquals(false, stringManager.getFirstSentence());
    }

    @Test
    void getSentencesTest3() {
        String str =" sentence 1. ";
        StringManager stringManager = new StringManager(str);
        stringManager.getFirstSentence();
        assertEquals(false,stringManager.getSentences());
    }

    @Test
    void isSentenceTest1() {
        String str ="";
        assertEquals(false,StringManager.isSentence(str));
    }

    @Test
    void isSentenceTest2() {
        String str =" ";
        assertEquals(false,StringManager.isSentence(str));
    }

    @Test
    void findWordTest1() {
        String str ="sentence word. word. cucumber";
        StringManager stringManager = new StringManager(str);
        stringManager.getFirstSentence();
        stringManager.getSentences();
        assertEquals(true,stringManager.findWord());
    }

    @Test
    void findWordTest2() {
        String str ="sentence word. word. cucumber.sentence";
        StringManager stringManager = new StringManager(str);
        stringManager.getFirstSentence();
        stringManager.getSentences();
        assertEquals(false,stringManager.findWord());
    }

}