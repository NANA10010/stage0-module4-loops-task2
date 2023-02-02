package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int caunter = 1;
        while (caunter<=printToInclusive){
            int num=0;
            int x=0;
            while (num<caunter){
                num++;
                if (caunter%num==0) x++;
            }

            if(x==2) System.out.println(caunter);

            caunter++;
        }
    }
}
