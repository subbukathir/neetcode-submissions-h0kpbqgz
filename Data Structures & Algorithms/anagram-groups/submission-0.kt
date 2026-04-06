class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val visited = BooleanArray(strs.size)
        for(i in strs.indices){
            if(visited[i]) continue

            val childList = mutableListOf<String>()
            
            for(j in strs.indices){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    childList.add(strs[j])
                    visited[j] = true
                }
            }
            result.add(childList)
        }
        return result
    }

    fun isAnagram(s1:String, s2: String) :Boolean {
        if(s1.length != s2.length) return false
        val freqArr = IntArray(26)
        
        for(i in s1.indices){
            freqArr[s1[i] - 'a']++
            freqArr[s2[i] - 'a']--
        }

        return freqArr.all { it == 0}
    }
}
