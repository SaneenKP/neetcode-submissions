class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for(i in nums){
            if(hashSet.contains(i)) return true
            hashSet.add(i)
        }
        return false
    }
}