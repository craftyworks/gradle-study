package com.ddam40.example

import org.junit.Assert.assertEquals
import org.junit.Test

class MyLibraryTest {
    @Test
    fun testMyLanguage() {
        assertEquals("Kotlin", MyLibrary().kotlinLanguage().name)
        assertEquals(10, MyLibrary().kotlinLanguage().hotness)
    }
}

