package com.company.stream;

import java.util.UUID;

public class Geometry3G {
    long osmId;
    UUID featId;

    public long getOsmId() {
        return osmId;
    }

    public void setOsmId(long osmId) {
        this.osmId = osmId;
    }

    public UUID getFeatId() {
        return featId;
    }

    public void setFeatId(UUID featId) {
        this.featId = featId;
    }
}
