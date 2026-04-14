class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = heights.size - 1

        while(left < right){
            val width = right - left
            maxArea = Math.max(maxArea, Math.min(heights[left], heights[right]) * width)
            if(heights[left] < heights[right]) {
                left++
            }else right--
        }
        return maxArea
    }
}
