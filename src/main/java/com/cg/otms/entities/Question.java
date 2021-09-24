package com.cg.otms.entities;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.mapping.Array;

@Entity

public class Question {
	@Id
	@GeneratedValue
private int questionId;
private Array questionOptions;
private String questionTitle;
private Integer questionAnswer;
private BigDecimal questionMarks;
private Integer chosenAnswer;
private BigDecimal marksScored;
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int questionId, Array questionOptions, String questionTitle, Integer questionAnswer,
		BigDecimal questionMarks, Integer chosenAnswer, BigDecimal marksScored) {
	super();
	this.questionId = questionId;
	this.questionOptions = questionOptions;
	this.questionTitle = questionTitle;
	this.questionAnswer = questionAnswer;
	this.questionMarks = questionMarks;
	this.chosenAnswer = chosenAnswer;
	this.marksScored = marksScored;
}
@Override
public String toString() {
	return "Question [questionId=" + questionId + ", questionOptions=" + questionOptions + ", questionTitle="
			+ questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks=" + questionMarks
			+ ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + "]";
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public Array getQuestionOptions() {
	return questionOptions;
}
public void setQuestionOptions(Array questionOptions) {
	this.questionOptions = questionOptions;
}
public String getQuestionTitle() {
	return questionTitle;
}
public void setQuestionTitle(String questionTitle) {
	this.questionTitle = questionTitle;
}
public Integer getQuestionAnswer() {
	return questionAnswer;
}
public void setQuestionAnswer(Integer questionAnswer) {
	this.questionAnswer = questionAnswer;
}
public BigDecimal getQuestionMarks() {
	return questionMarks;
}
public void setQuestionMarks(BigDecimal questionMarks) {
	this.questionMarks = questionMarks;
}
public Integer getChosenAnswer() {
	return chosenAnswer;
}
public void setChosenAnswer(Integer chosenAnswer) {
	this.chosenAnswer = chosenAnswer;
}
public BigDecimal getMarksScored() {
	return marksScored;
}
public void setMarksScored(BigDecimal marksScored) {
	this.marksScored = marksScored;
}

}

