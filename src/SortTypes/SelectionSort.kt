package SortTypes

import SortAlgorithm

class SelectionSort : SortAlgorithm {
    override fun sort(list: Array<Int>) {
        for (i in 0 until list.size){
            var targetIndex = i
            for (j in i until list.size){
                if (list[targetIndex] > list[j]){
                    targetIndex = j
                }
            }
            val temp = list[i]
            list[i] = list[targetIndex]
            list[targetIndex]=temp
        }
    }
}