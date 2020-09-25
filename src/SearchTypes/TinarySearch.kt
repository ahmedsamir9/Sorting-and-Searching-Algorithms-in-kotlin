package SearchTypes

import SearchingAlgorithm

class TinarySearch:SearchingAlgorithm {
    override fun search(list: List<Int>, target: Int): Boolean {
        var newList = list.sorted()
        newList.forEach {
            println(it)
        }
        return recTinarySearch(newList,target,0,list.size-1)
    }
    fun recTinarySearch(list: List<Int>, target: Int, left:Int, right:Int):Boolean{
        if (left>right)return false
        val partitionSize = (right - left)/3
        val mid1 = left+partitionSize
        val mid2 = right-partitionSize
        if (list[mid1] == target)return true
        if (list[mid2]==target)return true
        if (list[mid1]> target )
            return recTinarySearch(list,target,left,mid1-1)
        if (list[mid2]< target)
            return recTinarySearch(list, target, mid2+1, right)
        return recTinarySearch(list, target, mid1+1,mid2-1)
    }
}