package com.andrewelmasry.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Andrew on 2/4/16.
 * this is my controller
 */
public class Crime {

    private UUID id;
    private String title;
    private Date date;
    private boolean solved;


    public  Crime () {
        id = UUID.randomUUID();
        date = new Date();
    }

    public UUID getId () {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved=solved;
    }

}
