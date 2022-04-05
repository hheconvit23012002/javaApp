/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhh
 */
public class ThemeQuestion {
    private int ID;
    private String NameThemeQuestion;

    public ThemeQuestion() {
    }

    public ThemeQuestion(int ID, String NameThemeQuestion) {
        this.ID = ID;
        this.NameThemeQuestion = NameThemeQuestion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameThemeQuestion() {
        return NameThemeQuestion;
    }

    public void setNameThemeQuestion(String NameThemeQuestion) {
        this.NameThemeQuestion = NameThemeQuestion;
    }
    
}
