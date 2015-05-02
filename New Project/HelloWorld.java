import java.util.Random;

public class HelloWorld{

     public static void main(String []args){
        System.out.print("X=[");
        Random r = new Random();
        int length = 100;
        
        for(int i=0; i < length; i++) {
            System.out.print((r.nextDouble()*16-8)+" ");
        }
        System.out.println(";");
        
        for(int i=0;i<length;i++) {
            System.out.print((r.nextDouble()*1000-500)+" ");
        }
        System.out.println(";");
        
        for(int i=0;i<length;i++) {
            System.out.print((r.nextDouble()*1000-500)+" ");
        }
        System.out.println(";");
        
        for(int i=0;i<length;i++) {
            System.out.print((r.nextDouble()*Math.PI*2)+" ");
        }
        System.out.println(";");
        
        for(int i=0;i<length;i++) {
            System.out.print((r.nextDouble()*Math.PI*2)+" ");
        }
        System.out.println(";");
        
        for(int i=0;i<length;i++) {
            System.out.print((r.nextDouble()*Math.PI*2)+" ");
        }
        System.out.println("];");
        
     }
}
