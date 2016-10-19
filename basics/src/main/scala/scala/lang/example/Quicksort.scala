package scala.lang.example

/**
  *
  *
  * @author <a href="mailto:dan.andrei.carp@gmail.com">Dan Andrei Carp</a>
  */
object Quicksort {
  def sort(xs: Array[Int]): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }

    def sort1(l: Int, r: Int): Unit = {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i < j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (i < r) sort1(i, r)
    }

    def sort2(l:Int, r:Int): Unit = {
      if (l < r) {
        var q = l
        var i = l
        while (i < r) {
          if (xs(i) < xs(r)) {
            swap(i, q)
            q += 1
          }
          i += 1
        }
        swap(q, r)
        sort2(l, q - 1)
        sort2(q + 1, r)
      }
    }

    sort1(0, xs.length - 1)
//    sort2(0, xs.length - 1)
  }

  var array: Array[Int] = Array(9, 7, 5, 11, 12, 2, 14, 3, 10, 6)

  def main(args: Array[String]): Unit = {
    sort(array)
    println(array.mkString(","))
  }
}
