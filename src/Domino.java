public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }
    public int getBottom() {
        return bottom;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    @Override
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip() {
        int hold = top;
        this.top = bottom;
        this.bottom = hold;
    }
    public void settle(){
        if (top > bottom) {
            flip();
        }
    }
    public int compareTo(Domino other){
        if (this.top < other.top) {
            return -1;
        }
        else if (this.top > other.top) {
            return 1;
        }
        else {
            if (this.bottom < other.bottom) {
                return -1;
            }
            else if (this.bottom > other.bottom) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other) {
        int thisTotal = this.top + this.bottom;
        int otherTotal = other.top + other.bottom;

        if (thisTotal < otherTotal) {
            return -1;
        }
        else if (thisTotal > otherTotal) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public boolean canConnect(Domino other) {
        if (this.top == other.top) {
            return true;
        }
        else if (this.top == other.bottom) {
            return true;
        }
        else if (this.bottom == other.top) {
            return true;
        }
        else if (this.bottom == other.bottom) {
            return true;
        }
        else {
            return false;
        }
    }
}
