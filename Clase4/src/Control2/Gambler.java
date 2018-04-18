package Control2;

public class Gambler {
  public static void main(String[] args) {
      
      int stake = Integer.parseInt(args[0]);          //capital
      int goal = Integer.parseInt(args[1]);         //objetivo
        int trials = Integer.parseInt(args[2]);         //intentos
      
        int stake2 = stake;
      
        System.out.println(stake + " " + goal + " " + trials);
        
        int wins = 0;
        int losses = 0;
      
        for(int i = 0; i < trials; i++){
            while(stake2 > 0 && stake2 < goal){
                if(Math.random() < 0.5){
                    stake2++;
                }else
                    stake2--;
            }
            if(stake2 == goal){
                wins++;
            }else{
                losses++;
            }
            stake2 = stake;
        }
    
        System.out.println("wins: " + wins + " and losses: " + losses + " of " + trials + " trials");
    
  }
}
