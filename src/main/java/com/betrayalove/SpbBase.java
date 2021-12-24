package com.betrayalove;

public class SpbBase {
    private final String number;
    private final String address;
    private final String snapshot;
    private final String appellation;
    private final String numberFloor;
    private final String prefixCode;
    private final String yearConstruction;

    public SpbBase(String number, String address, String snapshot, String numberFloor, String appellation, String prefixCode, String yearConstruction) {
        this.number = number;
        this.address = address;
        this.snapshot = snapshot;
        this.numberFloor = numberFloor;
        this.appellation = appellation;
        this.prefixCode = prefixCode;
        this.yearConstruction = yearConstruction;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public String getAppellation() {
        return appellation;
    }

    public String getPrefixCode() {
        return prefixCode;
    }

    public String getYearConstruction() {
        return yearConstruction;
    }

    @Override
    public String toString() {
        return "SpbBase{" +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", snapshot='" + snapshot + '\'' +
                ", numberFloor='" + numberFloor + '\'' +
                ", appellation='" + appellation + '\'' +
                ", prefixCode='" + prefixCode + '\'' +
                ", yearConstruction='" + yearConstruction + '\'' +
                '}';
    }
}
