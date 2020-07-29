package web.model;

/************************************************************************************
 * @file Console.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class handles Console objects out of the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class Console {
    private String consoleName;
    private String distributorName;

    /**
     * Constructor
     */

    public Console() {
    } // Console

    /**
     * Getter for finding the console name.
     *
     * @return consoleName The name of the console object
     */

    public String getConsoleName() {
        return consoleName;
    } // getConsoleName

    /**
     * Setter for the console name.
     *
     * @param consoleName The name of the console
     */

    public void setConsoleName(String consoleName) {
        this.consoleName = consoleName;
    } // setConsoleName

    /**
     * Getter for finding the distributor name.
     *
     * @return distributorName The name of the distributor.
     */

    public String getDistributorName() {
        return distributorName;
    }

    /**
     * Setter for the distributor name.
     *
     * @param distributorName The name of the distributor
     */

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    } // setDistributorName
} // Console
