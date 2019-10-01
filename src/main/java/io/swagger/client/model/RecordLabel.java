package io.swagger.client.model;

import java.util.List;

public class RecordLabel {
    private String name;
    private List<BandWithFest> bandWithFests;

    public String getName() {
        return name!=null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BandWithFest> getBandWithFests() {
        return bandWithFests;
    }

    public void setBandWithFests(List<BandWithFest> bandWithFests) {
        this.bandWithFests = bandWithFests;
    }
}
