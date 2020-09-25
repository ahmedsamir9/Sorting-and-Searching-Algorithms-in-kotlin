package SearchTypes

import SearchingAlgorithm

class BinarySearch :SearchingAlgorithm{
    override fun search(list: List<Int>, target: Int): Boolean {

         var newList = list.sorted()
        newList.forEach {
            println(it)
        }
        return itrativeBinarySearch(newList,target,0,list.size-1)
    }
    fun recursiveBinarySearch(list: List<Int>, target: Int, left:Int, right:Int):Boolean{
        if(left <= right){
        val middle = left+(right+left)/2
        if (list[middle] == target) return true
        if(list[middle] > target) return recursiveBinarySearch(list,target,left,middle-1)
        return recursiveBinarySearch(list,target,middle+1,right)}
        return false
    }
    fun itrativeBinarySearch(list: List<Int>, target: Int , left: Int,right: Int):Boolean{
        var rightIndex = right
        var leftIndex = left
        while (leftIndex <= rightIndex){
            val middle = leftIndex +(rightIndex-leftIndex)/2
            if (list[middle] == target) return true
            if(list[middle] > target) rightIndex = middle-1
            else
                leftIndex = middle+1
        }
        return false
    }
}