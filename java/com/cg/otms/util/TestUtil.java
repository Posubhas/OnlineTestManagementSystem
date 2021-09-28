package com.cg.otms.util;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.otms.dto.QuestionDetails;
import com.cg.otms.dto.TestDetails;
import com.cg.otms.entities.Question;
import com.cg.otms.entities.Test;

@Component
public class TestUtil {
	public TestDetails toDetails(Test test) {
		Set<Question> testQuestions = test.getTestQuestions();
		Set<QuestionDetails> details = new HashSet<>();
		// to prevent cyclic reference to student in course when json is created
		for (Question question : testQuestions) {
			details.add(new QuestionDetails());
		}
		return new TestDetails(test.getTestId(), test.getTestTitle(), test.getTestDuration(), test.getTestQuestions(),
				test.getStartTime(), test.getStartTime());
	}
}
