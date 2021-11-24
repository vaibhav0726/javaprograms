/*
Q1. write a Java program to find if the given number is palindrome or not
*/
public class program1 {
    public int pali;
    program1(int p)
    {
        pali= p;
    }

    public void Pali_check(){
        var c = pali;
        var pal =0;
        while(c>0){
            var r=c%10;
            pal = pal*10 +r;
            c=c/10;
        }
        if(pali == pal)
            System.out.println(pali+" is a Palindrome");
        else
            System.out.println(pali+" is not a Palindrome");
    }

    public static void main(String[] args) {
        program1 obj = new program1(Integer.parseInt(args[0]));
        obj.Pali_check();
    }
}