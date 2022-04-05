/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.cj.jdbc.Blob;
import java.awt.Image;

/**
 *
 * @author danhh
 */
public class Vocabulary {
    private int ID;
    private String English;
    private String VietnameseString;
    private String image;
    private Blob photo;
    private int idtheme;
    public Vocabulary(){
        
    }

    public Vocabulary(int ID, String English, String VietnameseString, String image, Blob photo, int idtheme) {
        this.ID = ID;
        this.English = English;
        this.VietnameseString = VietnameseString;
        this.image = image;
        this.photo = photo;
        this.idtheme = idtheme;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String English) {
        this.English = English;
    }

    public String getVietnameseString() {
        return VietnameseString;
    }

    public void setVietnameseString(String VietnameseString) {
        this.VietnameseString = VietnameseString;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public int getIdtheme() {
        return idtheme;
    }

    public void setIdtheme(int idtheme) {
        this.idtheme = idtheme;
    }
    
    
}
