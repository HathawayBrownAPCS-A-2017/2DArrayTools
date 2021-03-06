
/**
 * A two-dimensional array of integers
 * 
 * @author APCS@HB
 */
public class TwoDIntArray
{
    private int[][]  nums;
    private final int NUM_ROWS = 6;
    private final int NUM_COLS = 10;
    
    public TwoDIntArray ()
    {
        nums = new int[NUM_ROWS][NUM_COLS];
        fillRandom (0, 100);
    }
    
    /**  
     *   Fills the 2-D array with random integers between min and max, inclusive
     *   
     *   @param min  The smallest possible value for the array
     *   @param max  The largest possible value for the array
     */
    public void fillRandom (int min, int max)
    {
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = 0; // fill this in!
            }
        }
    }
    
    /**
     *    Calculates the sum of the items in the 2D array
     *    
     *    @return  The sum of all integers in the array
     */
    public int getSum()
    {
    }

    /** 
     *    Calculates the average of the integers in the 2D array
     *    
     *    @return the average of all integers in the array
     */
    public double getAverage()
    {
    }
    
    /**   
     *    Finds the largest value in the 2D array
     *    
     *    @return  the largest value in the 2D array
     */
    public int getMaxValue ()
    {
    }
    
    /**
     *     Finds the index of the largest value in the 2D array
     *     
     *     @return  .... WHAT ????  How to do this?
     */
    public int[] getMaxIndex ()
    {
    }
    
    public static void main (String[] args)
    {
        TwoDIntArray myArray = new TwoDIntArray();
        System.out.println(myArray);
        System.out.println("The sum of the elements is " + myArray.getSum());
        System.out.println("The average value is " + myArray.getAverage());
        System.out.println("The largest element is " + myArray.getMaxValue() +
           " in row " + " and column " );
    }
}
