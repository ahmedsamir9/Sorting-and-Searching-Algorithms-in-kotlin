package SortTypes

import SortAlgorithm

class BubbleSort: SortAlgorithm {
    override fun sort(list: Array<Int>) {
        var isSorted = false
        while (!isSorted){
            isSorted = true
            for (i in 0 until list.size-1){
                if (list[i] > list[i+1]){
                    val temp = list[i]
                    list[i] = list[i+1]
                    list[i + 1] = temp
                    isSorted = false
                }

            }
        }
    }

}