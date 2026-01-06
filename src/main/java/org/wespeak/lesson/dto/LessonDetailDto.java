package org.wespeak.lesson.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.wespeak.lesson.entity.Lesson;

/** Detailed lesson response with exercises. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonDetailDto {
  private String id;
  private String title;
  private String description;
  private Lesson.LessonType type;
  private Integer estimatedMinutes;
  private Integer xpReward;
  private UnitRefDto unit;
  private List<ExerciseDto> exercises;
  private Boolean isUnlocked;
  private UserProgressStateDto userProgress;
}
