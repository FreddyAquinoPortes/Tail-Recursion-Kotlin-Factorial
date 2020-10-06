import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>)
{
    var num = BigInteger("5")
    println (fact(num,BigInteger.ONE))
}
tailrec fun fact(num: BigInteger,r: BigInteger):BigInteger
{
    if(num==BigInteger.ZERO)
        return r;
    else{
        return fact(num-BigInteger.ONE,num*r)
    }

}