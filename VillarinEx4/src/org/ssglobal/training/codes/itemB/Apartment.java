package org.ssglobal.training.codes.itemB;

public record Apartment(int size, String address, String... names) {
    public int getHeadCount() {
        return names.length;
    }

    public String getLocation() {
        String owner = names[0];
        return address + " " + "owned by " + owner;
    }
}
