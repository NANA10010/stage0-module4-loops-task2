package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
         int caunter = 0;
        while (caunter<=printTillInclusive){
            System.out.println(caunter);
            caunter+=2;
        }
    }
}
