package Unut6.Lab;

public class Question {
    private String qText;
    private int value;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private int numCor;

    private boolean isUsed = false;


    public Question(String qText, int value, String a1, String a2, String a3, String a4, int numCor) {
        this.qText = qText;
        this.value = value;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.numCor = numCor;
    }

    @Override
    public String toString() {
        return qText + "\n" + value + "\n\t" + a1 + "\n\t" + a2 + "\n\t" +a3 + "\n\t" +a4 + "\n\t" + numCor;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public int getNumCor() {
        return numCor;
    }

    public void setNumCor(int numCor) {
        this.numCor = numCor;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
