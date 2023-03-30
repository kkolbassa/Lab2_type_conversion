package org.example;

public class Reactor {
    private String name;
    private String classReactor;
    private int burnup;
    private double kpd;
    private double enrichment;
    private int thermal_capacity;
    private int electrical_capacity;
    private int life_time;
    private int first_load;
    private String source;

    public Reactor(String name, String classReactor, int burnup, double kpd, double enrichment, int thermal_capacity, int electrical_capacity, int life_time, int first_load, String source) {
        this.name = name;
        this.classReactor = classReactor;
        this.burnup = burnup;
        this.kpd = kpd;
        this.enrichment = enrichment;
        this.thermal_capacity = thermal_capacity;
        this.electrical_capacity = electrical_capacity;
        this.life_time = life_time;
        this.first_load = first_load;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassReactor() {
        return classReactor;
    }

    public void setClassReactor(String classReactor) {
        this.classReactor = classReactor;
    }

    public int getBurnup() {
        return burnup;
    }

    public void setBurnup(int burnup) {
        this.burnup = burnup;
    }

    public double getKpd() {
        return kpd;
    }

    public void setKpd(double kpd) {
        this.kpd = kpd;
    }

    public double getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(double enrichment) {
        this.enrichment = enrichment;
    }

    public int getThermal_capacity() {
        return thermal_capacity;
    }

    public void setThermal_capacity(int thermal_capacity) {
        this.thermal_capacity = thermal_capacity;
    }

    public int getElectrical_capacity() {
        return electrical_capacity;
    }

    public void setElectrical_capacity(int electrical_capacity) {
        this.electrical_capacity = electrical_capacity;
    }

    public int getLife_time() {
        return life_time;
    }

    public void setLife_time(int life_time) {
        this.life_time = life_time;
    }

    public int getFirst_load() {
        return first_load;
    }

    public void setFirst_load(int first_load) {
        this.first_load = first_load;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
