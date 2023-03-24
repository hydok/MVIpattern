package io.hydok.mvipattern


sealed class CalculatorSideEffect {
    data class Toast(val text: String) : CalculatorSideEffect()
}