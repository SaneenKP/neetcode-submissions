class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sol = IntArray(2)
        val m = HashMap<Int,Int>()
        for(i in nums.indices){
            val dif = target - nums[i]
            if(m.containsKey(dif)){
                sol[0] = m[dif]!!
                sol[1] = i
                break
            }else{
                m[nums[i]] = i
            }
        }
        return sol
    }
}
