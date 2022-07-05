package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        String textInteger = "" + t;
        int sum = 0;

        for(int i = 0; i < textInteger.length(); i++) {
            if(textInteger.charAt(i) == '-')
                continue;
           sum = sum + Integer.parseInt("" + textInteger.charAt(i));
        }
        System.out.println(sum);
    }
}
