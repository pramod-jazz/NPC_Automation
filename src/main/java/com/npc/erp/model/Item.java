package com.npc.erp.model;

import java.sql.Date;

public class Item {

    private Integer id;

    private String description;

    private String name;

    private String grade;

    private String  materialGrade;

    private String status;

    private Date entryDate;

    private Date updatedOnDate;

    private Integer quantity;

    private Float size;

    private String additionalRequirement;

    private Float weight;

    private Integer patternDrawingNumber;

    private PatternAvailabilityStatus patternAvailabilityStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMaterialGrade() {
        return materialGrade;
    }

    public void setMaterialGrade(String materialGrade) {
        this.materialGrade = materialGrade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getUpdatedOnDate() {
        return updatedOnDate;
    }

    public void setUpdatedOnDate(Date updatedOnDate) {
        this.updatedOnDate = updatedOnDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public String getAdditionalRequirement() {
        return additionalRequirement;
    }

    public void setAdditionalRequirement(String additionalRequirement) {
        this.additionalRequirement = additionalRequirement;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getPatternDrawingNumber() {
        return patternDrawingNumber;
    }

    public void setPatternDrawingNumber(Integer patternDrawingNumber) {
        this.patternDrawingNumber = patternDrawingNumber;
    }

    public PatternAvailabilityStatus getPatternAvailabilityStatus() {
        return patternAvailabilityStatus;
    }

    public void setPatternAvailabilityStatus(PatternAvailabilityStatus patternAvailabilityStatus) {
        this.patternAvailabilityStatus = patternAvailabilityStatus;
    }
}
