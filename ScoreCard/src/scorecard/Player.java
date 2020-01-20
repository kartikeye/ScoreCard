
package scorecard;


@SuppressWarnings("InitializerMayBeStatic")
public class Player implements Iplayer{
   private String name=null;
   private String country=null;
   private  PlayerType playerType=null;
   private int runs=0;
   private int wickets=0;
   private int id=0;
//constructer of the class...
    public Player(String name,int id) {
        this.name=name;
        this.id=id;
    }
//getter methods of the class...
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getId() {
        return id;
    }
//setter methods of the class...
    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setRuns(int runs) {
        if(runs<9){
        this.runs = runs;
    }}

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setId(int id) {
        this.id = id;
    }
   //additonal methods of the class...
    @Override
    public void field(){
        System.out.println("fielding.......");
    }
   
public boolean injured(){
    return false;
}

    
   

   

    @Override
    public boolean takeCatch() {
        return true;
    }

    @Override
    public int scoreRun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
