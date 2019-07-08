import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * The test class LocationTest tests the Location Class.
 *
 * @author Doyt Perry/<insert your name here>.
 * @version Winter 2019.
 */
public class LocationTest
{
    /**
     * Default constructor for test class LocationTest.
     */
    public LocationTest()
    {
        // not used in this Lab
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        // not used in this Lab
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        // not used in this Lab
    }


    /**
     * Test object creation with two-parameter constructor.
     */
    @Test
    public void testConstructor()
    {
        // create an instance of the Location class
        Location location1 = new Location(39.95, -82.1);

        // Test to see if the instance was created
        assertNotNull(location1);

        // Test instance variables are correctly initialized
        // Note - these tests assumes the get methods are correct
        // REPLACE this comment with your code
    }

    /**
     * Test calculation of distance in miles.
     *
     *    <pre>NOTE:
     *    This tests a calculation that is improved
     *    but still approximate
     *    (the accuracy is to be within 10%)</pre>
     *
     */
    @Test
    public void testCalcDistance()
    {
        // create an instance of the Location class
        Location location1 = new Location(39.95, -82.1);

        Location location2 = new Location(0.0, 0.0);
        assertEquals(5800.86, location1.calcDistance(location2), .01);

        // test for Cleveland. OH
        Location cleveland = new Location(41.5, -81.6);
        assertEquals(110.25, location1.calcDistance(cleveland), .01);

        // test with Toledo, Ohio
        Location toledo = new Location(41.65, -83.55);
        assertEquals(139.82, location1.calcDistance(toledo), .01);

        // test Atlanta, GA
        Location atlanta = new Location(33.75, -84.38);
        assertEquals(446.52, location1.calcDistance(atlanta), .01);

        // test with Perth, AUSTRALIA
        Location perth = new Location(-31.95, 115.87);
        assertEquals(11293.52, location1.calcDistance(perth), .01);

        // test with Buenos Aires, BRAZIL
        Location buenosAires = new Location(-34.6, -58.35);
        assertEquals(5369.18, location1.calcDistance(buenosAires), .01);

        // PICK a location in central Ohio and create a test for it
        // REPLACE these comments with your code
    }

    /**
     * Test the toString method.
     *
     * <pre>Format of the string should be
     *      [latitude, longitude]
     * Example: [39.9571, 82.81] </pre>
     */
    @Test
    public void testToString()
    {
        Location location1 = new Location(39.95, -82.1);
        // obtain expected attributes of the Location
        double latitude = location1.getLatitude();
        double longitude = location1.getLongitude();

        // check for expected attributes, properly formatted
        assertEquals("[" + latitude + ", " + longitude + "]",
            location1.toString() );
    }

}

