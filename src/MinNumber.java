public class MinNumber {
    public static void main(String[] args) {

int [] age = new int[10];

    age[0]=10;
    age[1]=20;
    age[2]=30;
    age[3]=40;
    age[4]=50;
    age[5]=60;
    age[6]=70;
    age[7]=80;
    age[8]=90;
    age[9]=100;



    int minNumber=age[0];

    for (int number : age){
        if (number <  minNumber){
            minNumber=number;
        }
    }
        System.out.println("the min number is "+ minNumber);


}
}
