package com.cg.otms.entities;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Question {
	@Id
	@GeneratedValue
	private int questionId;
	@OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
	private QuestionOptions questionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private BigDecimal questionMarks;
	private int chosenAnswer;
	private BigDecimal marksScored;
	@OneToOne
	@JoinColumn(name="test_h2")
    private Test test;
    public Question() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Question(int questionId, QuestionOptions questionOptions, String questionTitle, Integer questionAnswer,
		 BigDecimal questionMarks, int chosenAnswer, BigDecimal marksScored, Test test) {
	super();
	this.questionId = questionId;
	this.questionOptions = questionOptions;
	this.questionTitle = questionTitle;
	this.questionAnswer = questionAnswer;
	this.questionMarks = questionMarks;
	this.chosenAnswer = chosenAnswer;
	this.marksScored = marksScored;
	this.test = test;
}
@Override
public String toString() {
	return "Question [questionId=" + questionId + ", questionOptions=" + questionOptions + ", questionTitle="
			+ questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks=" + questionMarks
			+ ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + ", test=" + test + "]";
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public QuestionOptions getQuestionOptions() {
	return questionOptions;
}
public void setQuestionOptions(QuestionOptions questionOptions) {
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
public int getChosenAnswer() {
	return chosenAnswer;
}
public void setChosenAnswer(int chosenAnswer) {
	this.chosenAnswer = chosenAnswer;
}
public BigDecimal getMarksScored() {
	return marksScored;
}
public void setMarksScored(BigDecimal marksScored) {
	this.marksScored = marksScored;
}
public Test getTest() {
	return test;
}
public void setTest(Test test) {
	this.test = test;
}
	

}