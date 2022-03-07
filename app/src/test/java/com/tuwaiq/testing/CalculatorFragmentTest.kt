package com.tuwaiq.testing

import org.junit.Assert.*

import org.junit.Test

class CalculatorFragmentTest {

    @Test
    fun plus() {
        val result=CalculatorFragment().plus(1,3)
        assertEquals(result,4)
    }
    @Test
    fun multiplied() {
        val result= CalculatorFragment().multiplied(5,5)
        assertEquals(result,25)
    }

    @Test
    fun divided() {
        val result= CalculatorFragment().divided(25,25)
        assertEquals(result,1)
    }

    @Test
    fun subtract() {
        val result= CalculatorFragment().subtract(25,20)
        assertEquals(result,5)
    }
}