class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if(strs.size <= 1) return listOf(strs.toList())
        val sortedStrs = mutableListOf<String>()
        val anagramMap = mutableMapOf<String,MutableList<String>>()
        strs.forEach(){ value ->
            sortedStrs.add(value.toList().sorted().joinToString(""))
        }
        for(i in 0 until strs.size){
            val anagramList = anagramMap[sortedStrs[i]]
            if(anagramList != null && anagramList.size != 0){
                anagramList.add(strs[i])
                anagramMap[sortedStrs[i]] = anagramList
            }else{
                anagramMap[sortedStrs[i]] = mutableListOf(strs[i])
            }
        }
        val finalAnagramList : MutableList<List<String>> = mutableListOf()
        anagramMap.values.forEach{ v ->
            finalAnagramList.add(v)
        }
        return finalAnagramList.toList()
    }
}
