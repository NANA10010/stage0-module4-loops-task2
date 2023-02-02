package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power<0) System.out.println("too much power");
        else {
            double counter = 0;
            double num;
            while (counter<=power){
                num = Math.pow(2.0,counter);
                System.out.println((int)num);
                counter++;
            }
        }

    }
}
