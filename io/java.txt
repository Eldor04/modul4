package lesson6.homeWork.exercise10;

public enum Color {
    RED(4,"STOP"),
    YELLOW(3,"WAIT"),
    GREEN(5,"GO");
    private int seconds;
    private String message;

    Color(int seconds, String message) {
        this.seconds = seconds;
        this.message = message;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Color{" +
                "seconds=" + seconds +
                ", message='" + message + '\'' +
                '}';
    }
}
