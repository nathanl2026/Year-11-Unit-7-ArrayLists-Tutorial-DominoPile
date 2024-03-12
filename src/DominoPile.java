import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public ArrayList<Domino> getPile(){
        return pile;
    }

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
        Random random = new Random();
        while (pile.size() > 0) {
            Domino removedDomino = pile.remove(random.nextInt(0, pile.size()));
            hold.add(removedDomino);
            //  (simplier expression, plug in removed domino to the add part below
            //  for one simpler single line expression)
            //  hold.add(pile.remove(random.nextInt(0, pile.size())));
        }
        pile = hold;
    }
}
