class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        strs.forEach{ v ->
            val freq = IntArray(26){0}
            for(i in 0 until v.length){
                freq[v[i] - 'a']++
            }

            var fstring = ""
            for(f in freq){
                fstring = "$fstring#$f"
            }
            if(map.containsKey(fstring)){
                map[fstring]?.add(v)
            }else{
                map[fstring] = mutableListOf(v)
            }
        }
        return map.values.toList()
    }
}
