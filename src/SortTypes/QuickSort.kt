package SortTypes

import SortAlgorithm

class QuickSort :SortAlgorithm {
    override fun sort(list: Array<Int>) {
        quickSort(list,0,list.size-1)
    }
    private fun quickSort(list: Array<Int> , start:Int,end:Int){
        // stopping condition
        if(start >= end)return
        // divide
        val pivot = partitiion(list ,start,end)
        //conquer
        //left part
        quickSort(list,start,pivot-1)
        //right part
        quickSort(list,pivot+1,end)
    }
    private fun partitiion(list: Array<Int> , start:Int,end:Int):Int{
        val pivot = list[end]
        var boundary = start-1
        for (i in start..end){
            if(list[i]<=pivot){
                ++boundary
                val temp = list[i]
                list[i]=list[boundary]
                list[boundary]=temp
            }
        }
        return boundary
    }
}