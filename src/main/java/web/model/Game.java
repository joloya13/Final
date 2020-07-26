package web.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {

    private String name;
    private String rDate;
    private String genre;
    private String console;
    private String dev;
    private String pub;

    public Game(){

    }
    public Game(String name, String rDate, String genre, String console, String dev, String pub){
        this.name = name;
        this.console = console;
        this.dev = dev;
        this.rDate = rDate;
        this.genre = genre;
        this.pub = pub;
    }
    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format(
                "Game[name='%s', genre ='%s']", name, genre

        );
    }
}
