import java.util.Random;

public class captcha {

	
	
	public String getcaptcha() {
		char data[]= "abcdefghijklmnopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM12345789".toCharArray();
		char index[]=new char[5];
		Random r=new Random();
		
		for(int i=0;i<index.length;i++) {
			int ran=r.nextInt(data.length);
			index[i]=data[ran];
		}
		return new String(index) ;
	}

	
	public static void main(String[] args) {
		captcha c=new captcha();
		System.out.println(c.getcaptcha());
	}
}
