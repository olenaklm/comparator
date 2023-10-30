package comperable;

public interface Animal {
    String move();

    default String sleep() {
        return ("sleep");
    }
}
