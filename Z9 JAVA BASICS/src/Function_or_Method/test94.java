package Function_or_Method;
						//Class & Non-StaticMethod..method overloading
public class test94 {
	
	void display() {
		System.out.println("I am display() of MethodOverloading4 class");
	}
	public static void main(String args[]) {
		
		 DisplayOverloading obj = new DisplayOverloading();
		 obj.disp('a');
		 obj.disp('a',10);
		 obj.callMe();
		 
		 test94 m1=new test94();
		 m1.display();
   }
}
class DisplayOverloading {
	
    public void disp(char c) {
         System.out.println(c);
    }
    public void disp(char c, int num) {
         System.out.println(c + " "+num);
    }
    public void callMe() {
    	System.out.println("I am callMe() of DisplayOverloading class");
    }
}
