class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        val map = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )

        for(c in s){
            if(c in map.values){
                stack.addLast(c)
            }else{
                if(stack.isEmpty() || stack.removeLast() != map[c]) return false
            }
        }

        return stack.isEmpty()
    }
}
