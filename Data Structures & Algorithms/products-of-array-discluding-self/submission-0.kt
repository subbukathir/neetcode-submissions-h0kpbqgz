class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        for(i in nums.indices){
            var num = 1
            for(j in nums.indices){
                if(i != j){
                    num *= nums[j] 
                }
            }
            result[i] = num
        }
        return result
    }
}
