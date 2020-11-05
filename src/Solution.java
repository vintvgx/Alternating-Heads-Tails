//Copyright [2020] <Kareem Saygbe>
//Java

public class Solution {

    public int solution (int[] A)
        {

            int size = A.length;
        int i = 0;
        int total = size; 
        int nChanged = 0;
        
        System.out.print("Original Array: (");
            for (int z = 0; z < size; z++)
                {
                    if(z == size-1)
                        {
                            System.out.print(A[z] + ")");
                            }
                    else
                        {
                            System.out.print(A[z] + ", ");
                        }
                }
            
        System.out.println();
        while(total != 0)
        {
            
            int temp = A[i];

            if(A[0] == 0)
            {
                if(i % 2 == 0)
                {
                    A[i] = 0;
                    //test if statement to see if array location was changed or not, ++ if it changed
                }
                else
                {
                    A[i] = 1;
                }
            }
            
            if(A[0] == 1)
            {
                if(i % 2 == 0)
                {
                    A[i] = 1;
                }
                else
                {
                    A[i] = 0;
                }
            }
            
            

            if(A[i] != temp)
            {       
                nChanged++;
                }

        
            
        i++;
        total--; 
        }
            System.out.print("Updated Array: (");
            for (int z = 0; z < size; z++)
                {
                    if(z == size-1)
                        {
                            System.out.print(A[z] + ")");
                            }
                    else
                        {
                            System.out.print(A[z] + ", ");
                        }
                }

        System.out.println("\nAmount of times N changed:" + nChanged);
            
            System.out.println();
            return 0;

            
        }


    public static void main(String[] args) throws Exception {
     
        int[] array1 = {1,0,1,0,0,0};
        int[] array2 = {1,1,1,0,0,0};
        int[] array3 = {1,0,1,0,0,0,0,0};

        Solution s1 = new Solution();
        s1.solution(array1);
        s1.solution(array2);
        s1.solution(array3);
    }
}
