package SearchTypes

import SearchingAlgorithm

class ExponentialSearch:SearchingAlgorithm {
    override fun search(list: List<Int>, target: Int): Boolean {
        var bound  = 1
        while (bound < list.size &&
                list[bound]<target)
            bound*=2
        val left =bound/2
        val right = bound.coerceAtMost(list.size-1)

        return BinarySearch().itrativeBinarySearch(list,target,left,right)
}
}