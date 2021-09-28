package com.cg.otms.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "test_hib1")

public class Test {
	@Id
	@GeneratedValue
	private int testId;
	private String testTitle;
	private double testDuration;
	@OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
	private Set<Question> testQuestions;
	private BigDecimal testTotalMarks;
	private BigDecimal testMarksScored;
	@Column(name = "Start_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	@Column(name = "end_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;

	public Test() {
		super();
	}

	public Test(int testId, String testTitle, double testDuration, Set<Question> testQuestions,
			BigDecimal testTotalMarks, BigDecimal testMarksScored, Date startTime, Date endTime) {
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

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", testTotalMarks=" + testTotalMarks + ", testMarksScored="
				+ testMarksScored + ", startTime=" + startTime + ", endTime=" + endTime + "]";
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

	public double getTestDuration() {
		return testDuration;
	}

	public void setTestDuration(double testDuration) {
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void update(Test test) {
		this.testTitle = test.getTestTitle();
		this.testDuration = test.getTestDuration();
		this.testQuestions = test.getTestQuestions();
		this.testTotalMarks = test.getTestTotalMarks();
		this.testMarksScored = test.getTestMarksScored();
		this.startTime = test.getStartTime();
		this.endTime = test.getEndTime();

	}

}
