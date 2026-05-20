class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sol = IntArray(2)
        for(i in nums.indices){
            for (j in i+1 until nums.size){
                val result = nums[i] + nums[j]
                if(result == target){
                    sol[0] = i
                    sol[1] = j
                }
            }
        }
        return sol
    }
}
