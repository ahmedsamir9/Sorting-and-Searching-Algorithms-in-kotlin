package SortTypes

import SortAlgorithm

class CountSort:SortAlgorithm {
    override fun sort(list: Array<Int>) {
        val maxValue =findMax(list)
        val counter =Array<Int>(maxValue+1){
            it -> 0
        }
        for (item in list)
            counter[item]++

        var index =0
        for (i in 0 until counter.size){
            while (counter[i] != 0){
                list[index++]=i
                counter[i]--
            }
        }
    }
    private fun findMax(list: Array<Int>):Int{
        var maxValue = Int.MIN_VALUE
        for (i in 0 until list.size){
            if (maxValue < list[i]){
                maxValue =list[i]
            }
        }

        return maxValue
    }
}