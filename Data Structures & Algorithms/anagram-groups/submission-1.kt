class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val finalList : MutableList<MutableList<String>> = mutableListOf()
        val frequencyMap : Array<IntArray> = Array(strs.size) { IntArray(26) }
        val mp = HashMap<Int , MutableList<String>>()

        for(i in 0..strs.size-1){
            for(chr in strs[i]){
                frequencyMap[i][chr-'a']++
            }
            val fms = frequencyMap[i].toList().hashCode()
            if(mp.contains(fms)){
                mp[fms]!!.add(strs[i])
            }else{
                mp[fms] = mutableListOf(strs[i])
            }
        }
        for((k,v) in mp){
            finalList.add(v)
        }
        return finalList
    }
}
