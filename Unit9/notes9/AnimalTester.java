package Unit9.notes9;

/**
 * Lesson 7-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 *
 * @author   Mrs. Denna
 */
public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal[] barn = new Animal[6];
        // 1. What data type does this array hold?

        //barn

        barn[0] = new Animal("Murphy");
        barn[1] = new Cow("Daisy", "Dairy");
        barn[2] = new Pig("Wilbur", false);
        barn[3] = new Cow("Billy", "Beef");
        barn[4] = new Animal("Maggie");
        barn[5] = new Pig("Max", true);

        // 2. Did I ONLY store Animal objects in this array?  If not, why do you
        //    think this was allowed?

        //no, because these classes are subclasses of the Array which contains the superclass


        for (Animal a: barn)
            a.speak();
        // 3. What method is getting called here?  The speak method of the Animal class?

        //No, the method is calling that specific animals speak method.

        // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.

        //it goes through each animal and speaks it's specific class noise
    }

}