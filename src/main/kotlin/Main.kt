fun main() {

    //Write an extension method that filters a list by value (e.g. smaller than 500).
    // Write an extension method that prints list values. Then create a list that that has at least 10 members,
    // filter them and then print the values that pass the filter.

    val listOfNumbers = listOf(0,50,100,150,200,250,300,350,400,450,500,550,600,650,700,750,800,850,900,950,1000)
    val filteredList = listOfNumbers.filterByValue(500)
    filteredList.printValues()
}

fun List<Int>.filterByValue(valueToFilter: Int): List<Int> {
    return this.filter { it < valueToFilter}
}

fun List<Int>.printValues() {
    this.forEach { println(it) }
}