
package scorecard;


public class Ball {
    private int ballNumber=0;
    private BallType ballType=null;
    private int extra=0;

    public Ball(int ballno,BallType ballType) {
        ballNumber=ballno;
        int count=0;
        if(ballType==BallType.DEADBALL||ballType==BallType.FAIRDELIVERY){
            this.ballType=ballType;
            this.extra = 0;
        }
        else if(ballType==BallType.BOUNCER){
            count++;
            if(count>2){
                this.extra = 1;
            }
        }
        else{
            
            this.extra = 1;
            
        }
        //ballType=type;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public void setBallType(BallType ballType) {
        
        
    }
    public int getExtra(){
        
        return this.extra;
    }
    
}
