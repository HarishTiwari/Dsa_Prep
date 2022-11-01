package basicMaths;

public class ArmstrongNumber {

    public boolean armsNum(int n){
        int arm = 0;
        int num = n;
        while(n!=0){
            int unit = n % 10;
            arm += Math.pow(unit,3);
            n = n /10;
        }

        if(arm == num)
            return true;
        else
            return false;
    }
}
