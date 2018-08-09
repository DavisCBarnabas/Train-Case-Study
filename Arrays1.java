package arrays;
import java.util.*;
public class Arrays {
     public static void main(String[] args)
     {
         Scanner t=new Scanner(System.in);
         Scanner b1=new Scanner(System.in);
                 String lp[]={ "Monday","Tuesday","Wednesday" };
         double[] Departuretimes=new double[15];
         String[] DepartureTimes={"6.04" ,"9.04","12.04","15.04","19.04","6.04","9.04","12.04","15.04","19.04","6.04","9.04","12.04","15.04","19.04" };
         for(int i=0;i<15;i++){
             Departuretimes[i]=Double.parseDouble(DepartureTimes[i]); }
         int Passengersnumbers[]={22,119,64,177,21,22,111,87,193,22,11,107,93,162,42 };
         int choice;
             do{
         System.out.println("Day \t\t\t  Departure Time \t\tNumber of Passenger");
         System.out.println();        
         for(int i=0;i<5;i++){
                     System.out.print("Monday"+"\t\t\t\t"+DepartureTimes[i] +" \t\t\t\t"+Passengersnumbers[i] );       
                     System.out.println(); }
                 for(int i=5;i<10;i++){
                     System.out.print("Tuesday"+"\t\t\t\t"+DepartureTimes[i]+"\t\t\t\t"+Passengersnumbers[i]);
                     System.out.println(); }
                 for(int i=10;i<15;i++){
                     System.out.print("Wednesday"+"\t\t\t"+DepartureTimes[i]+"\t\t\t\t"+Passengersnumbers[i]);
                     System.out.println(); }
 System.out.println("\n\n1.)The most popular train (day and time)\n" +"2.) Least popular train (day and time)\n" +"3.) Whether 6.04 train is more popular than the 9.04 train\n" +"4.) Whether 6.04 train on Monday is more popular than the 6.04 train on Tuesday\n" +"5.) Which two trains is more popular where day and time is specified by the user\n" +"6.) Display a list of all trains (day, time) where passenger numbers were below 50\n" +"7.) Average number of passengers travelling on the 12.04 train over the three days (Monday, Tuesday, Wednesday)\n" +"8.) Average number of passengers travelling where day and time is specified by the user\n"+"9.)Exit" );
         choice=t.nextInt();
         switch(choice){
             case 1:
                 System.out.println("\t\tPopular train");
                 int pop=Passengersnumbers[0];
                     for(int i=0;i<15;i++){
                         if(pop<Passengersnumbers[i])
                             pop=Passengersnumbers[i]; }
                     for(int i=0;i<5;i++){
                         if(pop ==Passengersnumbers[i] )
                             System.out.println("Monday : " + Departuretimes[i]  );     }
                     for(int i=5;i<10;i++){
                         if(pop ==Passengersnumbers[i] )
                             System.out.println("Tuesday : " + Departuretimes[i]  );    }
                     for(int i=10;i<15;i++){
                         if(pop ==Passengersnumbers[i] )
                             System.out.println("Wednesday : " + Departuretimes[i]  );  }
                 break ;
             case 2:
                 System.out.println("\t\tLeast Popular train");
                 int pop1=Passengersnumbers[0];
                 for(int i=0;i<15;i++){
                                 if(pop1>Passengersnumbers[i])
                                          pop1=Passengersnumbers[i]; }
                        for(int i=0;i<5;i++){
                                 if(pop1 ==Passengersnumbers[i] )
                                          System.out.println("Monday : " + Departuretimes[i]  ); }
                        for(int i=5;i<10;i++){
                                if(pop1 ==Passengersnumbers[i] )
                                          System.out.println("Tuesday : " + Departuretimes[i]  ); }
                        for(int i=10;i<15;i++){
                                if(pop1 ==Passengersnumbers[i] )
                                          System.out.println("Wednesday : " + Departuretimes[i]  ); }
                 break;
             case 3:
                 System.out.println("Time:6.04 \nDay:Monday \tPassengers:22\n \nDay:Tuesday \tPassengers:22 \nDay:Wednesday \tPassengers:11");
                 System.out.println("Time:9.04 \nDay:Monday \tPassengers:119 \nDay:Tuesday \tPassengers:111 \nDay:Wednesday \tPassengers:107");
                         if(Passengersnumbers[0]>Passengersnumbers[1] && Passengersnumbers[0]>Passengersnumbers[6] && Passengersnumbers[0]>Passengersnumbers[10] && Passengersnumbers[5]>Passengersnumbers[6]&& Passengersnumbers[5]>Passengersnumbers[10] && Passengersnumbers[5]>Passengersnumbers[1] && Passengersnumbers[9]>Passengersnumbers[1] && Passengersnumbers[9]>Passengersnumbers[6]&& Passengersnumbers[9]>Passengersnumbers[10])
                             System.out.println("6.04 train is popular");
                         else
                             System.out.println("9.04 train is popular");
                 break ;
             case 4:
                 System.out.println("Monday \t\tTime:6.04 \nPassengers:22 \nTuesday \tTime:6.04 \nPAssengers:22");
                        if(Passengersnumbers[0]>Passengersnumbers[5])
                            System.out.println("Monday-train is popular");
                        else
                            System.out.println("Both trains are equally popular");
                 break ;
            case 5:
                     String nm[]=new String[2];
                     int sum=0,sum1=0,sum2=0,total;
                     double tim[]=new double[2];
                     for(int i=0;i<2;i++){
                         System.out.println("Enter the Day");
                             nm[i]=b1.nextLine();   }
                     for(int i=0;i<2;i++){
                         System.out.println("Enter the time");
                             tim[i]=t.nextDouble(); }
                     for(int i=0;i<2;i++){
                         for(int j=0;j<5;j++){
                             if(nm[i].contentEquals(lp[0])){
                                 if(tim[i]==Departuretimes[j])
                                     sum=sum+Passengersnumbers[j];  }}}
                     for(int i=0;i<2;i++){
                         for(int j=5;j<10;j++){
                             if(nm[i].contentEquals(lp[1])){
                                 if(tim[i]==Departuretimes[j]){
                                     sum1=sum1+Passengersnumbers[j]; }}}}
                     for(int i=0;i<2;i++){
                         for(int j=10;j<15;j++){
                             if(nm[i].contentEquals(lp[2])){
                                 if(tim[i]==Departuretimes[j]){
                                     sum2=sum2+Passengersnumbers[j]; }}}}
                                         if(sum>sum1 &&sum>sum2)
                                              System.out.println("Train1 is popular");
                                             else if(sum1>sum2)
                                                 System.out.println("Train2 is popular");
                                                     else
                                                         System.out.println("Train3 is popular");
                 break ;
             case 6:
                     for(int j=0;j<5;j++){
                         if(Passengersnumbers[j]<50)
                             System.out.println("Day: "+lp[0]+"\nTime: "+Departuretimes[j]+"\nPassengers: "+Passengersnumbers[j]);      }
                                 for(int j=5;j<10;j++){
                                     if(Passengersnumbers[j]<50)
                                                System.out.println("Day: "+lp[1]+"\nTime: "+Departuretimes[j]+"\nPassengers: "+Passengersnumbers[j]); }
                         for(int j=10;j<15;j++){
                             if(Passengersnumbers[j]<50)
                                 System.out.println("Day: "+lp[2]+"\nTime: "+Departuretimes[j]+"\nPassengers: "+Passengersnumbers[j]);   }
                 break;
             case 7:
                 int average;
                 System.out.println("Time : 12.04 \nMonday \n\tPassengers:64 \nTuesday \n\tPassengers:87 \nWednesday \n\tPassengers:93");        
                 average= Passengersnumbers[2]+Passengersnumbers[7]+Passengersnumbers[12];
                 System.out.println("The Average passengers: "+ average/3);
                 break;
             case 8:
                     String nm1;
                     double tim1;
                     System.out.println("Enter the Day");
                         nm1=b1.nextLine();  
                     System.out.println("Enter the time");
                         tim1=t.nextDouble();
                         for(int j=0;j<5;j++){
                             if(nm1.contentEquals(lp[0])){
                                 if(tim1==Departuretimes[j])
                                     System.out.println("The average passengers:"+Passengersnumbers[j]); }}
                     for(int j=5;j<10;j++){
                         if(nm1.contentEquals(lp[1])){
                             if(tim1==Departuretimes[j])
                                 System.out.println("The average passengers:"+Passengersnumbers[j]); }}
                     for(int j=10;j<15;j++){    
                         if(nm1.contentEquals(lp[2])){
                             if(tim1==Departuretimes[j])
                                 System.out.println("The average passengers"+Passengersnumbers[j]); }}
                  break ;              
             case 9:
                  System.exit(0); 
             default:
                 System.out.println("\nInvalid!!"); }
        }while(choice!=9);
     }
}
