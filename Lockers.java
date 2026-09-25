/*
Anna Moore
9/25/2026
Lockers.java
Puzzle involving opening and closing lockers. Perfect squares should be the remaining open lockers
*/

public class Lockers{
    public static void main(String[] args){
        Boolean [] lockers= new Boolean[100];
        int counter=0;
        int studentNum=0;
        //default value was null instead of false
        for(int i=0; i<100;i++){
            lockers[i]=false;
        }
        for(int i=0;i<100;i++){
            studentNum=i+1;
            while(counter<100){
                lockers[counter]=!lockers[counter];
                counter+=studentNum;
            }
            counter=studentNum-1;
        }
        for(int i=0;i<100;i++){
            studentNum=i+1;
            if(lockers[i]){
                System.out.print("Locker "+studentNum+" is open");
            }
        }
    }
}
