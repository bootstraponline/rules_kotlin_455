package example

import org.junit.Test
import org.junit.Assert.*

class SimpleTest {

    @Test
    fun expectedToFail() {
        assertEquals(0, 1)
    }

    @Test
    fun expectedToPass() {
        assertEquals(1, 1)
    }
}
