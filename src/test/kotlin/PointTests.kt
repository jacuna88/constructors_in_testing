import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


/*

Issues
- Use of magic numbers
- Role of generated values in testing is not clear
- Use of Production constructor in Testing can cause refactoring issues (shotgun surgery)
*/
// fixme use helper here
// TODO fix tests to reflect role of testing cases
class PointTests {
    @Test
    fun `should test x`() {
        val point = Point(x = 32, y = 20)
        val result = point.x
        assertEquals(32, result)
    }

    @Test
    fun `should test y`() {
        val point = Point(x = 32, y = 20)
        val result = point.y
        assertEquals(20, result)
    }

    @Test
    fun `should trim x`() {
        val point = Point(x = 320, y = 20)
        val result = point.x
        assertEquals(50, result)
    }

    @Test
    fun `should trim y`() {
        val point = Point(x = 320, y = 200)
        val result = point.y
        assertEquals(80, result)
    }

}