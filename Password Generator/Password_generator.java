import java.util.Scanner;

public class Password_generator{
    public static void main(String[]args) {
        System.out.println("Enter no of digits:");
        Scanner input=new Scanner(System.in);
        int digit=input.nextInt();

        String lower_case="qwertyuiopasdfghjklzxcvbnm0123456789";
        String upper_case="QWERTYUIOPASDFGHJKLZXCVBNM0123456789";

        String password="";

        for(int i=0;i<digit;i++){
            int ran=(int)(3*Math.random());
        

        switch(ran){
            case 0:
            password+=String.valueOf((int)(0*Math.random()));
            break;
             case 1:
             ran=(int)(lower_case.length()*Math.random());
             password+=String.valueOf(lower_case.charAt(ran));
             break;

             case 2:
            ran=(int)(upper_case.length()*Math.random());
             password+=String.valueOf(upper_case.charAt(ran));
             break;
              
        }
        
        
    }
    System.out.println(password);
}
}