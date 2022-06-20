import java.util.Scanner;


class Main {

    public static void FindIntersection(String[] strArr) {


        String gecici=strArr[0],gecici2=strArr[1];

        for(int i=0;i<gecici.length();i++){

            for(int j=0;j<gecici2.length();j++){

                if(gecici.charAt(i)==gecici2.charAt(j)){

                    System.out.print(gecici.charAt(i)+",");
                }
            }
        }

        //return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(FindIntersection(s.nextLine()));
        FindIntersection(s.nextLine());
    }

}