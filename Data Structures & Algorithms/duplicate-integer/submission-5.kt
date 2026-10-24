class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val mp = mutableMapOf<Int,Int>()
        nums.forEach{ v ->
            mp[v] = (mp[v] ?: 0) + 1
            if((mp[v] ?: 0) > 1) return true
        }
        return false
    }
}
