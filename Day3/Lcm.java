public class Lcm {
    public static void main(String[] args) {
        int a=1,b=18;
        int n=a*b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;

        }
        System.out.println("gcd="+a);
        System.out.println("lcm="+n/a);
    }
}
