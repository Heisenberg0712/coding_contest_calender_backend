package com.example.coding_contest.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Status {
    BEFORE, CODING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEFORE: return "BEFORE";
            case CODING: return "CODING";
        }
        return null;
    }

    @JsonCreator
    public static Status forValue(String value) throws IOException {
        if (value.equals("BEFORE")) return BEFORE;
        if (value.equals("CODING")) return CODING;
        throw new IOException("Cannot deserialize Status");
    }
}
