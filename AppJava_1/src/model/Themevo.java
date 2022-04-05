/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhh
 */
public class Themevo {
    private int ID;
    private String NameThemeVocabulary;

    public Themevo() {
    }

    public Themevo(int ID, String NameThemeVocabulary) {
        this.ID = ID;
        this.NameThemeVocabulary = NameThemeVocabulary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameThemeVocabulary() {
        return NameThemeVocabulary;
    }

    public void setNameThemeVocabulary(String NameThemeVocabulary) {
        this.NameThemeVocabulary = NameThemeVocabulary;
    }
    
}
