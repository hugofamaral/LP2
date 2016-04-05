package edu.ufp.inf.Lp2_Project;

public class Coordenada {

    private long lat;

    private long lon;

    public Coordenada(long lat, long lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public long getLat() {
        return lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

}
