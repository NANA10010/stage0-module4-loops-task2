package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive<0){
            int caunter = 0;
            while (caunter>=multiplyByAndToInclusive){
                System.out.println(caunter*multiplyByAndToInclusive*-1);
                caunter--;
            }
        } else {
            int caunter = 1;
            while (caunter <= multiplyByAndToInclusive) {
                System.out.println(caunter * multiplyByAndToInclusive);
                caunter++;
            }
        }
    }
}
