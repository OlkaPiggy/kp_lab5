import java.util.Scanner;

public class TaskManager {

    public String readFromConsole() {

        System.out.println("Enter your text: ");
        Scanner read=new Scanner(System.in);
        String str = read.nextLine();
        return str;
    }

    public boolean start()
    {
        String str=readFromConsole();
        if (str.isBlank()) {
            System.out.print("Empty input. Retry");
            return false;
        } else {
            System.out.println("User inputis :"+ str);
            StringManager stringManager = new StringManager(str);
            stringManager.getFirstSentence();
            stringManager.getSentences();
            stringManager.findWord();
            return true;
        }
    }

}
