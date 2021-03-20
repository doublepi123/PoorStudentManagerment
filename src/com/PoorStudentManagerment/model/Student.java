package com.PoorStudentManagerment.model;

public class Student {
    private String name;
    private String ID;
    private int age;
    private int homePeople;
    private double homeIncome;
    private int numberOfSiblings;
    private int numberOfElderly;
    private double costForFood;
    private double costForOther;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        homeIncome = 0;
        homePeople = 0;
        numberOfElderly = 0;
        numberOfSiblings = 0;
        costForFood = 0;
        costForOther = 0;
    }

    public int getHomePeople() {
        return homePeople;
    }

    public void setHomePeople(int homePeople) {
        this.homePeople = homePeople;
    }

    public double getHomeIncome() {
        return homeIncome;
    }

    public void setHomeIncome(double homeIncome) {
        this.homeIncome = homeIncome;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    public int getNumberOfElderly() {
        return numberOfElderly;
    }

    public void setNumberOfElderly(int numberOfElderly) {
        this.numberOfElderly = numberOfElderly;
    }

    public double getCostForFood() {
        return costForFood;
    }

    public void setCostForFood(double costForFood) {
        this.costForFood = costForFood;
    }

    public double getCostForOther() {
        return costForOther;
    }

    public void setCostForOther(double costForOther) {
        this.costForOther = costForOther;
    }

    public Student(String name, String ID, int age, int homePeople, double homeIncome, int numberOfSiblings, int numberOfElderly, double costForFood, double costForOther) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.homePeople = homePeople;
        this.homeIncome = homeIncome;
        this.numberOfSiblings = numberOfSiblings;
        this.numberOfElderly = numberOfElderly;
        this.costForFood = costForFood;
        this.costForOther = costForOther;
    }
}
