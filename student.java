public class student {
    public static void main(String[] args) {

        int Studentscores= 20;
        if (Studentscores >= 80 ){
            System.out.println("A");
        }
        else{
            if (Studentscores>= 70){
                System.out.println("B");
            }
            else{
                if (Studentscores>=60){
                    System.out.println("C");
                }
                else{
                    if (Studentscores>=50){
                        System.out.println("D");
                    }
                    else{
                        if (Studentscores>=40){
                            System.out.println("E");
                        }
                        else{
                            System.out.println("f");
                            System.out.println("You've failed retake");
                        }
                    }
                }
            }
        }
    }
}
