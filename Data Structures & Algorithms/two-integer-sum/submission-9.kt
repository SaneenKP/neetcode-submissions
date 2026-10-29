class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mp : MutableMap<Int,Int> = mutableMapOf()
        for(i in 0 until nums.size){
            val diff = target - nums[i]
            if(mp[diff] == null){
                mp[nums[i]] = i
            }else{
                return intArrayOf(mp[diff]?:0,i)
            }
        }
        return intArrayOf()
    }
}
