class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val fl : MutableList<MutableList<String>> = mutableListOf()
        val map: HashMap<String, MutableList<String>> = HashMap()
        for(str in strs){
            val sortedString = str.toCharArray().sorted().joinToString("")
            if(map.contains(sortedString)){
                map[sortedString]!!.add(str)
            }else{
                map[sortedString] = mutableListOf(str)
            }
        }
        for((k , v) in map){
            fl.add(v)
        }
        return fl
    }
}
