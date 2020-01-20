
package scorecard;


public class Over {
    Ball[] ball = new Ball[6];
    private int number=0;
    private int totalExtra=0;
    //constructer...
    public Over(int no) {
        number=no;
    }

    public Ball[] getBall() {
        return ball;
    }

    public int getNumber() {
        return number;
    }

    public void setBall(Ball[] ball) {
        this.ball = ball;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int calculateTotalExtra(){
        int extra = 0;
        for(int i=0;i<ball.length;i++){
            extra += ball[i].getExtra();
        }
        return this.totalExtra = extra;
     }
    
}
