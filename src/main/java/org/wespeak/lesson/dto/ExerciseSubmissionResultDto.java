package org.wespeak.lesson.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Result of submitting an answer. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseSubmissionResultDto {
  private Boolean isCorrect;
  private Integer pointsEarned;
  private Map<String, Object> correctAnswer;
  private String feedback;
  private Integer attemptNumber;
}
