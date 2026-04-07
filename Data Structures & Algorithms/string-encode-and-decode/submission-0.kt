class Solution {

    fun encode(strs: List<String>): String {
        var result = ""
        for(str in strs){
            result += str.length.toString() + "#" + str
        }
        return result
    }

    fun decode(str: String): List<String> {
        if(str.isEmpty()) return listOf()
        
        val result = mutableListOf<String>()
        var i = 0
        while(i < str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }
            val length = str.substring(i,j).toInt()
            val word = str.substring(j+1, j+1+length)
            result.add(word)
            i = j+1+length
        }
        return result 
    }
}
