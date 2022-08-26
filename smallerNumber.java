class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] small=new int[101];
        
  for(int i=0;i<nums.length;i++)
            
       {     
        small[nums[i]]++;
       }
  for(int i=1;i<101;i++)
            {
            small[i]+=small[i-1];
            }
  for(int i=0;i<nums.length;i++)
            {
      int count =nums[i];
      if(count==0)
          nums[i]=0;
      else
      {
          nums[i]=small[count-1];
          }
            }
        return nums;
    }
        
}