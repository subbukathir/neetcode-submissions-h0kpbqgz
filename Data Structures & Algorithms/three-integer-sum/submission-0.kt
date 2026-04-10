class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val list = mutableSetOf<List<Int>>()

        for(i in nums.indices){
            for(j in i + 1 until nums.size){
                for(k in j + 1 until nums.size){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        val triplet = listOf(nums[i], nums[j], nums[k]).sorted()
                        list.add(triplet)
                    }
                }
            }
        }
        return list.toList()
    }
}
