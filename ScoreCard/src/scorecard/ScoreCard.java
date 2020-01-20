
package scorecard;


public class ScoreCard {

    
    public static void main(String[] args) {
        //ScoreFrame f = new ScoreFrame();
        //f.setVisible(true);
        //team 1 created with name india. with player array
        Team team1 = new Team("India",01);
        Player[] playerArray = new Player[11];
        Player team1player1 = new Batsman("Rohit",1);//player created and added to the array of player
        playerArray[0]=team1player1;
        Player team1player2 = new Batsman("Rahane",2);
        playerArray[1]=team1player2;
        Player team1player3 = new Batsman("Kohli",3);
        playerArray[2]=team1player3;
        Player team1player4 = new Batsman("Jadhav",4);
        playerArray[3]=team1player4;
        Player team1player5 = new Batsman("yuvraj",5);
        playerArray[4]=team1player5;
        Player team1player6 = new Batsman("Dhoni",6);
        playerArray[5]=team1player6;
        Player team1player7 = new Batsman("Pandya",7);
        playerArray[6]=team1player7;
        Player team1player8 = new Bowler("Bhuvneshvar",8);
        playerArray[7]=team1player8;
        Player team1player9 = new Bowler("Bumrah",9);
        playerArray[8]=team1player9;
        Player team1player10 = new Bowler("chahal",10);
        playerArray[9]=team1player10;
        Player team1player11 = new Bowler("Kumar",11);
        playerArray[10]=team1player11;
        team1.setPlayer(playerArray);
        System.out.println(playerArray[10].getName());
       
       
       Over o1 = new Over(1);
       Ball[] ballArray = new Ball[6];
       Ball b1 = new Ball(1, BallType.FAIRDELIVERY);
       ballArray[0]=b1;
       Ball b2 = new Ball(2, BallType.NOBALL);
       ballArray[1]=b2;
       Ball b3 = new Ball(3, BallType.WIDEBALL);
       ballArray[2]=b3;
       Ball b4 = new Ball(4, BallType.FAIRDELIVERY);
       ballArray[3]=b4;
       Ball b5 = new Ball(5, BallType.FAIRDELIVERY);
       ballArray[4]=b5;
       Ball b6 = new Ball(6, BallType.FAIRDELIVERY);
       ballArray[5]=b6;
       
       o1.setBall(ballArray);
       //ballArray[1].setBallType(BallType.NOBALL);
        System.out.println("Show extra..." + ballArray[1].getExtra());
        System.out.println("Show extra..." + ballArray[2].getExtra());
        
        System.out.println("total extra in over :"+o1.calculateTotalExtra());
        System.out.println(playerArray[0].takeCatch());
        
        playerArray[0].setRuns(5);
        System.out.println(playerArray[0].getRuns());
        
        playerArray[0].setPlayerType(PlayerType.BATSMAN);
        System.out.println(playerArray[0].getPlayerType());
        
        playerArray[1].setRuns(3);
        playerArray[2].setRuns(5);
        playerArray[3].setRuns(4);
        playerArray[4].setRuns(3);
        playerArray[5].setRuns(1);
        playerArray[6].setRuns(2);
        playerArray[7].setRuns(4);
        playerArray[8].setRuns(6);
        playerArray[9].setRuns(7);
        playerArray[10].setRuns(8);
        System.out.println(playerArray[0].getRuns());
        System.out.println(playerArray[1].getRuns());
        System.out.println(team1.calculateTotalScore());
        //testing of sR
        /*Batsman b = new Batsman("amit", 12);
        b.addRun(4);
        b.addRun(2);
        b.setBallFaced(2);
       
        System.out.println("strike rate of a random player :"+b.getCalculatedSR());
         */
                Team team2 = new Team("Pakistan",12);
    }
    
}
