
public class TwoDArrayChallenges 
{
	public static void main(String[] args) 
	{
		int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8},
			{6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 0}, {2, 5, 1, 7, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
		maximumNumber(myArray);
		minimumNumber(myArray);
		averageNumbers(myArray);
		
	}

		private static int maximumNumber(int [] [] myArray) 
		{
			int maxValue = myArray[0][0];
			for(int i = 0; i < myArray.length; i++)
			{
				for(int j = 0; j < myArray[i].length; i++)
				{
					if (myArray[i][j] > maxValue) 
					{
	                    maxValue = myArray[j][i];
	                }
				}
			}
			return maxValue;
		}

		private static int minimumNumber(int [] [] myArray) 
		{
			 int minValue = myArray[0][0];
		        for (int row = 0; row < myArray.length; row++) 
		        {
		            for (int col = 0; col < myArray[row].length; row++) 
		            {
		                if (myArray[row][col] < minValue ) 
		                {
		                    minValue = myArray[row][col];
		                }
		            }
		        }
		        return minValue ;
		}

		private static void averageNumbers(int [] [] myArray) 
		{
			 int counter=0;
		     double sum = 0;
		     for(int i = 0; i < myArray.length; i++)
		     {
		            for(int j=0;j<myArray[i].length;j++)
		            {
		                sum = sum+myArray[i][j];
		                counter++;
		            }
		     }
		     System.out.println(sum / counter);
		            
		}
}
