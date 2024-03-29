public class Question {
    private String ask;
    private String ans1,ans2,ans3,ans4;
    private int correctans;

    public Question(){
        ask = "Koi e syzdatelqt na kompaniqta tesla?";
        ans1 = "Bill Gates";
        ans2 = "Stefan Mitev";
        ans3 = "Elon Musk";
        ans4 = "Ognyan Yorogv";
        correctans = 3;
    }
    // vzima se vypros s idx ot file
    public void change_question(int idx){
        idx--;
        ask = AddAQuestionFrame.list.get(idx).ask;
        ans1 = AddAQuestionFrame.list.get(idx).ans1;
        ans2 = AddAQuestionFrame.list.get(idx).ans2;
        ans3 = AddAQuestionFrame.list.get(idx).ans3;
        ans4 = AddAQuestionFrame.list.get(idx).ans4;
        correctans = AddAQuestionFrame.list.get(idx).correctans;
    }
    public Question (String ask,String ans1,String ans2,String ans3, String ans4,int correctans){
        this.ask=ask;
        this.ans1=ans1;
        this.ans2=ans2;
        this.ans3=ans3;
        this.ans4=ans4;
        this.correctans=correctans;

    }
    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public int getCorrectans() {
        return correctans;
    }

    public void setCorrectans(int correctans) {
        this.correctans = correctans;
    }
}
