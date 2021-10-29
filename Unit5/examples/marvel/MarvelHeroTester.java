package Unit5.examples.marvel;

public class MarvelHeroTester {
    public static void main(String[] args) {
        Power superSpeed = new Power("Speed", 10);

        SuperHero flash = new SuperHero("Flash", superSpeed);
        System.out.println(flash.toString());

        Villain mephisto = new Villain("Mephisto", superSpeed);
        System.out.println(mephisto);

        mephisto.getSuperPower().setPowerStrength(15);

        System.out.println(flash);
        System.out.println(mephisto);
    }
    public static void battle(SuperHero hero, Villain villain){
        double herostrnt = hero.getSuperPower().getPowerStrength();
        double villainstrnt = villain.getSuperPower().getPowerStrength();

        if(herostrnt > villainstrnt){
            hero.getSuperPower().setPowerStrength(herostrnt - herostrnt * 0.5);
        }else if(villainstrnt > herostrnt){

        }else{

        }
    }
}
