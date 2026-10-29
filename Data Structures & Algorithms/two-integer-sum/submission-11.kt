class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val swi = nums.withIndex().sortedBy(){ it.value }
        var l = 0
        var r = swi.lastIndex

        while(true){
            val sum = swi[l].value + swi[r].value
            when{
                sum<target ->{
                    l++
                }
                sum>target ->{
                    r--
                }
                sum==target ->{
                    val idx1 = swi[l].index
                    val idx2 = swi[r].index
                    return if (idx1 < idx2) intArrayOf(idx1, idx2) else intArrayOf(idx2, idx1)                }
                else -> {}
            }
        }
    }
}
