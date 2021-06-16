package KukuDhaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Hotel {
	

	public static void main(String[] args) {
		String dish;
		int bill=0;
		String name = null;
		List <KukuHotel> list=new ArrayList<>();
		
		int num=0;
		int num2=0;
		System.out.println("Welcome to  Hotel ");
		KukuHotel h=new KukuHotel();
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your good name ??");
		String nav=sc.nextLine();
		do {
				System.out.println(nav+"\twhat would like to have?");
				System.out.println("---------------------------------");
				System.out.println("1> Press 1 for Breakfast /t 2> Press 2 for Lunch /t 3> Press 3 for Dinner /t 4> Press 4 for bill ");
				System.out.println("press 5 for exit");
				System.out.println("----------------------------------------------");
				Scanner sc1=new Scanner(System.in);
				num=sc1.nextInt();
				if(num==1)
				{
					System.out.println(" -------Breakfast Menu List------");
					System.out.println("--------------------------------------");
					System.out.println(" 	Menu		 |  			 Price");
					System.out.println(" ----------------|--------------------");
					System.out.println(" 1> poha         |                20$ ");
					System.out.println(" 2> Upit         |                20$ ");
					System.out.println(" 3> Dosa         |                40$ ");
					System.out.println(" 4> Idli Samber  |                20$ ");
					System.out.println(" 5> oats         |                20$ ");
					System.out.println(" 6> mutki        |                40$ ");
					do {
						System.out.println("Enter Dish name");
						Scanner sc2=new Scanner(System.in);
						 dish=sc2.nextLine();
						System.out.println("Enter Dish Price");
						Scanner sc3=new Scanner(System.in);
						bill=sc3.nextInt();
						KukuHotel an=new KukuHotel(dish,bill);
						list.add(an);
						System.out.println("Do you want again  ??  1> press 1 to select again \t 2> press to 2 exit ");
						Scanner sc4=new Scanner(System.in);
						 num2=sc4.nextInt();
						
						
						
						
					}while(num2!=2);
					
					
				}
				else if(num==2)
				{
					System.out.println(" -------Lunch     Menu      List------");
					System.out.println("--------------------------------------");
					System.out.println(" 	Menu		 |  			 Price");
					System.out.println(" ----------------|--------------------");
					System.out.println(" 1> Misal pav    |                60$ ");
					System.out.println(" 2> Chicken      |               100$ ");
					System.out.println(" 3> Mutton       |               200$ ");
					System.out.println(" 4>Special Maggie|                80$ ");
					System.out.println(" 5> paneer       |               200$ ");
					System.out.println(" 6> Dal Tadaka   |               100$ ");
					do {
						System.out.println("Enter Dish name");
						Scanner sc5=new Scanner(System.in);
						 dish=sc5.nextLine();
						System.out.println("Enter Dish Price");
						Scanner sc6=new Scanner(System.in);
						bill=sc6.nextInt();
						KukuHotel anj=new KukuHotel(dish,bill);
						list.add(anj);
						System.out.println("Do you want again  ??  1> press 1 to select again \t 2> press to 2 exit ");
						Scanner sc7=new Scanner(System.in);
						 num2=sc7.nextInt();
						
						
						
						
					}while(num2!=2);
				}
				else if(num==3)
				{
					System.out.println(" -------Lunch     Menu      List------");
					System.out.println("--------------------------------------");
					System.out.println(" 	Menu		 |  			 Price");
					System.out.println(" ----------------|--------------------");
					System.out.println(" 1> Misal pav    |                60$ ");
					System.out.println(" 2> Chicken      |               100$ ");
					System.out.println(" 3> Mutton       |               200$ ");
					System.out.println(" 4>Special Maggie|                80$ ");
					System.out.println(" 5> paneer       |               200$ ");
					System.out.println(" 6> Dal Tadaka   |               100$ ");
					do {
						System.out.println("Enter Dish name");
						Scanner sc8=new Scanner(System.in);
						 dish=sc8.nextLine();
						System.out.println("Enter Dish Price");
						Scanner sc9=new Scanner(System.in);
						bill=sc9.nextInt();
						KukuHotel anj1=new KukuHotel(dish,bill);
						list.add(anj1);
						System.out.println("Do you want again  ??  1> press 1 to select again \t 2> press to 2 exit ");
						Scanner sc11=new Scanner(System.in);
						 num2=sc11.nextInt();
						
						
						
						
					}while(num2!=2);
				}
				else if(num==4)
				{    System.out.println(nav+" YOUR BILL IS ");
				System.out.println("");
					for(KukuHotel kukuHotel:list)
					{
						
						System.out.println(""+kukuHotel);
					}
					int total=0;
					for(KukuHotel kukuHotel:list)
					{
						total=total+kukuHotel.getBill();
						//System.out.println("Bill :: "+kukuHotel.getBill());
					}
					System.out.println("");
				System.out.println("           Total Bill :: "+total);					
					break;
 					
				}
				
				
				
				else
				{
					System.out.println("Sorry you Press Wrong Keyword!!!!!     Press Again!!");
				}
			
		}while(num!=5);
		System.out.println("---------THANK YOU!!!! VISIT AGAIN---------");
		System.out.println("----------***  Hotel  ***----------");

	}

	

}
