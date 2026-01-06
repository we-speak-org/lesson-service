package org.wespeak.lesson.dto;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Response when starting a lesson. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonSessionDto {
  private String sessionId;
  private String lessonId;
  private Instant startedAt;
  private Integer exerciseCount;
}
