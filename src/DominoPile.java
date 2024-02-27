import java.util.ArrayList;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList<>();
    }
    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle() {
        ArrayList<Domino> hold = new ArrayList<>();
        hold.add()
    }
}
