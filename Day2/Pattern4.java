
public class Pattern4 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){

        
            
            for(int j=0;j<5;j++)
                {
                if(j==0&&i!=5||j==4&&i!=5||i==0&&j!=5||i==0&&j!=5||i>1&& i==j )
                    {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}