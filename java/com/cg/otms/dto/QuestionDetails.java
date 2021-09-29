package com.cg.otms.dto;

import com.cg.otms.entities.QuestionOptions;

public class QuestionDetails {
	private int questionId;
	private QuestionOptions questionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private int chosenAnswer;

	public QuestionDetails() {
		super();
	}

	public QuestionDetails(int questionId, QuestionOptions questionOptions, String questionTitle,
			Integer questionAnswer, int chosenAnswer) {
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.chosenAnswer = chosenAnswer;
	}

	@Override
	public String toString() {
		return "QuestionDetails [questionId=" + questionId + ", questionOptions=" + questionOptions + ", questionTitle="
				+ questionTitle + ", questionAnswer=" + questionAnswer + ", chosenAnswer=" + chosenAnswer + "]";
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

	public int getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
}
