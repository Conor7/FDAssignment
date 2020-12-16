package assignment;

import java.util.Scanner;

//import general.My;
//import general.MyVal;

public class assignmentMerge
{
	public static void main(String[] args)
	{	
		//Declaring scanner key
		Scanner key = new Scanner(System.in);
		
		//Declaring variables and arrays  //wood
		int opt1 = 0, opt2 = 0, underlayOpt = 0, fittingOpt = 0, counter = 0, floorCount = 0, width = 0, length = 0;
		double methodPrice = 0.0, totalCost = 0.0, underlayPrice = 0.0, underlayRoll = 0.0;
		String floorType[] = new String [10], floor[] = new String [3];
		double floorPrice[] = new double [10], underlayOverall[] = new double [10], fittingOverall[] = new double [10], totalCostOverall[] = new double [10];
		int floorNum[] = new int [10];
		
		//Declaring extra variables and arrays  //tiles
		int opt3 = 0, opt4 = 0, opt5 = 0;
		String tileName[] = {"Quartz Stone Midnight Black", "Presealed Terracotta", "Super White Porcelain", "Coda Grey", "Grey Marble Split Mosaic"};	
		double tilePrice = 0, tileWidth = 0, tileLength = 0, tileTotalCost = 0, greyGroutPrice = 0, whiteGroutPrice = 0, spacerPrice = 0;
		double groutSize = 0.0, groutPrice = 0.0;
		String details = "";
		double groutOverall[] = new double [10], tileFittingOverall[] = new double [10], tileOverallCost[] = new double [10];
		
		
		
		My.p("\n\n\tWelcome to Floors Direct");
		
		//Gathering amount of floors.
		//Validated to only accept integers between 1 - 10
		My.p("\n\n\n\tMaximum Floor Amount = 10");
		floorCount = MyVal.validInt("\n\n\tHow many floors would you like done: ", 1, 10);

		//Loops around for the amount of floors
		for (int i = 0; i < floorCount; i++)
		{
			floorNum[counter] = counter + 1;
			
			do
			{
				//Calling main menu
				mainMenu();
				
				//Input menu option
				opt1 = MyVal.validInt("\n\n\tPlease select an option:  ", 1, 4);
				
				//Inputs floor into array
				if (opt1 == 1)
					floor[counter] = "Solid Wood";
				else if (opt1 == 2)
					floor[counter] = "Carpet";
				else if (opt1 == 3)
					floor[counter] = "Tiles";
					
				//Inputing width and length
				width = MyVal.valid("\n\n\tWhat is the width of the floor in metres: ");
				length = MyVal.valid("\n\tWhat is the length of the floor in metres: ");
				
				switch (opt1)
				{
					case 1:
						do
						{
							//Calling wood flooring menu
							subMenu1();
							
							//Input menu option
							opt2 = MyVal.validInt("\n\n\tPlease select an option:  ", 1, 5);
							
							switch (opt2)
							{
								case 1:
									//Storing wood price and floor type
									floorPrice[counter] = 33.98;
									methodPrice = 33.98;
									floorType[counter] = "Rustic Oak";
									
									//Displaying wood type and wood price you selected
									System.out.print("\n\n\tYou selected Rustic Oak");
									System.out.print("\n\tPrice: £33.98 per m2");
									break;
								case 2:
									//Storing wood price and floor type
									floorPrice[counter] = 27.99;
									methodPrice = 27.99;
									floorType[counter] = "Natural Oak";
									
									//Displaying wood type and wood price you selected
									System.out.print("\n\n\tYou selected Natural Oak");
									System.out.print("\n\tPrice: £27.99 per m2");
									break;
								case 3:
									//Storing wood price and floor type
									floorPrice[counter] = 39.99;
									methodPrice = 33.99;
									floorType[counter] = "Golden Oak";
									
									//Displaying wood type and wood price you selected
									System.out.print("\n\n\tYou selected Golden Oak");
									System.out.print("\n\tPrice: £39.99 per m2");
									break;
								case 4:
									//Storing wood price and floor type
									floorPrice[counter] = 99.00;
									methodPrice = 99.00;
									floorType[counter] = "Mayfair Walnut";
									
									//Displaying wood type and wood price you selected
									System.out.print("\n\n\tYou selected Mayfair Walnut");
									System.out.print("\n\tPrice: £99.00 per m2");
									break;	
							}
							
							//If the user selects a floor type, the underlay and fitting are worked out
							if (opt2 != 5)
							{
								//Displaying underlay options
								My.p("\n\n\tUnderlay");
								My.p("\n\t--------");
								My.p("\n\t1)  No Underlay");
								My.p("\n\t2)  Vapour Barrier  -  £19.99 roll of 20 m2");
								My.p("\n\t3)  Timberlay Silver  -  £49.99 roll of 10 m2");
								
								//inputing underlay option
								underlayOpt = MyVal.validInt("\n\n\tPlease select an option:  ", 1, 3);
								
								//Determining underlay price and roll size
								
								if (underlayOpt == 2)
								{
									//Storing underlay price
									underlayPrice = 19.99;
									
									//Storing underlay roll size
									underlayRoll = 20.00;
								}
								else if (underlayOpt == 3)
								{
									//Storing underlay price
									underlayPrice = 49.99;
									
									//Storing underlay roll size
									underlayRoll = 10.00;
								}
								
								//Displaying fitting options
								My.p("\n\n\tFitting");
								My.p("\n\t-------");
								My.p("\n\t0 - 20 m2  -  £200.00");
								My.p("\n\t21 - 40 m2  -  £350.00");
								My.p("\n\t41+ m2  -  £350.00 + £7.00 per m2 over 40");
								My.p("\n\n\tWould you like fitting:");
								My.p("\n\t1)  Yes");
								My.p("\n\t2)  No");
								
								//Inputing fitting option
								fittingOpt = MyVal.validInt("\n\n\tPlease select an option:  ", 1, 2);
							}
							
							//Offers away out for both switches
							opt1 = 4;
							opt2 = 5;
							
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
							System.out.print("\n\n\tYou selected 'Tiles'");
							System.out.print("\n\n\tPlease select desired option:  "); 
							opt2 = key.nextInt();
							
							//selection
							switch (opt2)
							{
							case 1:
								opt2 = opt2 - 1;
								System.out.print("\n\n\tYou selected " + tileName[opt1]);
								System.out.print("\n\n\tTile Size: 300x300mm, Medium");
								tilePrice = 5.99;
								System.out.print("\n\n\tPrice: £ " + tilePrice + " per tile ");
								details += "\n\tQuartz Stone Midnight Black: £" + tilePrice;
								break;
							
							case 2:
								opt2 = opt2 - 1;
								System.out.print("\n\n\tYou selected " + tileName[opt2]);
								System.out.print("\n\n\tTile Size: 300x300mm, Medium");
								tilePrice = 6.89;
								System.out.print("\n\n\tPrice: £ " + tilePrice + " per tile ");
								details += "\n\tPresealed Terracotta: £" + tilePrice;
								break;
								
							case 3:
								opt2 = opt2 - 1;
								System.out.print("\n\n\tYou selected " + tileName[opt3]);
								System.out.print("\n\n\tTile Size: 300x600mm, Large");
								tilePrice = 3.29;
								System.out.print("\n\n\tPrice: £ " + tilePrice + " per tile ");
								details += "\n\tSuper White Porcelain: £" + tilePrice;
								break;	
								
							case 4:
								opt2 = opt2 - 1;
								System.out.print("\n\n\tYou selected " + tileName[opt4]);
								System.out.print("\n\n\tTile Size: 310x560mm, Large");
								tilePrice = 4.67;
								System.out.print("\n\n\tPrice: £ " + tilePrice + " per tile ");
								details += "\n\tCoda Grey: £" + tilePrice;
								break;	
								
							case 5:
								opt2 = opt2 - 1;
								System.out.print("\n\n\tYou selected " + tileName[opt5]);
								System.out.print("\n\n\tTile Size: 300x150mm, Small");
								tilePrice = 2.99;
								System.out.print("\n\n\tPrice: £ " + tilePrice + " per tile ");
								details += "\n\tGrey Marble Split Mosaic: £" + tilePrice;
								break;						
							} opt2 = 6;// price setting
								
							
						} while (opt2 != 6); //end of tile selection
								
						
				}	
				
				//call tile extras options
				tilesExtras();
						
						
				System.out.print("\n\n\tPlease select an option:  ");
				opt3 = key.nextInt();
				
					switch (opt3)
						{
							case 1:
								System.out.print("\n\n\tYou selected Grey Grout ");
								greyGroutPrice = 29.95;
								System.out.print("\n\n\tPrice: £ " + greyGroutPrice + " per 20 sq metres ");
								break;
							
							case 2:
								System.out.print("\n\n\tYou selected White Grout ");
								greyGroutPrice = 19.95;
								System.out.print("\n\n\tPrice: £ " + whiteGroutPrice + " per 8 sq metres ");
								break;
							
							case 3:
								System.out.print("\n\n\tYou selected Spacers ");
								spacerPrice = 5.99;
								System.out.print("\n\n\tPrice: £ " + spacerPrice);
								break;						
						}opt3 = 4;//extras selection
								
						//Offers away out for both switches
						opt1 = 6;
						opt2 = 4;
						
						
					}while (opt3 != 4); //end of extras selection
					
					break;
			
			
				//Storing woodFlooring method in a variable
				totalCost = woodFlooringTotalCost(width, length, methodPrice) + underlayTotalCost(width, length, underlayPrice, underlayRoll) + fittingTotalCost(width, length, fittingOpt);
				
				//Adds £40 if the total cost is less than £1000
				if (totalCost < 1000)
					totalCost = totalCost + 40;
				
				} while (opt1 !=4);	
			
				//Storing tileFlooringMethod in variable
				
				tileTotalCost = tileFloorArea(width, length, tilePrice) + tileGroutCalc(width, length, groutPrice, groutSize) + tileFittingCalc(tilePrice); 
				
				
				
			//Works out the overall cost for the underlay, fitting and total cost
			underlayOverall[counter] = underlayTotalCost(width, length, underlayPrice, underlayRoll);
			fittingOverall[counter] = fittingTotalCost(width, length, fittingOpt);
			totalCostOverall[counter] =  totalCost;	
			
			//Works out the overall cost for the underlay, fitting and total cost
			groutOverall[counter] = tileGroutCalc(width, length, groutPrice, groutSize);
			tileFittingOverall[counter] = tileFittingCalc(tilePrice);
			tileOverallCost[counter] = tileFloorArea(width, length, tilePrice);
			
			//Works as a counter.
			counter++;
		}

		My.skip(20);
		
		My.p(String.format("\n\t%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "Floor", "Flooring", "Floor", "Floor Cost",  "Extras", "Fitting", "Total"));
		My.p(String.format("\n\t%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "Number", "", "Type", "per m2", "Cost", "Cost", "Cost"));
		My.p("\n\t----------------------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < floorCount; i++)
		My.p(String.format("\n\t%-15d %-15s %-15s £%-15.2f £%-13.2f £%-13.2f £%-13.2f", floorNum[i], floor[i], floorType[i], floorPrice[i], underlayOverall[i], fittingOverall[i], totalCostOverall[i]));
		My.p(String.format("\n\t%-15d %-15s %-15s £%-15.2f £%-13.2f £%-13.2f £%-13.2f", floorNum[i], floor[i], floorType[i], floorPrice[i], groutOverall[i], tileFittingOverall[i], tileOverallCost[i]));
		
	}
	
	public static void mainMenu()
	{
		//Displays main menu
		System.out.print("\n\n\tFloors Direct");
		System.out.print("\n\t-------------");
		System.out.print("\n\t1)  Solid Wood Flooring");
		System.out.print("\n\t2)  Carpets");
		System.out.print("\n\t3)  Tiles");
		System.out.print("\n\t4)  Exit");
	}
	
	public static void subMenu1()
	{
		//Displays solid wood flooring menu
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
		//Displays carpets menu
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
		//Displays tiles menu
		System.out.print("\n\n\tTiles");
		System.out.print("\n\t-----");
		System.out.print("\n\t1)  Quartz Stone Midnight Black  -  £5.99 (300x300mm)");
		System.out.print("\n\t2)  Presealed Terracotta  -  £6.89 (300x300mm)");
		System.out.print("\n\t3)  Super White Porcelain  -  £3.29 (300x600)");
		System.out.print("\n\t4)  Coda Grey  -  £4.67 (310x560mm)");
		System.out.print("\n\t5)  Grey Marble Split Mosaic  -  £2.99 (300x150mm)");
		System.out.print("\n\t6)  Exit");
	}
	
	//tiles extras
	
	public static void tilesExtras()
	{
		System.out.print("\n\n\tExtra options to go along with your purchase are listed below");
		System.out.print("\n\t-----");
		System.out.print("\n\t1) Grey Grout - 5kg - (20 sq metres) ");
		System.out.print("\n\t2) White Grout - 2kg - (8 sq metres) ");
		System.out.print("\n\t3) Spacers - (50 pack)");	
	}
	
	public static double woodFlooringTotalCost(int width, int length, double methodPrice)
	{
		//ConorJohnston
		
		
		//Declaring variables
		double area = 0.0, price = 0.0;
		
		//Working out the area of the room
		area = width * length;
		
		//Works out the total price needed including:flooring price, underlay price and fitting price
		price = area * methodPrice;
				
		//Returns the total price
		return price;
	}

	public static double underlayTotalCost(double width, double length, double underlayPrice, double underlayRoll)
	{
		//ConorJohnston
		
	
		//Declaring variables
		double area = 0.0, price = 0.0;
		int underlayAmount = 0;
		
		//Working out the area of the room
		area = width * length;
		
		//Works out the amount of underlay rolls needed
		underlayAmount = (int) (area / underlayRoll);
		if (area % underlayRoll != 0)
			underlayAmount = underlayAmount + 1;
		
		//Works out the underlay total cost
		price = underlayAmount * underlayPrice;
				
		//Returns the total price
		return price;
	}
	
	public static double fittingTotalCost(int width, int length, int fittingOpt)
	{
		//ConorJohnston
		
		
		//Declaring variables
		double area = 0.0, price = 0.0;
		
		//Working out the area of the room
		area = width * length;
		
		//Works out the cost for fitting
		if (fittingOpt == 1)
			if (area > 0 && area <= 20)
				price = 200;
			else if (area > 20 && area <= 40)
				price = 350;
			else if (area > 40)
				price = 350 + ((area - 40) * 7);
	
		//Returns the total price
		return price;
	}
	
	public static double tileFloorArea(double width, double length, double tilePrice)
	{
	
	//Ryan Fox
	
		//declare variables
		double area = 0.0, totalArea = 0.0;
		double tileLength = 0.0, tileWidth = 0.0, tileArea = 0.0;
		
		//calculate area for tile price
		
		area = width * length;
		
		//calculate area of each tile
		
		if(tileLength == 300 && tileWidth == 150)
		{
			tileArea = tileLength * tileWidth;
			totalArea = area / tileArea;
		}
		else if (tileLength == 300 && tileWidth == 300)
		{
			tileArea = tileLength * tileWidth;
			totalArea = area / tileArea;
		}
		else if (tileLength == 310 && tileWidth == 560)
		{
			tileArea = tileLength * tileWidth;
			totalArea = area / tileArea;
		}
		else if (tileLength == 300 && tileWidth == 600)
		{
			tileArea = tileLength * tileWidth;
			totalArea = area / tileArea;
		}
		
		
		//returns tile price
		tilePrice = tilePrice * totalArea;
				
		return tilePrice;
		
	}	
     
	
	public static double tileGroutCalc(double width, double length, double groutPrice, double groutSize)
	{	
		
	//Ryan Fox
		
		//variables declared
		double groutTotalCost = 0.0, area = 0.0;
		int groutAmount = 0;
	
	    //area of room
		
		area = width * length;
	
	    //calculate grout amount required
		groutAmount = (int)(area / groutSize);
		
		if (area % groutSize != 0)
		{	
			groutAmount = groutAmount += 1;
		}
		
		groutTotalCost = groutAmount * groutPrice;
	
		return groutTotalCost;
	}
		
	public static double tileFittingCalc(double tilePrice)
	{	
		
	//Ryan Fox
		
		//variables
		double fittingPrice = 50.00, smallTile = 1.25, mediumTile = 1.50, largeTile = 1.75; 									
		
		//calculate fitting price
		
		if (tilePrice < 3.00)
		{
			fittingPrice = fittingPrice + smallTile;
		}
		else if (tilePrice > 5.00)
		{
			fittingPrice = fittingPrice + mediumTile;
		}
		else if (tilePrice > 3.00 || tilePrice < 5.00)
		{
			fittingPrice = fittingPrice + largeTile;
		}
		
		
		return fittingPrice;
		
	}
		
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}