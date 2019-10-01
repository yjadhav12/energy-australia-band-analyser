package io.swagger.client.model;

import java.util.Set;

public class BandWithFest {
    private String name;
    private Set<String> musicFestivals;

    public String getName() {
        return name!=null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getMusicFestivals() {
        return musicFestivals;
    }

    public void setMusicFestivals(Set<String> musicFestivals) {
        this.musicFestivals = musicFestivals;
    }
}
