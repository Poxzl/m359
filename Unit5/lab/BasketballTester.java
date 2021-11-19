package Unit5.lab;
// Johan, Arjun
//Mr. Moon
//Period 3
//The purpose of this lab is to create basketball teams with random skill levels, and then compare two of them
//to see which
public class BasketballTester {
    public static final String RED = "\u001b[31m";
    public static final String BLACK = "\u001b[30m";

    /**
     * sets random defense and offense ratings to both teams
     * @param args
     */
    public static void main(String[] args) {
        Offense off1 = new Offense((int)(Math.random() * 10) + 1, (int)(Math.random() * 10) -1);
        Offense off2 = new Offense((int)(Math.random() * 10) + 1, (int)(Math.random() * 10) + 1);
        Defense def1 = new Defense((int)(Math.random() * 10) + 1, (int)(Math.random() * 10) + 1);
        Defense def2 = new Defense((int)(Math.random() * 10) + 1, (int)(Math.random() * 10) + 1);
        Team Team1 = new Team("Clippers ", off1, def1);
        Team Team2 = new Team("Lakers", off2, def2);


        System.out.println(RED + Team1 + BLACK);
        System.out.println(RED + Team2 + BLACK);

        game(Team1, Team2);
    }


    /**
     * applies deduction by 20% to team t
     * @param t
     */

    public static void deductTeam(Team t){
        double offLay = t.getOff().getLayupRating();
        double offshoot = t.getOff().getShootRating();
        double defBlock = t.getDef().getBlockRating();
        double defSteal = t.getDef().getStealRating();

        t.getOff().setLayupRating((int) (offLay - offLay * 0.2));
        t.getOff().setShootRating((int) (offshoot - offshoot * 0.2));
        t.getDef().setBlockRating((int) (defBlock - defBlock * 0.2));
        t.getDef().setStealRating((int) (defSteal - defSteal * 0.2));
        if(t.getOff().getLayupRating() < 0){
            t.getOff().setLayupRating((int) (0));
        }
        if(t.getOff().getShootRating() < 0){
            t.getOff().setShootRating((int) (0));
        }
        if(t.getDef().getBlockRating() < 0){
            t.getDef().setBlockRating((int) (0));
        }
        if(t.getDef().getStealRating() < 0){
            t.getDef().setStealRating((int) (0));
        }
    }

    /**
     * increaes by 20% to team t(winning team)
     * @param t
     */
    public static void addTeam(Team t){
        double offLay = t.getOff().getLayupRating();
        double offshoot = t.getOff().getShootRating();
        double defBlock = t.getDef().getBlockRating();
        double defSteal = t.getDef().getStealRating();

        t.getOff().setLayupRating((int) (offLay + offLay * 0.2));
        t.getOff().setShootRating((int) (offshoot + offshoot * 0.2));
        t.getDef().setBlockRating((int) (defBlock + defBlock * 0.2));
        t.getDef().setStealRating((int) (defSteal + defSteal * 0.2));
        if(t.getOff().getLayupRating() > 10){
            t.getOff().setLayupRating((int) (10));
        }
        if(t.getOff().getShootRating() > 10){
            t.getOff().setShootRating((int) (10));
        }
        if(t.getDef().getBlockRating() > 10){
            t.getDef().setBlockRating((int) (10));
        }
        if(t.getDef().getStealRating() > 10){
            t.getDef().setStealRating((int) (10));
        }
    }


    /**
     * Simulates a basketball game between 2 different teams, whoever has higher overall score wins
     * After the game
     * loser's score will get deducted by 20%
     * if teams tie, then both scores will get deducted by 20%
     * @param Team1 This is team 1
     * @param Team2 This is team 2
     */

    public static void game(Team Team1,Team Team2) {
        double offLay1 = Team1.getOff().getLayupRating();
        double offshoot1 = Team1.getOff().getShootRating();
        double offLay2 = Team2.getOff().getLayupRating();
        double offshoot2 = Team2.getOff().getShootRating();
        double defBlock1 = Team1.getDef().getBlockRating();
        double defSteal1 = Team1.getDef().getStealRating();
        double defBlock2 = Team2.getDef().getBlockRating();
        double defSteal2 = Team2.getDef().getStealRating();



        // print if statements for off and def
       // if a team loses, then they're offense and defense ratings go down by 10%

        // If Team1 wins, give penalty to Team2
        if(offLay1 + offshoot1 + defBlock1 + defSteal1 > offLay2 + offshoot2 + defBlock2 + defSteal2){
            System.out.println("Clippers Win!\n");
            deductTeam(Team2);
            addTeam(Team1);
        }
        else{
            // if Team2 wins, give penalty to Team1
            if(offLay2 + offshoot2 + defBlock2 + defSteal2 > offLay1 + offshoot1 + defBlock1 + defSteal1){
                System.out.println("Lakers Win!\n");
                deductTeam(Team1);
                addTeam(Team2);
            }
            else{
                // if teams tie, give penalty to both teams
                if(offLay1 + offshoot1 + defBlock1 + defSteal1 == offLay2 + offshoot2 + defBlock2 + defSteal2){
                    System.out.println("Its a Tie!\n");
                    deductTeam(Team1);
                    deductTeam(Team2);
                }
            }
        }

        System.out.println(Team1);
        System.out.println(Team2);
        System.out.println(Team.calcIntensity());
    }
}
