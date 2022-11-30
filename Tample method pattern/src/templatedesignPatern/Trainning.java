package templatedesignPatern;

public abstract class Trainning {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void train(){
        initialize();
        startPlay();
        endPlay();

    }




}



