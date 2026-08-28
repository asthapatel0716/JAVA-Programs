class ScoreBox {
    private int score;
    public ScoreBox(int score) {
        setScore(score);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "ScoreBox{score=" + score + "}";
    }
}
public class ObjectReferenceLab {
    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }
    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(999);
    }
    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }
    public static void main(String[] args) {
        ScoreBox box1 = new ScoreBox(50);
        ScoreBox box2 = box1;
        System.out.println(box1);
        System.out.println(box2);
        System.out.println((box1 == box2));
        addBonus(box2, 10);
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
        ScoreBox box3 = new ScoreBox(30);
        System.out.println(box3);
        System.out.println((box1 == box3));
        replaceLocally(box1);
        System.out.println(box1);
    }
}
