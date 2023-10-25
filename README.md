# Javaprojec
package java1;
import java.io.DataInputStream;
import java.io.IOException;

public class Java3 {
	float stdmark;
	String stdname;
    DataInputStream dis=new DataInputStream(System.in);
    void input()throws IOException
    {
    	System.out.println("Enter the stdmark :");
    	stdmark= Float.parseFloat(dis.readLine());
    	System.out.println("Enter the stdname :");
    	stdname=dis.readLine();
    	}
    void display()
    {
    	System.out.println("your stdmark is:"+stdmark);
    	System.out.println("your stdname is:"+stdname);
    }
	public static void main(String[] args) throws IOException {
		Java3 j3=new Java3();
		j3.input();
		j3.display();
		
		// TODO Auto-generated method stub

	}

}
