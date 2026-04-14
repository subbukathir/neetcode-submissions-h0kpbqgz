class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        var left = 0
        val map = mutableMapOf<Char, Int>()

        for(right in s.indices){
            val char = s[right]

            if(map.contains(char)){
                left = maxOf(left, map[char]!! + 1)
            }
            map[char] = right
            maxLength = maxOf(maxLength, right - left + 1)
        }
        return maxLength
    }
}
