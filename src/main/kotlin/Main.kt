import java.text.DecimalFormat

fun main(args: Array<String>) {
    var money = DecimalFormat("$###,###,###.00")
    var itemTotal = items()
    var tax = tax(cost = itemTotal)
    var afterTax = add(cost = itemTotal, tax = tax)
    var rTip = tip(cost = itemTotal)

    println("Total before Taxes: " + money.format(itemTotal))
    println("Taxes: " + money.format(tax))
    println("Total after Taxes: " + money.format(afterTax))
    println("Recommended 17.5% Tip:" + money.format(rTip))



    println("\nGoodbye")
}
fun items(): Double {
    var itemTotal = 0.00
    var item = 1.00
    while (item != 0.00) {
        println("Enter the cost of the item: ")
        item = readLine()!!.toDouble()
        itemTotal += item
    }
    return itemTotal
}
fun tax(cost: Double): Double{
    var tax = 0.025
    var itemTax = cost * tax
    return itemTax
}
fun add(cost: Double, tax: Double): Double{
    return cost + tax
}
fun tip(cost: Double): Double{
    var rtip = 0.175
    var tip = cost * rtip
    return tip

}