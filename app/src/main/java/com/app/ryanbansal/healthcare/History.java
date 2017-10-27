package com.app.ryanbansal.healthcare;

/**
 * Created by RyanBansal on 10/27/17.
 */

class History {

    String name;

    public History(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    String date;
}
