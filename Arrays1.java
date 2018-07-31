
package arrays1;
import java.util.*;

public class Arrays1 {

    
    public static void main(String[] args) {
        
        
        Scanner t=new Scanner(System.in);
         Scanner b1=new Scanner(System.in);
         String[][] DepartureTimes=new String[15][2];
         int PassengersNumbers[]=new int[15];
         int choice;
         
         double ti[]={6.04,9.04,12.04,15.04,19.04,6.04,9.04,12.04,15.04,19.04,6.04,9.04,12.04,15.04,19.04};
                   String lp[]=new String[3];
                   lp[0]="Monday";
                   lp[1]="Tuesday";
                   lp[2]="Wednesday";
       DepartureTimes[0][0]="Monday";
       DepartureTimes[0][1]="6.04";
       DepartureTimes[1][0]="\0";
       DepartureTimes[1][1]="9.04";
       DepartureTimes[2][1]="12.04";
       DepartureTimes[3][1]="15.04";
       DepartureTimes[4][1]="19.04";
        DepartureTimes[5][0]="Tuesday";
      DepartureTimes[5][1]="6.04";
       DepartureTimes[6][0]="\0";
       DepartureTimes[6][1]="9.04";
       DepartureTimes[7][0]="\0";
       DepartureTimes[7][1]="12.04";
       DepartureTimes[2][0]="\0";
       DepartureTimes[3][0]="\0";
       DepartureTimes[4][0]="\0";
       DepartureTimes[1][0]="\0";
       DepartureTimes[8][0]="\0";
       DepartureTimes[8][1]="15.04";
       DepartureTimes[9][0]="\0";
       DepartureTimes[9][1]="19.04";
       DepartureTimes[14][0]="\0";
       DepartureTimes[13][0]="\0";
       DepartureTimes[11][0]="\0";
       DepartureTimes[12][0]="\0";
       DepartureTimes[10][0]="Wednesday";
       DepartureTimes[10][1]="6.04";
       DepartureTimes[11][1]="9.04";
       DepartureTimes[12][1]="12.04";
       DepartureTimes[13][1]="15.04";
       DepartureTimes[14][1]="19.04";
        PassengersNumbers[0]=22;
        PassengersNumbers[1]=119;
        PassengersNumbers[2]=64;
        PassengersNumbers[3]=177;
        PassengersNumbers[4]=21;
        PassengersNumbers[5]=22;
        PassengersNumbers[6]=111;
        PassengersNumbers[7]=87;
        PassengersNumbers[8]= 193;
        PassengersNumbers[9]= 22;
        PassengersNumbers[10]= 11;
        PassengersNumbers[11]=107 ;
        PassengersNumbers[12]= 93;
        PassengersNumbers[13]= 162;
        PassengersNumbers[14]= 42;
        do{
        System.out.println("Day \t\tDeparture Time \t\tNumber of PAssenger");
        for(int i=0;i<15;i++)
        {
            for(int j=0;j<2;j++)
            {
            System.out.print(DepartureTimes[i][j] +" \t\t" );       
          
            }
                  System.out.print(PassengersNumbers[i]);
            
         System.out.println(""); 
        }
         System.out.println("\n\n1.)The most popular train (day and time)\n" +
"2.) Least popular train (day and time)\n" +
"3.) Whether 6.04 train is more popular than the 9.04 train\n" +
"4.) Whether 6.04 train on Monday is more popular than the 6.04 train on Tuesday\n" +
"5.) Which two trains is more popular where day and time is specified by the user\n" +
"6.) Display a list of all trains (day, time) where passenger numbers were below 50\n" +
"7.) Average number of passengers travelling on the 12.04 train over the three days (Monday, Tuesday, Wednesday)\n" +
"8.) Average number of passengers travelling where day and time is specified by the user\n"+
"9.)Exit");
         choice=t.nextInt();
         switch(choice)
         {
         
             case 1:
                 System.out.println("\t\tPopular train");
                 int pop=PassengersNumbers[0];
                 for(int i=0;i<15;i++)
                 {
                     if(pop<PassengersNumbers[i])
                     {
                         pop=PassengersNumbers[i];
                     }
                 }
                 if(pop ==PassengersNumbers[0] )
                         {
                          
                             System.out.println(DepartureTimes[0][0] + DepartureTimes[0][1]  );
                         }
                         else if(pop ==PassengersNumbers[1])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[1][1]);
                     else if(pop ==PassengersNumbers[2])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[2][1]);
                         else if(pop ==PassengersNumbers[3])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[3][1]);
                     else if(pop ==PassengersNumbers[4])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[4][1]);
                         else if(pop ==PassengersNumbers[5])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[5][1]);
                         else if(pop ==PassengersNumbers[6])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[6][1]);
                    else if(pop ==PassengersNumbers[7])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[7][1]);
                 else if(pop ==PassengersNumbers[8])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[8][1]);
                         else if(pop ==PassengersNumbers[9])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[9][1]);
                         else if(pop ==PassengersNumbers[10])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[10][1]);
                     else if(pop ==PassengersNumbers[11])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[11][1]);
                     else if(pop ==PassengersNumbers[12])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[12][1]);
                    else if(pop ==PassengersNumbers[13])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[13][1]);
                         else if(pop ==PassengersNumbers[14])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[14][1]);
               
                 break ;
             case 2:
     System.out.println("\t\tLeast Popular train");
                 int unpop=PassengersNumbers[0];
                 for(int i=0;i<15;i++)
                 {
                     if(unpop>PassengersNumbers[i])
                     {
                         unpop=PassengersNumbers[i];
                     }
                 }
                          if(unpop ==PassengersNumbers[0] )
                             System.out.println(DepartureTimes[0][0] + DepartureTimes[0][1]  );
                     else if(unpop ==PassengersNumbers[1])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[1][1]);
                     else if(unpop ==PassengersNumbers[2])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[2][1]);
                     else if(unpop ==PassengersNumbers[3])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[3][1]);
                     else if(unpop ==PassengersNumbers[4])
                             System.out.println(DepartureTimes[0][0]+ DepartureTimes[4][1]);
                     else if(unpop ==PassengersNumbers[5])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[5][1]);
                     else if(unpop ==PassengersNumbers[6])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[6][1]);
                     else if(unpop ==PassengersNumbers[7])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[7][1]);
                     else if(unpop ==PassengersNumbers[8])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[8][1]);
                     else if(unpop ==PassengersNumbers[9])
                             System.out.println(DepartureTimes[5][0]+ DepartureTimes[9][1]);
                     else if(unpop ==PassengersNumbers[10])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[10][1]);
                     else if(unpop ==PassengersNumbers[11])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[11][1]);
                     else if(unpop ==PassengersNumbers[12])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[12][1]);
                     else if(unpop ==PassengersNumbers[13])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[13][1]);
                     else if(unpop ==PassengersNumbers[14])
                             System.out.println(DepartureTimes[10][0]+ DepartureTimes[14][1]);
        break;       
     case 3:
                 System.out.println("Time:6.04 \nDay:Monday \tPassengers:22\n \nDay:Tuesday \tPassengers:22 \nDay:Wednesday \tPassengers:11");
                 System.out.println("Time:9.04 \nDay:Monday \tPassengers:119 \nDay:Tuesday \tPassengers:111 \nDay:Wednesday \tPassengers:107");
                 double t1=6.04,t2=9.04;
                 double p11=22,p12=22,p13=11,p21=119,p22=111,p23=107;
                 if(p11>p21 && p11>p22 && p11>p23 && p12>p21 && p12>p22 && p12>p23 && p13>p21 && p13>p22 && p13>p23)
                 {
                     System.out.println("6.04 train is popular");
                 }
                 else
                 {
                     System.out.println("9.04 train is popular");
                 }
                
                 break;
    
          case 4:
                   
                System.out.println("Monday \t\tTime:6.04 \nPassengers:22 \nTuesday \tTime:6.04 \nPAssengers:22");
              
                if(PassengersNumbers[0]>PassengersNumbers[5])
                {
                System.out.println("Monday-train is popular");
                        }
                else
                    System.out.println("Both trains are equally popular");
                        break ;
             case 5:
                   
                   
                   String day[]=new String[2];
                   int sum=0,sum1=0,sum2=0,total;
                   double time[]=new double[2];
                   for(int i=0;i<2;i++)
                   {
                   System.out.println("Enter the Day");
                   day[i]=b1.nextLine();
                   }
                   for(int i=0;i<2;i++)
                   {
                   System.out.println("Enter the time");
                   time[i]=t.nextDouble();
                   }
                   for(int i=0;i<2;i++)
                   {
                     for(int j=0;j<5;j++)
                       {
                           if(day[i].contentEquals(lp[0]))
                           {
                               if(time[i]==ti[j])
                               {
                                  sum=sum+PassengersNumbers[j]; 
                               }
                            }
                        }
                   }
                    for(int i=0;i<2;i++)
                   {
                        for(int j=5;j<10;j++)
                       {
                           if(day[i].contentEquals(lp[1]))
                           {
                               if(time[i]==ti[j])
                               {
                                   
                                  sum1=sum1+PassengersNumbers[j]; 
                               } 
                           }
                       }
                    }
                     for(int i=0;i<2;i++)
                   {
                        for(int j=10;j<15;j++)
                       {
                            if(day[i].contentEquals(lp[2]))
                           {
                                if(time[i]==ti[j])
                               {
                                    sum2=sum2+PassengersNumbers[j]; 
                               }
                           }
                        }
                   }
                if(sum>sum1 &&sum>sum2)
                {
                    System.out.println("Train1 is popular");
                }
                else if(sum1>sum2)
                {
                     System.out.println("Train2 is popular");
                }
                else
                     System.out.println("Train3 is popular");
                 break ;
             case 6:
                 for(int i=0;i<3;i++)
                   {
                       for(int j=0;j<15;j++)
                       {
                           if(PassengersNumbers[j]<50)
                           {
                               System.out.println("Day: "+lp[i]+"\nTime: "+ti[j]+"\nPassengers: "+PassengersNumbers[j]);
                           }
                       }
                   }
          break ;
           case 7:
            
                  int g,y=64,m=87,n=93,d;
                 System.out.println("Monday \n\tPassengers:64 \nTuesday \n\tPassengers:87 \nWednesday \n\tPassengers:93");        
                 d=y+m+n;
                 System.out.println("The Average passengers: "+ d/3);
                 break;
           case 8:
                   String nm1;
                   int sum111=0,sum11=0,sum12=0,total1;
                   double oi11;
                  System.out.println("Enter the Day");
                   nm1=b1.nextLine();  
                   System.out.println("Enter the time");
                   oi11=t.nextDouble();
                         
                  for(int j=0;j<5;j++)
                       {
                           if(nm1.contentEquals(lp[0]))
                           {
                               if(oi11==ti[j])
                               {
                   System.out.println("The average passengers:"+PassengersNumbers[j]); 
                               }
                               }
                       }
                          for(int i=5;i<10;i++)
                          {
                              if(nm1.contentEquals(lp[1]))
                           {
                               if(oi11==ti[i])
                               {
                                  System.out.println("The average passengers:"+PassengersNumbers[i]); 
                               } 
                           }
                          }
                          for(int i=10;i<15;i++)
                          {
                            if(nm1.contentEquals(lp[2]))
                           {
                                if(oi11==ti[i])
                               {
                                System.out.println("The average passengers"+PassengersNumbers[i]); 
                               }
                           }
                       }
         
                  break ;         
          case 9:
                
               System.exit(0); 
             default:
                 System.out.println("\nInvalid!!");
                 
           
     }
       
        }while(choice!=9);
    
    
        }
}




    

