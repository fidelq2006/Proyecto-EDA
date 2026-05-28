
package fis.proyectoeda;


public class SteamDatos {

    private int appId;
    private String name;
    private String type;
    private String releaseDate;
    private String genres;
    private String developers;
    private String publishers;
    private String description;
    private String price;
    private String thumbnail;
    private String tags;
    private int reviewScore;
    private int positiveReviews;
    private int negativeReviews;
    private String osRequirement;
    private String memoryRequirement;
    private String cpuRequirement;
    private int rank;

    public SteamDatos(int appId, String name, String type, String releaseDate, String genres, String developers, String publishers, String description, String price, String thumbnail, String tags, int reviewScore, int positiveReviews, int negativeReviews, String osRequirement, String memoryRequirement, String cpuRequirement, int rank) {
        this.appId = appId;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.genres = genres;
        this.developers = developers;
        this.publishers = publishers;
        this.description = description;
        this.price = price;
        this.thumbnail = thumbnail;
        this.tags = tags;
        this.reviewScore = reviewScore;
        this.positiveReviews = positiveReviews;
        this.negativeReviews = negativeReviews;
        this.osRequirement = osRequirement;
        this.memoryRequirement = memoryRequirement;
        this.cpuRequirement = cpuRequirement;
        this.rank = rank;
    }

    public int getAppId() {
        return appId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getGenres() {
        return genres;
    }

    public String getDevelopers() {
        return developers;
    }

    public String getPublishers() {
        return publishers;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTags() {
        return tags;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public int getPositiveReviews() {
        return positiveReviews;
    }

    public int getNegativeReviews() {
        return negativeReviews;
    }

    public String getOsRequirement() {
        return osRequirement;
    }

    public String getMemoryRequirement() {
        return memoryRequirement;
    }

    public String getCpuRequirement() {
        return cpuRequirement;
    }

    public int getRank() {
        return rank;
    }
    
}

