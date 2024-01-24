import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static void generate_questions() throws FileNotFoundException {
        File file = new File("src/resources/question_list.txt");
        Scanner input = new Scanner(file);
        int i=0;
        while (input.hasNext()) {
            int correctAns;
            String question = input.nextLine();
            //System.out.println(question+"\n");
            correctAns = (question.charAt(question.length()-1)-'0');
            question = question.substring(0,question.length()-1);
            //System.out.println("the correct ans is "+correctAns);
            String opt1 = input.nextLine();
            String opt2 = input.nextLine();
            String opt3 = input.nextLine();
            String opt4 = input.nextLine();

            AddAQuestionFrame.list.add(new Question(question,opt1,opt2,opt3,opt4,correctAns));
            i++;
        }
        input.close();
//        FileWriter output = new FileWriter(file,true);
//        for(i=0;i<list.size();i++){
//            output.write("\n"+list.get(i).name+" e ");
//            output.write(list.get(i).grade+" klas");
//        }
//        output.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        //GameFrame frame = new GameFrame();
        //AddAQuestionFrame frame = new AddAQuestionFrame();
        generate_questions();
        Menu menu = new Menu();
    }
}