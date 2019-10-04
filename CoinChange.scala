/*
 Given: 
 Expected: 
 https://github.com/codingforinterviews/practice-problems/tree/master/coin_change
*/

object CoinChange extends App {
    val coins = [1, 2, 3]
    val amount = 4

    val res = getPermutations(coins, amount, 0)
    println(res)
    // TODO: solution does not ignore order
    private def getPermutations(coins: List[Int], amount: Int, res: Int): Int = {
        var res = res

        for( var c <- coins if c <= amount) {
            val rest = amount - c 
            if (rest == 0) {
                res = res + 1
            } else {
                res = res + getPermutations(coins, rest)
            }
        }
        return res
    }
}