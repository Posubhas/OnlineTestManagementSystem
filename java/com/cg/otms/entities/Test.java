package com.cg.otms.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "test_hib1")

public class Test {
	@Id
	@GeneratedValue
	@Column(name = "Date_on")

	@Temporal(TemporalType.DATE)

	private Date subscribedOn;
	@Column(name = "Time_on")

	@Temporal(TemporalType.TIMESTAMP)

	private Date Time_On;
	private int testId;
	private String testTitle;
	private LocalTime testDuration;
	@OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
	private Set<Question> testQuestions;
	private BigDecimal testTotalMarks;
	private BigDecimal testMarksScored;
	// private Question currentQuestion;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", testTotalMarks=" + testTotalMarks + ", testMarksScored="
				+ testMarksScored + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	public Test(int testId, String testTitle, LocalTime testDuration, Set<Question> testQuestions,
			BigDecimal testTotalMarks, BigDecimal testMarksScored, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public LocalTime getTestDuration() {
		return testDuration;
	}

	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public BigDecimal getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(BigDecimal testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public BigDecimal getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(BigDecimal testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	// public int getQuestionId() {
	// TODO Auto-generated method stub
	// return 0;
	// }
	public void update(Test test) {
		this.testTitle = test.getTestTitle();
		this.testDuration = test.getTestDuration();
		this.testQuestions = test.getTestQuestions();
		this.testTotalMarks = test.getTestTotalMarks();
		this.testMarksScored = test.getTestMarksScored();
		this.startTime = test.getStartTime();
		this.endTime = test.getEndTime();

		// TODO Auto-generated method stub

	}

}
