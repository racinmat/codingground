import java.util.*;
 
public class HelloWorld {
 
     public static void main(String []args){
         //znaceni p a T je z prednasky cislo 3, slide 53
        double[] p = {4,5,6,7,8};      //periody, pridavat dle zadani, pole musi mit stejnou velikost jako pole T
        double[] T = {1,1,3,1,4};      //cas CPU, pridavat dle zadani
        double[] cycleStarts = {6,8,10}; //napriklad posledni radek slidu 53 ve 3. prednasce
        //double to jsou kvuli deleni, aby se to nemuselo pretypovavat
       
        fyzickaPlanovatelnost(p, T);
        postacujiciPodminka(p, T);
        postacujiciANutnaPodminka(p, T, cycleStarts);
 
     }
     
     /**
      * spocita fyzickou planovatelnost
      */
     public static void fyzickaPlanovatelnost(double[] p, double[] T) {
        int fyzickaPlanovatelnost = 0;
        for(int i = 0; i < p.length; i++) {
            fyzickaPlanovatelnost += T[i]/p[i];
        }
       
        if(fyzickaPlanovatelnost > 1) {
            System.out.println("Neni fyzicky planovatelne.");
        } else {
            System.out.println("Je fyzicky planovatelne.");
        }
     }
     
     /**
      * urci postacujici podminku pro RMS
      */
     public static void postacujiciPodminka(double[] p, double[] T) {
        double postacujiciPodminka = 0;
        double n = p.length;
 
        for(int i = 0; i < n; i++) {
            postacujiciPodminka += T[i]/p[i];
        }
 
        double podminka = n*(Math.pow(2d,1/n)-1);
        if(postacujiciPodminka > podminka) {
            System.out.println("Neni splnena postacujici podminka RMS.");
        } else {
            System.out.println("Je splnena postacujici podminka RMS.");
        }
     }
     
     /**
      * urci nutnou a postacujici podminku pro RMS
      */
     public static void postacujiciANutnaPodminka(double[] p, double[] T, double[] cycleStarts) {
        double[][] Li = new double[p.length][cycleStarts.length];
        for(int time = 0; time < cycleStarts.length; time++) {
            double t=cycleStarts[time];   
            for(int i = 0; i < p.length; i++) {
                Li[i][time] = 0;
                for(int j = 0; j < i; j++) {
                    Li[i][time] = T[j]*Math.ceil(t/p[j]);
                }
                Li[i][time] = Li[i][time]/t;
            }
        }
        double[] Limin = new double[p.length];
        for(int i = 0; i < p.length; i++) {
            LiMin[i] = Collections.min(Arrays.asList(Li[i]));
        }
        double L = Collections.max(Arrays.asList(LiMin));
     }
     
}