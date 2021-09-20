package Unit3_Booleans.wxamples;

public class CompoundBooleansExamples {
    public static void main(String[] args) {
        String day = "Monday";
        int numAssigments = 2;

        //if sat and no hw play vg

        if(day.equals("Saturday") || numAssigments == 0){
            System.out.println("LETTS GO OVIDEOGAME");
        }else{
            System.out.println("NOOO school");
        }

        // cc if montag and num hw is equal or less than 2

        if(day.equals("Monday") && numAssigments <= 2){
            System.out.println("coding fclui wowo");
        }else{
            System.out.println("ohhhh noo codin nooo");
        }
        //ex always if weekends, on weekdays 80% prob if no hw. but only with 30;% if she has hw. print ex or no ex

        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("exerices cause weekedns");
        }else{
            if(numAssigments == 0){
                if((int)(Math.random() * 11) <= 8){
                    System.out.println("exercies cuase 80");
                }else{
                    System.out.println("nooo 80");
                }
            }else{
                if((int)(Math.random() * 11) <= 2){
                    System.out.println("exercies cuase 30");
                }else{
                    System.out.println("nogggooo 30");
                }
            }
        }
    }
}
