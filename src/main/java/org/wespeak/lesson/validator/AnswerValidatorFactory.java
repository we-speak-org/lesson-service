package org.wespeak.lesson.validator;

import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.wespeak.lesson.entity.Exercise;

@Component
@RequiredArgsConstructor
public class AnswerValidatorFactory {

  private final List<AnswerValidator> validators;

  public ValidationResult validate(
      Exercise.ExerciseType type,
      Map<String, Object> userAnswer,
      Map<String, Object> correctAnswer) {
    return validators.stream()
        .filter(v -> v.supports(type))
        .findFirst()
        .map(v -> v.validate(userAnswer, correctAnswer))
        .orElseThrow(() -> new IllegalArgumentException("No validator found for type: " + type));
  }
}
