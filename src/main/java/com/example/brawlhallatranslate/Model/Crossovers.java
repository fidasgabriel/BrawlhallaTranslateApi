package com.example.brawlhallatranslate.Model;

public class Crossovers {
    String name;
    String urlPic;
    String legendName;

    public Crossovers(String name, String legendName,  String urlPic) {
        this.name = name;
        this.urlPic = urlPic;
        this.legendName = legendName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlPic() {
        return urlPic;
    }

    public void setUrlPic(String urlPic) {
        this.urlPic = urlPic;
    }

    public String getLegendName() {
        return legendName;
    }

    public void setLegendName(String legendName) {
        this.legendName = legendName;
    }
}
