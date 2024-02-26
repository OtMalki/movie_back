package com.example.movie_back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Film implements Serializable {

    @Id
    private Long id;

    private String title;

    private Enum<Category> category;

    private String leadStudio;
    private int audienceScore;
    private float profitability;
    private int rottenTomatoes;
    private double worldWideGross;

    public Film(Long id, String title, Enum<Category> category, String leadStudio, int audienceScore, float profitability, int rottenTomatoes, double worldWideGross) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.leadStudio = leadStudio;
        this.audienceScore = audienceScore;
        this.profitability = profitability;
        this.rottenTomatoes = rottenTomatoes;
        this.worldWideGross = worldWideGross;
    }

    public Film(Long id) {
        this.id = id;
    }

    public Film() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum<Category> getCategory() {
        return category;
    }

    public void setCategory(Enum<Category> category) {
        this.category = category;
    }

    public String getLeadStudio() {
        return leadStudio;
    }

    public void setLeadStudio(String leadStudio) {
        this.leadStudio = leadStudio;
    }

    public int getAudienceScore() {
        return audienceScore;
    }

    public void setAudienceScore(int audienceScore) {
        this.audienceScore = audienceScore;
    }

    public float getProfitability() {
        return profitability;
    }

    public void setProfitability(float profitability) {
        this.profitability = profitability;
    }

    public int getRottenTomatoes() {
        return rottenTomatoes;
    }

    public void setRottenTomatoes(int rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public double getWorldWideGross() {
        return worldWideGross;
    }

    public void setWorldWideGross(double worldWideGross) {
        this.worldWideGross = worldWideGross;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
