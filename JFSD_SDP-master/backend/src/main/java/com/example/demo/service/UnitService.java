package com.example.demo.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UnitService {
    private static final Map<String, String> DEFAULT_UNITS = new HashMap<>();

    static {
        DEFAULT_UNITS.put("Leafy Vegetables", "bunches");
        DEFAULT_UNITS.put("Fruits", "kg");
        DEFAULT_UNITS.put("Millets", "kg");
        DEFAULT_UNITS.put("Vegetables", "kg");
        DEFAULT_UNITS.put("Nuts", "grams");
        DEFAULT_UNITS.put("Pulses", "kg");
        
    }

    public String getDefaultUnit(String category) {
    	System.out.println("Category: " + category + ", Default Unit: " + DEFAULT_UNITS.get(category));
        return DEFAULT_UNITS.getOrDefault(category, "kg");
    }
}

