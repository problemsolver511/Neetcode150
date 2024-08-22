/*

You are given an integer array heights where heights[i] represents the height of the i'th bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Input: height = [1,7,2,5,4,7,3,6]

Output: 36

Input: height = [2,2,2]

Output: 4

*/


//  Method 1 - BruteForce Approach 

class ContainerWithMostWater{
	

static int maxWaterArea(int[] height){

int maxArea = 0;

 for(int i = 0 ;i <height.length ;i++ ){

	 for(int j = i+1 ; j < height.length ; j++){

        int area = Math.min(height[i],height[j]) * (j-i);
        maxArea  = Math.max(maxArea,area);
	}
 }

return maxArea;
}

public static void main(String[] arg){

 int[] height = {1,7,2,5,4,7,3,6} ;
 System.out.println(maxWaterArea(height));
 
}

//Time Complexity   -  O(n^2)
// Space Complexity -  O(1)
}



// Method 2 - Optimized Approach  


class ContainerWithMostWater{
	

static int maxWaterArea(int[] height){

int maxArea = 0;
 
 int left = 0;
 int right = height.length-1;


	 while( left < right ) { 



        int area = Math.min(height[left],height[right]) * (right-left);
        maxArea  = Math.max(maxArea,area);

        if(left < right ){
        	left++;
        }
        else{
        	right--;
        }
        
	}
 return maxArea;
 }



public static void main(String[] arg){

 int[] height = {1,7,2,5,4,7,3,6} ;
 System.out.println(maxWaterArea(height));
 
}

//Time Complexity   -  O(n)
// Space Complexity -  O(1)
}



