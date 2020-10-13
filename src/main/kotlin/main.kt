import java.util.*

fun main() {
    val number1 = Scanner(System.`in`)
    print("Введите предыдущую сумму покупок: ")
    val lastSumm = number1.nextDouble()
    print("Введите сумму покупок: ")
    var summ = number1.nextDouble()
    print("Постоянный клиент (Да/Нет) ?")
    val meloman = number1.next()

    val discount = if (lastSumm > 10_000) {
        summ * 0.05
    } else {
        if (lastSumm > 1000) {
            100.0
        } else {
            0.0
        }
    }
    summ -= discount
    if (summ < 0) {
        summ = 0.0
    }
    if (meloman == "Да") {
        summ *= 0.99
    }
    print("Cумма к оплате: $summ")
}