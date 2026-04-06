class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val fArr = IntArray(26)

        for(i in s.indices){
            fArr[s[i] - 'a']++
            fArr[t[i] - 'a']--
        }
        return fArr.all {it == 0}
    }
}
