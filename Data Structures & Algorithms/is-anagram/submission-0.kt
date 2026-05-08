class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val counter = IntArray(26)
        for(i in s.indices){
            counter[s[i] - 'a']++
            counter[t[i] - 'a']--
        }
        return counter.all{ it == 0}
    }
}
