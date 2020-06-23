package SortTypes

import SortAlgorithm

class BucketSort:SortAlgorithm {
    override fun sort(list: Array<Int>) {
     val buckets = Array<ArrayList<Int>>(3 , { i-> ArrayList() })
        buckets.forEach {
             ArrayList<Int>()
        }
        for (i in list){
            buckets.get(i/3).add(i)
        }
        var index = 0
        for ( bucket in buckets){
            bucket.sort()
            for (item in bucket)
            list[index++] = item
        }
    }
}