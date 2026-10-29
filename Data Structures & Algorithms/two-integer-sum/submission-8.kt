class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if(nums.size == 2) return intArrayOf(0,1)
        val ind = IntArray(2)
        for(i in 0 until nums.size){
            for(j in i+1 until nums.size){
                if(nums[i] + nums[j] == target){
                    ind[0] = i
                    ind[1] = j
                }
            }
        }
        return ind
    }
}
