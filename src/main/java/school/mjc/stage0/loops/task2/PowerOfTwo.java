package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void powerOfTwo(int power){
     if(power<0){ System.out.println("too much power");}
     else {
         double counter = 0;
         double num;
         while (counter<=power){
             num = Math.pow(2.0,counter);
             int ans = (int) num;
             System.out.println(ans);
             counter++;
          }
       }
    }
}

