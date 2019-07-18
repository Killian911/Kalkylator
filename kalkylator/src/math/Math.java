
package math;

import calc.*;
import java.util.Scanner;

/**
 *
 * @author bodi4
 */
public class Math {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choose ;
         int a=0,b=0,m=0;
        Calc calculator = new Calc(a,b,m); 
       
        do{  
       
         System.out.println("Вибери дію");
         System.out.println("1 Арифметика");
         System.out.println("2 Розрядність");
         System.out.println("3 Матиматичні функції");
         System.out.println("4 Порівняння");
         System.out.println("5 Логічні операції");
         System.out.println("0 Вихід");
     
        choose = scanner.nextInt();
         
       switch(choose){  
           case 1 :
               
                System.out.println("Введіть A=");
        a=scanner.nextInt();
        System.out.println("Введіть B=");
        b=scanner.nextInt();
               
       System.out.println("1 Додавання");
       System.out.println("2 Віднімання");
       System.out.println("3 Множення");
       System.out.println("4 Ділення");
     System.out.println("Результат = "+calculator.arifm(a,b,m));
     break;
         case 2 : 
              System.out.println("Введіть число=");
        a=scanner.nextInt();
        System.out.println("Введіть число=");
        b=scanner.nextInt();
        
         System.out.println("1 Зсув <<");
         System.out.println("2 Зсув >>");
         System.out.println("3  A|B");
         System.out.println("4  A&B");
         System.out.println("5  A^B");
         System.out.println("6  ~A");
         
     System.out.println("Результат = "+calculator.rozrjad(a,b,m));
     break;
           case 3:
                System.out.println("Введіть число=");
        a=scanner.nextInt();
               
       System.out.println("1 sin");
         System.out.println("2 cos");
         System.out.println("3 tan");
         System.out.println("4 exp");
         System.out.println("5 pow 2");
         System.out.println("6 sqrt");
         System.out.println("7 log10");
     System.out.println("Результат = "+calculator.mathFunc(a,b,m));
      break;
          case 4:
               System.out.println("Введіть A=");
        a=scanner.nextInt();
        System.out.println("Введіть B=");
        b=scanner.nextInt();
        
          System.out.println("1 <<");
         System.out.println("2 >>");
         System.out.println("3 =");
         System.out.println("4 !=");
      System.out.println("Результат = "+calculator.porivn(a,b,m));
      break;
        case 5:
            boolean bool1,bool2;
           
   
               System.out.println("Введіть A=");
        bool1 =scanner.nextBoolean();
        System.out.println("Введіть B=");
        bool2=scanner.nextBoolean();
        
          System.out.println("1 OR");
          System.out.println("2 AND");
          System.out.println("3 XOR");
          System.out.println("4 NOT");
         
      System.out.println("Результат = "+calculator.logic(bool1,bool2,m));
      break;

           case 0: break;
           default: 
               System.out.println("Непривильний номер дії");
       }     
       }while(choose !=0);
      }
    }