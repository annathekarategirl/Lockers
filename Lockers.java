/*
Anna Moore
9/25/2026
Lockers.java
Puzzle involving opening and closing lockers. Perfect squares should be the remaining open lockers
*/

public class Lockers{
    public static void main(String[] args){
        Boolean [] lockers= new Boolean[100];
        //default value was null instead of false
        for(int i=0; i<100;i++){
            lockers[i]=false;
        }
        System.out.print(lockers[68]);
    }
}
