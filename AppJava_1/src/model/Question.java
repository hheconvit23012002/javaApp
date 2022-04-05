/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author danhh
 */
public class Question {
    private int ID;
    private String QuestionString;
    private String AnswerA;
    private String AnswerB;
    private String AnswerC;
    private String AnswerD;
    private String AnswerExactlyString;
    private int IdThemeQuestion;

    public Question() {
    }

    public Question(int ID, String QuestionString, String AnswerA, String AnswerB, String AnswerC, String AnswerD, String AnswerExactlyString, int IdThemeQuestion) {
        this.ID = ID;
        this.QuestionString = QuestionString;
        this.AnswerA = AnswerA;
        this.AnswerB = AnswerB;
        this.AnswerC = AnswerC;
        this.AnswerD = AnswerD;
        this.AnswerExactlyString = AnswerExactlyString;
        this.IdThemeQuestion = IdThemeQuestion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuestionString() {
        return QuestionString;
    }

    public void setQuestionString(String QuestionString) {
        this.QuestionString = QuestionString;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String AnswerA) {
        this.AnswerA = AnswerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String AnswerB) {
        this.AnswerB = AnswerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String AnswerC) {
        this.AnswerC = AnswerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public void setAnswerD(String AnswerD) {
        this.AnswerD = AnswerD;
    }

    public String getAnswerExactlyString() {
        return AnswerExactlyString;
    }

    public void setAnswerExactlyString(String AnswerExactlyString) {
        this.AnswerExactlyString = AnswerExactlyString;
    }

    public int getIdThemeQuestion() {
        return IdThemeQuestion;
    }

    public void setIdThemeQuestion(int IdThemeQuestion) {
        this.IdThemeQuestion = IdThemeQuestion;
    }
    
}
