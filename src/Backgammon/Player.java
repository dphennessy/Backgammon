package Backgammon;
/*
Player class not important for sprint 1, will be used later for additional functionality such as saving game states
*/
public class Player{
    private String playerName;
    private Color color;
    private int pipsLeft;
    private int piecesLeft;

    public Player(String player, Color color){
        this.playerName = player;
        this.color = color;
        pipsLeft = 167;
        piecesLeft = 15;
    }

    public void setPlayerName(String name){
        this.playerName = name;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public void setPipsLeft(int newPipNumber){
        pipsLeft = newPipNumber;
    }
    public int getPipsLeft(){
        return this.pipsLeft;
    }
    public Color getColor(){
        return this.color;
    }
    public int getPiecesLeft(){return this.piecesLeft;}
    public void setPiecesLeft(int newPiecesLeft){this.piecesLeft = newPiecesLeft;}
}
