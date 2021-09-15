package Unit2_UsingObjects.CodingQuiz;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String name;
    private int mcs;
    private boolean extraCredStat;

    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz(){
        name = "bruh";
    }

    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String aName, int numMCS, boolean ExtraCred){
        name = aName;
        mcs = numMCS;
        extraCredStat = ExtraCred;
  }


    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */
     public void printInfo(){
    System.out.println(name + "Number MC's: " + mcs + extraCredStat);
}


    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything
    public void addMC(int numMC){
         mcs += numMC;
}

    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]
    public int calcExtraCredit(){
         int ranInt = (int) (Math.random() * 5 + 2);
         return ranInt;
}


    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public double calcTotal(int pointValue){
         int totalPoints = pointValue * mcs;
         return totalPoints;
}

    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public void setName(String theName){
         name = theName;
}
    public void setMCS(int theMCS){
    mcs = theMCS;
}
    public void setExtraCredStat(boolean theExtraCred){
    extraCredStat = theExtraCred;
}

    public String getName(){
         return name;
}
    public int getMCS(){
    return mcs;
}
    public boolean getExtraCred(){
    return extraCredStat;
}

    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"


}
