package web.model;

public class Publisher {
    private int publisherId;
    private String publisherName;

    public Publisher() {
    }

    public int publisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
