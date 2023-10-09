package com.scaler.productcatalogserviceproject.models;

import jakarta.persistence.Entity;

@Entity
public class Price extends BaseModel{

    private String currency;
    private double price;
    private  int dataRandom;
}
