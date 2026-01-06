package org.wespeak.lesson.dto;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** History of completed lessons. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProgressHistoryDto {
  private List<CompletionHistoryItem> completions;
  private Long total;
  private Boolean hasMore;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class CompletionHistoryItem {
    private String lessonId;
    private String lessonTitle;
    private Integer score;
    private Integer xpEarned;
    private Instant completedAt;
  }
}
