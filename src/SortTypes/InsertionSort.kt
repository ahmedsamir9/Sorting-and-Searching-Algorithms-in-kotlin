package SortTypes

import SortAlgorithm

class InsertionSort :SortAlgorithm {
    override fun sort(list: Array<Int>) {
        var j : Int
        for(i in 1 until list.size){
            var currentValue = list[i]
            j = i - 1
            while (j >= 0 && currentValue < list[j] ){
                list[j+1]=list[j]
                j--
            }
            list[j+1]= currentValue
        }
    }
}