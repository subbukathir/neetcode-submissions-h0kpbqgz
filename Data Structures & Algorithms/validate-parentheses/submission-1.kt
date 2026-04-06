class Solution {
    fun isValid(s: String): Boolean {
        val stackChar = Stack<Char>()

        for(c in s){
            if(c == '(' || c == '{' || c == '['){
                stackChar.push(c)
            }else{
                if(stackChar.isEmpty()) return false
                
                val del = stackChar.pop()
                if(c == ')' && del != '(') return false
                if(c == '}' && del != '{') return false
                if(c == ']' && del != '[') return false  
            }
        }

        return stackChar.isEmpty()
    }
}
