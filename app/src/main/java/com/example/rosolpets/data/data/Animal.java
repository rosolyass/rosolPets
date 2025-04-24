package com.example.rosolpets.data.data;

public class Animal {
    protected String id;
    protected int bornYear ;
    protected String kind;
    protected String suitableFood;
    public Animal (String id , int bornYear , String kind , String suitableFood){
        this.id = id;
        this.bornYear = bornYear;
        this.kind = kind;
        this.suitableFood = suitableFood;
    }

}
