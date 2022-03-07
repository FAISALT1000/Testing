package com.tuwaiq.testing

import org.junit.Assert.*

import org.junit.Test

class MainActivityTest {

    @Test
    fun plus() {
        val result=MainActivity().plus(1,3)
        assertEquals(result,4)
    }
}