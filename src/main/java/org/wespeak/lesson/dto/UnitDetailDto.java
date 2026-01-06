package org.wespeak.lesson.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Detailed unit response with lessons. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitDetailDto {
  private String id;
  private String title;
  private String description;
  private String courseId;
  private List<LessonSummaryDto> lessons;
}
