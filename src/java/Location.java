/**
 * Models a Location.
 * 
 * @author Doyt Perry/<insert your name here>.
 * @version Winter 2019.
 */
public class Location
{
    // instance variables 
    private double latitude;
    private double longitude;

    
    //constants
    
    /**
     * Approximate radius of earth in miles.
     */    
    public static final double EARTH_RADIUS = 3959.0;
    
    
    /**
     * Constructor for objects of class Location.
     * 
     * @param  inLatitude       double  distance in degrees from equator.
     * @param  inLongitude      double  distance in degrees from 
     *                                  prime meridian.
     */
    public  Location(double inLatitude, double inLongitude)
    {
        // initialize instance variables
        // using values passed in as parameters
    }

    /**
     * Returns the latitude of the location.
     * 
     * @return double  distance from equator in degrees.
     */
    public double getLatitude()
    {
        return this.latitude;
    }
    
    /**
     * Returns the longitude of the location.
     * 
     * @return double  distance from prime meridian in degrees.
     */
    public double getLongitude()
    {
        // replace this comment & return statement with your code 
        return -1.0;
    }

    /**
     * Calculates approximate distance between the this location
     *    and the parameter value location.
     *    
     *    <pre>NOTE: 
     *    The calculation here is more accurate than
     *    that used in the previous version (within
     *    10% accuracy)</pre>
     * 
     * @param  inLocation Location  input Location.
     * @return double  distance in miles
     */
    public double calcDistance(Location inLocation)
    {
        // NOTE: be sure to update your calculation of distance
        // NOTE: consistent with the write up of Lab 2
        // replace this & NOTE comments with your code    
        
        // convert the latitude & longitude of this Location to radians
        // HINT: declare local variables to hold equivalent radians
        // HINT: use appropriate method of the MATH class
        // replace this & HINT comments with your code        

        // convert the latitude & longitude of parameter Location to radians
        // HINT: declare local variables to hold equivalent radians
        // HINT: use appropriate method of the MATH class
        // replace this & HINT comments with your code        
        
        // calculate the distance and return
        // HINT: use appropriate methods of the MATH class
        // HINT: used the defined 'final constant" for earth's radius
        // replace this & HINT comments & return statement with your code 
        return -1.0;
    }

    /**
     * Returns Location information in specifed format.
     * 
     * <pre>Format of the string should be
     *      [latitude, longitude]
     * Example:[39.9571, 82.81]</pre>
     *   
     * @return String  formatted with Location info
     */
    public String toString()
    {
        return "[" + this.latitude + ", " + this.longitude + "]";
    }
}

