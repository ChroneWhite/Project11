public class Viewer {

    public Viewer(String name, int age, int movieCount) {
        this.name = name;
        this.age = age;
        this.movieCount = movieCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }

    private String name;
    private int age;
    private int movieCount;
}
