package com.tuwaiq.testing

import org.junit.Assert.*

import org.junit.Test

class BlankFragmentTest {

    @Test
    fun plus() {
        val result=BlankFragment().plus(1,3)
        assertEquals(result,4)
    }
    @Test
    fun multiplied() {
        val result= BlankFragment().multiplied(5,5)
        assertEquals(result,25)
    }

    @Test
    fun divided() {
        val result= BlankFragment().divided(25,25)
        assertEquals(result,1)
    }

    @Test
    fun b() {
        val result= BlankFragment().b(25,20)
        assertEquals(result,5)
    }
}