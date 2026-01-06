package org.wespeak.lesson.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Response DTO for listing courses. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoursesResponse {
  private List<CourseDto> courses;
}
