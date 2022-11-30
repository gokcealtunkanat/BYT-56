package MementoDesignPatern;

public class App {
    public static void main(String[] args) {


        Memory memory = new Memory();
        NotePad notepad= new NotePad();

        notepad.add("G");
        notepad.add("K");
        notepad.add("E");

        NotePadMemento gke =notepad.save();

        memory.add(gke);

        notepad.print();

        notepad.add("X");

        NotePadMemento gkex =notepad.save();
        memory.add(gkex);

        notepad.print();

        memory.lastVersionBring();

        notepad.ctrlz(memory.lastVersionBring());

        NotePadMemento gkey =notepad.save();

        memory.add(gkey);

        notepad.print();








    }
}
