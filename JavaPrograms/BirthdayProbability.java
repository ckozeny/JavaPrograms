import java.util.Random;
public class ckozeny_Birthdays { 
    public static void main ( String args[] ){
    
		Random randomNumbers = new Random();  
    	int[] countArray = new int[366];			// Space for each day in the year
    	
		int smallest = 1000;						// Start with arbitrarily high number
    	int largest = countArray[0];
    	
		int[] Birthdays = new int[18975];
		int position = 0, position2 = 0;
		double probability = 0;
       
    	System.out.println ("\n\tThe Century Link Center in Omaha, Nebraska has a capacity of 18,975 patrons." 
							+ "\n\tThe probability that each has a birthday on a specific day is listed below."
							+ "\n\tA list of occupants in the Century Link center and their birthdays:\n");
        
		for (int i = 0; i<Birthdays.length; i++)
		{
            Birthdays[i]= randomNumbers.nextInt(366);}

            for (int r : Birthdays)
            	countArray[r]++;
            
            for (int x = 1; x < countArray.length; x++) 
			{
                probability = countArray[x]/18975.0;    
				if (x > 99)
				{
					System.out.print("\t");
					if (x > 199)
					{
						System.out.print("\t");
						if (x > 299)
							System.out.print("\t");
					}
				}

				System.out.printf("Day %d: %d  people - %.4f%% of the total.\n", x, countArray[x], probability);
			}
            
            for (int y=1; y<countArray.length; y++)
			{
                if (countArray[y] > largest)
                {
				    largest = countArray[y];
					position2 = y;
                }
				if (countArray[y] < smallest)
                {
				    smallest = countArray[y];
					position = y;
				}
            }
          
/*            int position = -1;
            for (int n = 0; n < countArray.length; n++)
			{
                if (countArray[n] == smallest)
                    position = n;
            }

			int position2 = -1;
            for (int d = 0; d < countArray.length; d++)
			{
                if (countArray[d] == largest )
                    position2 = d;
            }
*/   
            System.out.printf ("\n\tThe day that the most people have a birthday on is day %d with %d birthdays.\n", position2, largest);
            System.out.printf ("\tThe day that the least amount of people have a birthday on is day %d with %d birthdays.\n\n", position, smallest);
	}
}
