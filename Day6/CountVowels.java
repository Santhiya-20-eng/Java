import java.util.Scanner;
class  CountVowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch == "a"||ch == "e"||ch =="i"||ch =="O||ch =="u"){
            count++;

            }
        }
            System.out.prinln("number of Vowels:"+count);
    }
