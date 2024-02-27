package com.dineshprabha.calculatorapp.usecase

import com.dineshprabha.calculatorapp.presentation.demo.CalculatorOperations

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation : CalculatorOperations?= null
)
