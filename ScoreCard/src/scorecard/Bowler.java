
package scorecard;


public class Bowler extends Batsman {
    private int wickets=0;
    private double over=0.0;
    private int runsGiven=0;

    /**
     *
     */
    //Constructer...
    public Bowler(String name, int id) {
        super(name,id);
    }
    //getter and setter...
    public double getOver() {
        return over;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setOver(double over) {
        this.over = over;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }
    //additional methods...
    public void addWickets(){
        wickets++;
    }
}
