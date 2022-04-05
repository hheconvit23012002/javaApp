/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mysql.cj.xdevapi.Statement;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.interfaces.RSAKey;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Question;
import model.ThemeQuestion;
import model.Themevo;
import model.User;
import model.Vocabulary;

/**
 *
 * @author danhh
 */
public class UserDAO extends DAO {

    public UserDAO() {
        super();
    }

    public Boolean checkLogin(User u) {
        boolean result = false;
        String sql = "SELECT  ID, Fullname,Email,Age,type FROM student WHERE username = ? AND pass = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getPassWord());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setID(rs.getInt("ID"));
                u.setFullName(rs.getString("Fullname"));
                u.setEmail(rs.getString("Email"));
                u.setAge(rs.getInt("Age"));
                u.setType(rs.getInt("type"));
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public Boolean CheckRegister(User u){
        boolean result =false;
        String sql = "INSERT INTO student(Fullname,Email,Age,username,pass,type) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getFullName());
            ps.setString(2, u.getEmail());
            ps.setInt(3, u.getAge());
            ps.setString(4, u.getUserName());
            ps.setString(5, u.getPassWord());
            ps.setInt(6, 0);
            int rs = ps.executeUpdate();
            if(rs==1){
                result =true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public Boolean CheckEdit(User u){
        System.out.println(u.getID());
        String sql = "UPDATE student SET Fullname=?, Email=?, Age=? WHERE ID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getFullName());
            ps.setString(2, u.getEmail());
            ps.setInt(3, u.getAge());
            ps.setInt(4, u.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public Boolean CheckChangePass(User u){
        System.out.println(u.getID());
        String sql = "UPDATE student SET pass=? WHERE ID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getPassWord());
            ps.setInt(2, u.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public Boolean checkAddVocabulary(Vocabulary v){
        boolean result =false;
        String sql = "INSERT INTO vocabulary(English,Vietnamese,idtheme) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getEnglish());
            ps.setString(2, v.getVietnameseString());
            ps.setInt(3, v.getIdtheme());
            int rs = ps.executeUpdate();
            if(rs==1){
                result =true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<Themevo> ShowThemeVocabulary(){
        ArrayList<Themevo> list = new ArrayList<Themevo>();
        String sql = "SELECT ID,Nametheme FROM themevocabulary";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Themevo t = new Themevo();
                t.setID(rs.getInt("ID"));
                t.setNameThemeVocabulary(rs.getString("Nametheme"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Vocabulary> SelectVocabulary(int IdKey){
        ArrayList<Vocabulary> list = new ArrayList<Vocabulary>();
        String sql = "SELECT ID,English,Vietnamese FROM vocabulary WHERE idtheme = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdKey);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vocabulary vo = new Vocabulary();
                vo.setID(rs.getInt("ID"));
                vo.setEnglish(rs.getString("English"));
                vo.setVietnameseString(rs.getString("Vietnamese"));
                list.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public Boolean checkAddThemeVocabulary(Themevo v){
        boolean result =false;
        String sql = "INSERT INTO themevocabulary(Nametheme) VALUES (?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getNameThemeVocabulary());
            int rs = ps.executeUpdate();
            if(rs==1){
                result =true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public User UpdatedataBacktoHome(int keyID){
        User u = new User();
        String sql = "SELECT  ID,Fullname,Email,Age,username,pass FROM student WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, keyID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setID(rs.getInt("ID"));
                u.setFullName(rs.getString("Fullname"));
                u.setEmail(rs.getString("Email"));
                u.setAge(rs.getInt("Age"));
                u.setUserName(rs.getString("username"));
                u.setPassWord(rs.getString("pass"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    public ArrayList<ThemeQuestion> ShowThemeQuestion(){
        ArrayList<ThemeQuestion> list = new ArrayList<ThemeQuestion>();
        String sql = "SELECT ID,namethemequestion FROM themequestion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThemeQuestion t = new ThemeQuestion();
                t.setID(rs.getInt("ID"));
                t.setNameThemeQuestion(rs.getString("namethemequestion"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public Boolean checkAddThemeQuestion(ThemeQuestion v){
        boolean result =false;
        String sql = "INSERT INTO themequestion(namethemequestion) VALUES (?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getNameThemeQuestion());
            int rs = ps.executeUpdate();
            if(rs==1){
                result =true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public Boolean checkAddQuestion(Question v){
        boolean result =false;
        String sql = "INSERT INTO question(questionstring,answerA,answerB,answerC,answerD,answerExactly,idthemequestion) VALUES (?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, v.getQuestionString());
            ps.setString(2, v.getAnswerA());
            ps.setString(3, v.getAnswerB());
            ps.setString(4, v.getAnswerC());
            ps.setString(5, v.getAnswerD());
            ps.setString(6, v.getAnswerExactlyString());
            ps.setInt(7, v.getIdThemeQuestion());
            int rs = ps.executeUpdate();
            if(rs==1){
                result =true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<Question> SelectQuestion(int IdKey){
        ArrayList<Question> list = new ArrayList<Question>();
        String sql = "SELECT ID,questionstring,answerA,answerB,answerC,answerD,answerExactly FROM question WHERE idthemequestion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdKey);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Question vo = new Question();
                vo.setID(rs.getInt("ID"));
                vo.setQuestionString(rs.getString("questionstring"));
                vo.setAnswerA(rs.getString("answerA"));
                vo.setAnswerB(rs.getString("answerB"));
                vo.setAnswerC(rs.getString("answerC"));
                vo.setAnswerD(rs.getString("answerD"));
                vo.setAnswerExactlyString(rs.getString("answerExactly"));
                list.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
