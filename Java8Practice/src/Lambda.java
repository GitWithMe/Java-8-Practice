//interface Drawable{
//	public void draw();
//}
//public class Lambda implements Drawable{
//	int width = 10;
//	public void draw() {                              /* JAVA WITH TYPICAL OOPS */
//		System.out.println("LOL " + width);
//	}
//	public static void main(String args[]) {
//		Lambda l = new Lambda();
//		l.draw();
//	}
//}


interface Drawable{  
    public void draw();  
}  
  
public class Lambda {  
    public static void main(String[] args) {  
        int width=10;                           
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  
