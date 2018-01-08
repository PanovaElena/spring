package com.netcracker;

import org.springframework.beans.factory.annotation.Autowired;

public class Musician {

    @Autowired
    private Instrument instrument;

    public Musician() {
    }

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "instrument=" + instrument +
                '}';
    }

    public void play(){
        instrument.sound();
    }
}
