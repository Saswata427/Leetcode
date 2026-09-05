class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0,end=nums.length-1;
        int mid;
        while(beg<=end){
            mid=beg+(end-beg)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                beg=mid+1;
            }
        }
        return beg;
    }
}