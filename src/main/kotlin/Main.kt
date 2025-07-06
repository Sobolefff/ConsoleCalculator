package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    while (true) {
        println("Введите первое число: ")
        val num1 = readLine()?.toDoubleOrNull()

        println("Введите операцию(+,-,*,/): ")
        val operation = readLine()

        println("Ведите второе число: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || operation == null || num2 == null) {
            println("Ошибка ввода. Убедитесь, что вы ввели оба числа и операцию")
            continue
        }

        val result: Double = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    println("Деление на ноль невозможно.")
                    continue
                } else {
                    num1 / num2
                }
            }

            else -> {
                println("Неизвестная операция: $operation. Попробуйте снова")
                continue
            }
        }
        if (result % 1.0 == 0.0) {
            println("Результат: ${result.toInt()}")
        } else {
            println("Результат: $result")
        }
        println("Хотите продолжить или выйти?(да/нет)")
        val again = readLine()
        if (again?.lowercase() == "да") break
    }
}

