package templatedesignPatern;

public class Swimming extends Trainning {

    @Override
    void endPlay(){
        System.out.println("Swimming game finished!");
    }
    @Override
    void initialize(){
        System.out.println("Swimming game initialized!");
    }
    @Override
    void startPlay(){
        System.out.println("Swimming game started!");
    }

}
