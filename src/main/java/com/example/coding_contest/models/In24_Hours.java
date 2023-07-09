package com.example.coding_contest.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum In24_Hours {
    NO, YES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NO: return "No";
            case YES: return "Yes";
        }
        return null;
    }

    @JsonCreator
    public static In24_Hours forValue(String value) throws IOException {
        if (value.equals("No")) return NO;
        if (value.equals("Yes")) return YES;
        throw new IOException("Cannot deserialize In24_Hours");
    }
}