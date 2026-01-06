package org.wespeak.lesson.validator;

import java.util.Map;
import org.wespeak.lesson.entity.Exercise;

public interface AnswerValidator {
  boolean supports(Exercise.ExerciseType type);

  ValidationResult validate(Map<String, Object> userAnswer, Map<String, Object> correctAnswer);
}
