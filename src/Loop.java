public class Loop {

    // for
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("---------------------");
        //while

        int count=1;
        while(count<=5){
            System.out.println("count: " + count);
            count++;
        }
        System.out.println("---------------------");
        //Do-While Loop
        int number = 1;
        do {
            System.out.println("number: " + number);
            number++;
        } while (number <= 5);


    int yusuf=1;
    for (int i=1; i<=10; i++) {
        System.out.println("bu for icin yusuf: " + i);
    }
    while(yusuf<=10){
        System.out.println("bu while icin yusuf: " + yusuf);
        yusuf++;
    }
    yusuf=1;
    do {
        System.out.println("bu do while icin yusuf: " + yusuf);
        yusuf++;
    }while(yusuf<11);
    }
}