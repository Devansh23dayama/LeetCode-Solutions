class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area=0;

        while(left<right){
            //area = width(right-left) * height(array)
            area=Math.max(area,(right-left)*Math.min(height[left],height[right]));

            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
        
    }
}