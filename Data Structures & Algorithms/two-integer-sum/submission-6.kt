class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sol = IntArray(2)
        val finalSortedWithIndices = nums.withIndex().sortedBy{it.value}
        var i = 0
        var j = finalSortedWithIndices.size-1
        while(i < j){
            val result = finalSortedWithIndices[i].value + finalSortedWithIndices[j].value
            when{
                result == target -> {
    sol[0] = minOf(finalSortedWithIndices[i].index, finalSortedWithIndices[j].index)
    sol[1] = maxOf(finalSortedWithIndices[i].index, finalSortedWithIndices[j].index)
    break
}
                result < target -> {
                    i++
                }
                else -> j--
            }
        }
        return sol
    }
}
