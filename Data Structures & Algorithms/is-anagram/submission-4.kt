class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val ss = s.toCharArray().sorted().joinToString("")
        val st = t.toCharArray().sorted().joinToString("")
        println("ss = $ss")
        println("st = $st")
        return ss == st
    }
}
