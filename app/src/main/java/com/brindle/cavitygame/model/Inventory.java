package com.brindle.cavitygame.model;

public class Inventory {

    private boolean mPendant;
    private boolean mKeycard;

    public Inventory() {
        mPendant = false;
        mKeycard = false;
    }

    public boolean hasKeycard() {
        return mKeycard;
    }

    public void setKeycard(boolean keycard) {
        mKeycard = keycard;
    }

    public boolean hasPendant() {

        return mPendant;
    }

    public void setPendant(boolean pendant) {
        mPendant = pendant;
    }
}
