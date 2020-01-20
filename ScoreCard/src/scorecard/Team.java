
package scorecard;

import javax.swing.JOptionPane;


public class Team {
    private int id;
    private Player[] players = new Player[11];
    private String name=null;
    private int rank=0;
    private int totalRuns=0;
    private int totalWickets=0;
//constructer...
    public Team(String name, int id) {
        this.name=name;
        this.id = id;
    }
//getter and setter...
    public Player[] getPlayer() {
        return players;
    }
    
    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setPlayer(Player[] player) {
        this.players = player;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }
    //additional methods...
    public int calculateTotalScore(){
        int runs =0;
        for (int i = 0; i<players.length; i++) {
             runs+=players[i].getRuns();
        }
        return this.totalRuns = runs;
    }
    public int calculateTotalWickets(){
        totalWickets=0;
        for (int i = 0; i < players.length; i++) {
            totalWickets += players[i].getWickets();
        }
        return totalWickets;
    }
}
