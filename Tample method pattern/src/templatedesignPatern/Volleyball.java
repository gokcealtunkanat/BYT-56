package templatedesignPatern;

public class Volleyball extends Trainning {

    @Override
    void endPlay(){
        System.out.println("volleyball training finished!");
    }
    @Override
    void initialize(){
        System.out.println("volleyball training game initialized!");
    }
    @Override
    void startPlay(){
        System.out.println("volleyball training started!");
    }

}
