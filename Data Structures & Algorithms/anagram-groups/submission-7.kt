class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mp : MutableMap<String, MutableList<String>> = mutableMapOf()
        return strs.groupByTo(mp){ it.toCharArray().sorted().joinToString("")}.values.toMutableList()
    }
}
