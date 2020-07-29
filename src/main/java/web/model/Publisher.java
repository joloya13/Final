package web.model;

/************************************************************************************
 * @file Publisher.java
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

/************************************************************************************
 * This class handles the publisher object outside of the database.
 *
 * @author Snazzy Jazzy Coders
 * @author Jonathan Oloya
 */

public class Publisher {
    private int publisherId;
    private String publisherName;

    /**
     * default constructor
     */

    public Publisher() {
    }// Publisher

    /**
     * Getter method for returning the publisher id.
     *
     * @return publisherId The publisher's unique Id.
     */

    public int publisherId() {
        return publisherId;
    } // publisherId

    /**
     * Setter method for the publisher
     *
     * @param publisherId The unique id for the publisher.
     */

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    } // setPublisherId

    /**
     * Getter method for returning the publisher's name
     *
     * @return publisherName
     */

    public String getName() {
        return publisherName;
    } // getName

    /**
     * Setter method for the publisherName
     *
     * @param publisherName The name of the publisher
     */

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    } // setPublisherName
} //Publisher
