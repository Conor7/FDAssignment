package assignment;

import java.util.Scanner;

public class assignment
{
	public static void main(String[] args)
	{	
		Scanner key = new Scanner(System.in);
		int opt1 = 0, opt2 = 0;
		
		do
		{
			mainMenu();
		
			//Input menu option
			System.out.print("\n\n\tPlease select an option:  ");
			opt1 = key.nextInt();
			
			switch (opt1)
			{
				case 1:
					do
					{
						subMenu1();
						
						//Input menu option
						System.out.print("\n\n\tPlease select an option:  ");
						opt2 = key.nextInt();
						
						switch (opt2)
						{
							case 1:
								System.out.print("\n\n\tYou selected Rustic Oak");
								break;
							case 2:
								System.out.print("\n\n\tYou selected Natural Oak");
								break;
							case 3:
								System.out.print("\n\n\tYou selected Golden Oak");
								break;
							case 4:
								System.out.print("\n\n\tYou selected Mayfair Walnut");
								break;
						}
					} while (opt2 != 5);
					break;
				case 2:
					do
					{
						subMenu2();
						
						//Input menu option
						System.out.print("\n\n\tPlease select an option:  ");
						opt2 = key.nextInt();
						
						switch (opt2)
						{
							case 1:
								System.out.print("\n\n\tYou selected Vienna Sandstone");
								break;
							case 2:
								System.out.print("\n\n\tYou selected Chicago Thunderstorm");
								break;
							case 3:
								System.out.print("\n\n\tYou selected Seattle Latte");
								break;
							case 4:
								System.out.print("\n\n\tYou selected Cairo Brushed Cotton");
								break;
							case 5:
								System.out.print("\n\n\tYou selected Toronto Lavastone");
								break;
						}
					} while (opt2 != 6);
						break;
			case 3:
					do
					{
						subMenu3();
						
						//Input menu option
						System.out.print("\n\n\tPlease select an option:  "); 
						opt2 = key.nextInt();
						
						switch (opt2)
						{
						case 1:
							System.out.print("\n\n\tYou selected Quartz Stone Midnight Black");
							break;
						case 2:
							System.out.print("\n\n\tYou selected Presealed Terracotta");
							break;
						case 3:
							System.out.print("\n\n\tYou selected Super White Porcelain");
							break;
						case 4:
							System.out.print("\n\n\tYou selected Coda Grey");
							break;
						case 5:
							System.out.print("\n\n\tYou selected Grey Marble Split Mosaic");
							break;
						}
						
					} while (opt2 != 6);
						break;
			}

			} while (opt1 !=4);				

	}
	
	public static void mainMenu()
	{
		System.out.print("\n\n\tFloors Direct");
		System.out.print("\n\t-------------");
		System.out.print("\n\t1)  Solid Wood Flooring");
		System.out.print("\n\t2)  Carpets");
		System.out.print("\n\t3)  Tiles");
		System.out.print("\n\t4)  Exit");
	}
	
	public static void subMenu1()
	{
		System.out.print("\n\n\tSolid Wood Flooring");
		System.out.print("\n\t-------------------");
		System.out.print("\n\t1)  Rustic Oak  -  £33.98 per m2");
		System.out.print("\n\t2)  Natural Oak  -  £27.99 per m2");
		System.out.print("\n\t3)  Golden Oak  -  £39.99 per m2");
		System.out.print("\n\t4)  Mayfair Walnut  -  £99.00 per m2");
		System.out.print("\n\t5)  Exit");
	}
	
	public static void subMenu2()
	{
		System.out.print("\n\n\tCarpets");
		System.out.print("\n\t-------");
		System.out.print("\n\t1)  Vienna Sandstone  -  £12.59");
		System.out.print("\n\t2)  Chicago Thunderstorm  -  £14.39");
		System.out.print("\n\t3)  Seattle Latte  -  £17.59");
		System.out.print("\n\t4)  Cairo Brushed Cotton  -  £19.59");
		System.out.print("\n\t5)  Toronto Lavastone  -  £20.99");
		System.out.print("\n\t6)  Exit");
	}
	
	public static void subMenu3()
	{
		System.out.print("\n\n\tTiles");
		System.out.print("\n\t-----");
		System.out.print("\n\t1)  Quartz Stone Midnight Black  -  £5.99 (300x300mm)");
		System.out.print("\n\t2)  Presealed Terracotta  -  £6.89 (300x300mm)");
		System.out.print("\n\t3)  Super White Porcelain  -  £3.29 (300x600)");
		System.out.print("\n\t4)  Coda Grey  -  £4.67 (310x560mm)");
		System.out.print("\n\t5)  Grey Marble Split Mosaic  -  £2.99 (300x150mm)");
		System.out.print("\n\t6)  Exit");
	}
	
	
}
