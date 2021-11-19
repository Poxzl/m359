package Unit5.examples.marvel;

public class MarvelHeroTester {
    public static void main(String[] args) {
        Power superSpeed = new Power("Speed", 10);
        Power superBruh = new Power("BRuh", 3);

        System.out.println(SuperHero.getNumHeroes());

        SuperHero flash = new SuperHero("Flash", superSpeed);
        System.out.println(flash.toString());

        Villain mephisto = new Villain("Mephisto", superBruh);
        System.out.println(mephisto);
        System.out.println("TOTAL :" + SuperHero.getTotalStrength());
        System.out.println(SuperHero.getNumHeroes());

        mephisto.getSuperPower().setPowerStrength(15);

        System.out.println(flash);
        System.out.println(mephisto);

        battle(flash, mephisto);
    }
    public static void battle(SuperHero hero, Villain villain){
        double herostrnt = hero.getSuperPower().getPowerStrength();
        double villainstrnt = villain.getSuperPower().getPowerStrength();

        if(herostrnt > villainstrnt){
            System.out.println(hero.getName() + "! won");
            double randNum = Math.random()*0.3 + 0.05;
            hero.getSuperPower().setPowerStrength(herostrnt - herostrnt * randNum);
            villain.getSuperPower().setPowerStrength(herostrnt * randNum * 2);
        }else if(villainstrnt > herostrnt){
            System.out.println(villain.getName() + "! won");
            double randNum = Math.random()*0.3 + 0.05;
            hero.getSuperPower().setPowerStrength(herostrnt - herostrnt * randNum * 2);
            villain.getSuperPower().setPowerStrength(herostrnt * randNum);
        }else{
            System.out.println("TIE!");
            double randNum = Math.random()*0.3 + 0.05;
            hero.getSuperPower().setPowerStrength(herostrnt - herostrnt * randNum * 1.5);
            villain.getSuperPower().setPowerStrength(herostrnt * randNum * 1.5);
        }

        System.out.println(hero);
        System.out.println(villain);
        System.out.println("TOTAL :" + SuperHero.getTotalStrength());

    }
}
