package test.javaInflearn10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
        Progress progress = spring_boot.getProgress();
        if (progress != null) {
            System.out.println(progress.getStudyDuration());
        }
    }
}
