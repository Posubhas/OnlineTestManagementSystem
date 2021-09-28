package com.cg.otms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class QuestionOptions {
	@Id
	private int questionoptionId;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
<<<<<<< HEAD
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "options")
	private Question question;

=======
	@ManyToOne
	@JoinColumn(name="options")
    private Question question;
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
	public QuestionOptions() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuestionOptions [option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4="
				+ option4 + ", question=" + question + "]";
	}
	public QuestionOptions(String option1, String option2, String option3, String option4, Question question) {
		super();
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}

	
}
