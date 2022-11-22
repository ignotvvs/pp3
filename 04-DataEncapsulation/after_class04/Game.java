public class Game {
    private String gameName, developer;
    private int yearReleased;
    private String[] platforms;
    
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public int getYearReleased() {
        return yearReleased;
    }
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
    public String[] getPlatforms() {
        return platforms;
    }
    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

}
