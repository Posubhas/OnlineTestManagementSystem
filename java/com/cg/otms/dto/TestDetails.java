package com.cg.otms.dto;

import java.util.Date;
import java.util.Set;

import com.cg.otms.entities.Question;

public class TestDetails {
	private int testId;
	private String testTitle;
	private double testDuration;
	private Set<Question> testQuestions;
	private Date startTime;
	private Date endTime;

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

	@Override
	public String toString() {
		return "TestDetails [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	public TestDetails(int testId, String testTitle, double testDuration, Set<Question> testQuestions, Date startTime,
			Date endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public TestDetails() {
		super();
	}
}
