class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val mp1 = mutableMapOf<Char,Int>()
        val mp2 = mutableMapOf<Char,Int>()
        s.forEach{ s1 ->
            mp1[s1] = (mp1[s1] ?: 0) + 1
        }
        t.forEach{ t1 ->
            mp2[t1] = (mp2[t1] ?: 0) + 1
        }
        return mp1 == mp2
    }
}
