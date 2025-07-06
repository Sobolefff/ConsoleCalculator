package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите первое число: ")
    val num1 = readLine()?.toDouble()

    println("Введите операцию(+,-,*,/): ")
    val operation = readLine()

    println("Ведите второе число: ")
    val num2 = readLine()?.toDouble()

    if (num1 == null || operation == null || num2 == null) {
        println("Ошибка ввода. Убедитесь, что вы ввели оба числа и операцию")
        return
    }

    val result: Double = when(operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if(num2 == 0.0) {
                println("Деление на ноль невозможно.")
                return
            } else {
                num1 / num2
            }
        }
        else -> {
            println("Неизвестная операция: $operation")
            return
        }
    }
    val intResult: Int
    if (((result * 10) % 10) == 0.0) {
        intResult = result.toInt()
        println("Результат: ${intResult}")
    } else {
        println("Результат: ${result}")
    }
}

