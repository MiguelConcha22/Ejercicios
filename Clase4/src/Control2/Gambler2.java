package Control2;

public class Gambler2 {
	
	public static int trial(int stake, int goal) {
		while(stake > 0 && stake < goal) {
			if(Math.random() < 0.5) {
				stake++;
			}else
				stake--;
		}
		if(stake == goal)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
      
      int stake = Integer.parseInt(args[0]);        //capital
      int goal = Integer.parseInt(args[1]);         //objetivo
      int trials = Integer.parseInt(args[2]);       //intentos
      
      int win;
      
      System.out.println(stake + " " + goal + " " + trials);
        
      int wins = 0;
      int losses = 0;
      
      for(int i = 0; i < trials; i++){
    	  
    	  win = trial(stake, goal);
    	  
          if(win == 1){
              wins++;
          }else{
              losses++;
          }
      }
    
      System.out.println("wins: " + wins + " and losses: " + losses + " of " + trials + " trials");
    }
}