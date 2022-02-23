
/*
 * Given as input a set of four objects of class CricketPlayer complete the Java code to segregate the players represented 
 * by these objects into batsmen and bowlers.
 * A player is termed as a batsman if his/her average runs per match are greater than 25.
 * A player is termed as a bowler if his/her average wickets per match are greater than 1.
 */
import java.util.*;
class CricketPlayer{
  private String name;
  private int wickets;
  private int runs;
  private int matches;
  public CricketPlayer(String s, int w, int r, int m){
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public CricketPlayer(){
    this.name = "";
    this.wickets = 0;
    this.runs = 0;
    this.matches = 0;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getWickets(){
    return wickets;
  }
  public int getRuns(){
    return runs;
  }
  public double avgRuns(){
    return runs/matches;
  }
  public double avgWickets(){
    return wickets/matches;
  }
  public void displayPlayers(CricketPlayer bw[],CricketPlayer bt[]){
    System.out.println("Names of Bowlers");
    int c1=0;
    int c2=0;
    for (int i=0; i < bw.length;i++){
       
       if (bw[i]!= null){
           System.out.print(bw[i].getName()+"\t");c1++;
        }
        else{
            System.out.print("");
        }
    }
    
    if(c1==0)
    {
        System.out.println("no bowlers");
    }
    System.out.println("");
    System.out.println("Names of Batsman");
     for (int i=0; i < bt.length;i++){
         
       if (bt[i] != null){
           System.out.print(bt[i].getName()+"\t");c2++;
       }
         else{
            System.out.print("");
        }
    }
    
    if(c2==0)
    {
        System.out.println("no batsman");
    }
    
 }
 

// Define displayPlayers() method here

 public static void main() {
    Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());

    // Define ArrayList objects here
   String[] Arraylist = new String[5];
   CricketPlayer[] Arraylistbt = new CricketPlayer[5] ;
   CricketPlayer[] Arraylistbw = new CricketPlayer[5];
   
   if (p1.avgRuns() > 25){
      Arraylistbt[0]=p1;
   }
   if (p1.avgWickets() > 1){
     Arraylistbw[0]=p1;
   } 
   if (p2.avgRuns() > 25){
      Arraylistbt[1]=p2;
    }
   if (p2.avgWickets() > 1){
     Arraylistbw[1]=p2;
   } 
   if (p3.avgRuns() > 25){
      Arraylistbt[2]=p3;
    }
   if (p3.avgWickets() > 1){
     Arraylistbw[2]=p3;
   } 
   if (p4.avgRuns() > 25){
      Arraylistbt[3]=p4;
    }
   if (p4.avgWickets() > 1){
     Arraylistbw[3]=p4;
   } 
   CricketPlayer dsp = new CricketPlayer();
   dsp.displayPlayers(Arraylistbw, Arraylistbt);
 
   }
}


"Kohli"
1
100
3
"Shami"
7
13
3
"Jadeja"
6
78
3
"Rohit"
1
120
3
Names of Bowlers
"Shami"	"Jadeja"	
Names of Batsman
"Kohli"	"Jadeja"	"Rohit"	