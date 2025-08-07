package com.simple.hospital_management.model;

public class Ward {
    private int id;
    private String type;
    private int totalBed;
    private int occupiedBed;
    private int emptyBed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalBed() {
        return totalBed;
    }

    public void setTotalBed(int totalBed) {
        this.totalBed = totalBed;
    }

    public int getOccupiedBed() {
        return occupiedBed;
    }

    public void setOccupiedBed(int occupiedBed) {
        this.occupiedBed = occupiedBed;
    }

    public int getEmptyBed() {
        return emptyBed;
    }

    public void setEmptyBed(int emptyBed) {
        this.emptyBed = emptyBed;
    }
}
