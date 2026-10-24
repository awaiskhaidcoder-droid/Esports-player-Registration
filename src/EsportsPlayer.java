public class EsportsPlayer{
    private int playerID;
    private String playerName;
    private int age;
    private String gameName;
    private int fee;
    private String status;
    EsportsPlayer(int id,String playerName,int age,String gameName){
        this.age=age;
        this.playerID=id;
        this.playerName=playerName;
        this.status="pending";
        this.gameName=gameName;

    }
    public int getPlayerID(){
        return this.playerID;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public String getGameName(){
        return this.gameName;
    }
    public int getAge(){
        return this.age;
    }
    public int getFee(){
        if(getGameName().equalsIgnoreCase("Racing")){
             this.fee=500;
        } else if (getGameName().equalsIgnoreCase("Football")) {
             this.fee=700;
        } else if (getGameName().equalsIgnoreCase("battle royale")) {
             this.fee=1000;
        }
        return this.fee;
    }
    public void checkEligibilty(){
        if (getAge()>=16 && (getFee()!=0)){
            this.status="eligible";
        }
        else this.status="rejected";

    }
public String getStatus(){
         return this.status;
}
    public void setAge(int age){
        if(!status.equalsIgnoreCase("Eligible")){
            this.age=age;
            this.status="pending";
        }

        else System.out.println("You are already selected for one game");

    }
    public void setGameName(String game){
        if(!getStatus().equalsIgnoreCase("eligible")) {

                this.gameName = game;
                this.status = "pending";
        }
        else System.out.println("You are already selected for one game");
    }

    public void display(){
        System.out.println("player ID : "+getPlayerID());
        System.out.println("Player Name : "+getPlayerName());
        System.out.println("Game Name : "+getGameName());
        System.out.println("Fee : "+getFee());
        System.out.println("Status : "+getStatus());

    }
}
class Main{
    static void main(String[] args) {
        EsportsPlayer player1=new EsportsPlayer(401,"Awais",15,"cricket");

        player1.setGameName("football");
        player1.setAge(17);
        player1.checkEligibilty();
        player1.setGameName("racing");
        player1.display();
    }
}
