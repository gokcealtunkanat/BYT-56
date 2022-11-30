package templatedesignPatern;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Trainning Train  = new Swimming();
        Train.train();
        System.out.println();
        Train  = new Volleyball();
        Train.train();
    }
}
