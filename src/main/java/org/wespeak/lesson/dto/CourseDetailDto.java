package org.wespeak.lesson.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Detailed course response with units. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetailDto {
  private String id;
  private String title;
  private String level;
  private String description;
  private String imageUrl;
  private Integer estimatedHours;
  private List<UnitSummaryDto> units;
}
