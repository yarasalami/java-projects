public void rotate(int[] nums, int k) {
  k = k % nums.length;
  int ans[] = new int[nums.length];
        
  for(int i=(nums.length-k); i<nums.length; i++){
    ans[i-(nums.length-k)] = nums[i];
  }
  for(int i=0; i<(nums.length-k); i++){
    ans[i+k] = nums[i];
  }
  for(int i=0; i<nums.length; i++){
    nums[i] = ans[i];
  }
}
