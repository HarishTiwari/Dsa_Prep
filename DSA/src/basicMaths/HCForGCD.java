package basicMaths;

public class HCForGCD {

    int gcd = 0;
    int lcm = 0 ;

    public int hcfOrGCD(int n,int m){
        int hcf = 1;
        int divisor = 0;
        int dividend = 0;

        if(m > n){
            divisor = n;
            dividend = m;
        }else{
            divisor = m;
            dividend = n;
        }

        while(divisor !=0){
            int rem = dividend % divisor;
            hcf = divisor;
            dividend = divisor;
            divisor = rem;
        }

        gcd = hcf;

        // Calculating Lcm
        // HCF * LCM = A * B
        lcm = (n * m ) / hcf;

        return hcf;
    }

    Long[] lcmAndGcd(Long m , Long n) {

        Long[] result = new Long[2];

        Long hcf = new Long(1);
       // System.out.println(hcf);
        Long lcm = new Long(0);
        Long divisor = new Long(0);
        Long dividend = new Long(0);

        if(m > n){
            divisor = n;
            dividend = m;
        }else{
            divisor = m;
            dividend = n;
        }

        while(divisor !=0){
            Long rem = new Long(dividend % divisor);
            hcf = divisor;
            dividend = divisor;
            divisor = rem;
        }

        lcm = (n * m ) / hcf;
//        System.out.println(lcm);
//        System.out.println(hcf);

        result[0] = lcm;
        result[1] = hcf;

        return result;
    }
}
