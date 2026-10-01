class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val fMap : MutableMap<Int,Int> = mutableMapOf()
        val result = IntArray(k)
        nums.forEach{ n ->
            fMap[n] = (fMap[n]?:0) + 1
        }

        for(i in 0 until k){

            var maxVal = 1
            var maxValKey = 1

            fMap.forEach{ k , v ->
                if(v >= maxVal){
                    maxVal = v
                    maxValKey = k
                }
            }
            result[i] = maxValKey
            fMap.remove(maxValKey)
        }
        return result
    }
}
