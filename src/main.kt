import SearchTypes.BinarySearch
import SearchTypes.ExponentialSearch
import SearchTypes.LinearSearch
import SearchTypes.TinarySearch
import SortTypes.BucketSort
import SortTypes.CountSort
import SortTypes.QuickSort

fun main() {
    val arr = listOf<Int>(1,67,2,3,4,5)
    //mention type of sort
     val searchingAlgorithm = ExponentialSearch()
        print(searchingAlgorithm.search(arr.sorted(),5))

}