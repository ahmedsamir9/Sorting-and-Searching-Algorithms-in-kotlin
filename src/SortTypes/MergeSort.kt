package SortTypes

import SortAlgorithm

class MergeSort :SortAlgorithm {
    override fun sort(list: Array<Int>) {
        //stopping condition
        if (list.size < 2)return
        //divide
        val middle :Int= list.size/2
        val leftArr = Array<Int>(middle) {
            it
        }
        for (i in 0 until  middle){
            leftArr[i]=list[i]
        }
        val rightArr = Array<Int>(list.size - middle){
            it
        }
        for (i in middle until  list.size){
            rightArr[i-middle]=list[i]
        }
        //conquer
        sort(leftArr)
        sort(rightArr)
        //combine
        merge(leftArr,rightArr,list)
    }

  private  fun merge(left :Array<Int>,right:Array<Int>,result:Array<Int>){
        var leftIndex =0
        var rightIndex=0
        var i=0
        while (leftIndex != left.size &&rightIndex !=right.size){
            if(left[leftIndex]<right[rightIndex]){
                result[i++]=left[leftIndex++]
            }
            else{
                result[i++]=right[rightIndex++]
            }
        }
        while (leftIndex != left.size){
            result[i++]=left[leftIndex++]
        }
        while (rightIndex !=right.size){
            result[i++]=right[rightIndex++]
        }
    }
}