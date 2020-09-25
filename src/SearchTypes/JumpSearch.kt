

class JumpSearch : SearchingAlgorithm{
    override fun search(list: List<Int>, target: Int): Boolean {
        val newList =list.sorted()
        val blockSize:Int= Math.sqrt((((list.size-1).toDouble()))).toInt()
        var start = 0
        var next = blockSize
        while (start < list.size
                && newList[next-1] < target){
            start =next
            next +=blockSize
            if (next > list.size)
                next =  list.size

        }
        for (i in start until next){
            if (newList[i] == target)return true
        }

        return false
    }


}