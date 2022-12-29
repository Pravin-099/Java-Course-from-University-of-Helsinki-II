/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Literacy implements Comparable<Literacy>{
    private String theme;
    private String ageGroup;
    private String country;
    private int year;
    private String gender;
    private double literacyPercent;
    
    public Literacy(String theme, String ageGroup,String country, int year, String gender, double literacyPercent){
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.country = country;
        this.year = year;
        this.gender = gender.trim();
        this.literacyPercent = literacyPercent;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        
        return country +" ("+year+"), "+gender+", "+literacyPercent;
    }
    
    @Override
    public int compareTo(Literacy compare){
        
        
        if (this.literacyPercent == compare.getLiteracyPercent()) {
            return 0;
        } else if (this.literacyPercent > compare.getLiteracyPercent()) {
            return 1;
        } else {
            return -1;
        }
    }
}
