import SortTypes.BucketSort
import SortTypes.CountSort
import SortTypes.QuickSort

fun main() {
    val arr = arrayOf(5,6,1,3,2)
    //mention type of sort
     val sorter : SortAlgorithm=BucketSort()
        sorter.sort(arr)
    for(i in 0 until arr.size){
        print(arr[i])
    }
}