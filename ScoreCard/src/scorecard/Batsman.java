
package scorecard;


public class Batsman extends Player{
    private int runs=0;
    private int ballFaced=0;
    private int fours=0;
    private int sixes=0;
    private double sR=0.0;
    
//constructor....
    public Batsman(String name, int id) {
        super(name, id);
    }
//getter...and setter....
    public int getBallFaced() {
        return ballFaced;
    }

    public int getFours() {
        return fours;
    }

    public int getSixes() {
        return sixes;
    }

    public double getsR() {
        return sR;
    }

    public void setBallFaced(int ballFaced) {
        this.ballFaced = ballFaced;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public void setsR(double sR) {
        this.sR = sR;
    }
    //additonal methods of the class...
    public void addRun(int run){
        if(run<9){
            this.runs=run;
        }
    }
    public String out(){
        return "out!!!!!!!!" ;
    }
    public double getCalculatedSR(){
        return (this.runs/this.ballFaced)*100;
    }
    
}
