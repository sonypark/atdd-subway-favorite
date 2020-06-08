package wooteco.subway.domain.favorite;

public class FavoriteDetail {
    private Long id;
    private Long sourceId;
    private Long targetId;
    private String sourceName;
    private String targetName;

    public FavoriteDetail(Long id, Long sourceId, Long targetId, String sourceName,
        String targetName) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.sourceName = sourceName;
        this.targetName = targetName;
    }

    public Long getId() {
        return id;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getTargetName() {
        return targetName;
    }
}
