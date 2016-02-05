package com.andrewelmasry.criminalintent;

import java.util.UUID;

/**
 * Created by Andrew on 2/4/16.
 * this is my controller
 */
public class Crime {

    private UUID id;
    private String title;

    public  Crime () {
        id = UUID.randomUUID();
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

}
