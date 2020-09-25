package SearchTypes

import SearchingAlgorithm

class LinearSearch : SearchingAlgorithm{
    override fun search(list: List<Int>, target: Int): Boolean {
        list.forEach { item ->
        if (item == target) return true
        }
        return false
    }

}