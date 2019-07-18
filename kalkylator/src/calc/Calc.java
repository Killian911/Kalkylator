
package calc;

import java.util.Scanner;

/**
 *
 * @author bodi4
 */
public class Calc {
    
 private double a,b;
 private int m;
 
    
   public Calc(double a,double b,int m)
    {
        this.a=a;
        this.b=b;
        this.m=m;
    }

  
	 
	
   public double arifm(double a,double b,int m){
       
        Scanner scanner = new Scanner(System.in);
           
 m=scanner.nextInt();
 
   switch(m)
                    {
                        case 1:
                             return a+b;
                        case 2:
                            return a-b;
                        case 3:
                            return a*b;
                        case 4:
                            return a/b;
                  }
   return 0;
  }
        public boolean porivn(double a, double b, int m){
             Scanner scanner = new Scanner(System.in);
            m=scanner.nextInt();
 
   switch(m)
                    {
                        case 1:
                             return a<b;
                        case 2:
                            return a>b;
                        case 3:
                            return a==b;
                        case 4:
                            return a!=b;
                       
                  }
   return false;
    }  
     
       public double mathFunc(double a, double b, int m){
   Scanner scanner = new Scanner(System.in);        
 m=scanner.nextInt();
 
   switch(m)
                    {
                        case 1:
                            return Math.sin(a);
                        case 2:
                            return Math.cos(a);
                        case 3:
                            return Math.tan(a);
                        case 4:
                             return Math.exp(a);
                        case 5:
                             return Math.pow(a,2);
                        case 6:
                             return Math.sqrt(a);
                        case 7:
                             return Math.log10(a);
                  }
   return 0;
    }
    
    public boolean logic(boolean a, boolean b, int m){

 Scanner scanner = new Scanner(System.in);        
 m=scanner.nextInt();

   switch(m)
                    {
                        case 1:
                            return a||b;
                        case 2:
                            return a&&b;
                        case 3:
                            return a^b;
                        case 4:
                            return a!=b;
                        
                  }
   return false;
    }

       public int rozrjad(int a, int b, int m){
           
            int D,V,C;
            
    Scanner scanner = new Scanner(System.in);
 m = scanner.nextInt();

    
    
   switch(m)
                    {
                        case 1:               
      
   
      return (byte)a>>b;
                        case 2:
      
      
   
      return  (byte)a<<b;
                        case 3:  
        String hexor=Integer.toBinaryString((int) a|b);
      C=Integer.parseInt(hexor);
      return C;
      
   case 4:    
       String hexand=Integer.toBinaryString((int) a&b);
      C=Integer.parseInt(hexand);
      return C;
   case 5:
      String hexxor=Integer.toBinaryString((int) a^b);
      C=Integer.parseInt(hexxor);
      return C;
       
    case 6:
      String hexin1=Integer.toBinaryString((int) ~a);
      C=Integer.parseInt(hexin1);
       String hexin=Integer.toBinaryString((int) ~b);
      V=Integer.parseInt(hexin);
      System.out.println(C+V);
 }     
  return 0;
}      
}