package Unit3_Booleans.wxamples;

public class Studentsss {
    public String fName, lName;
    public int idNum;


    public Studentsss(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }
/*
    public boolean equals(Studentsss other){
        return (this.lName.equals(other.lName));
    }
    public int compareTo(Studentsss other){
        if(this.lName.compareTo(other.lName)){
            return 0;
        }
    }
*/

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}
