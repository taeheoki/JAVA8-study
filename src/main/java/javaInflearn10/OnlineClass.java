package javaInflearn10;

import java.nio.channels.IllegalSelectorException;
import java.time.Duration;
import java.util.Optional;

public class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    public Progress progress;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

//    public Progress getProgress() {
//        if (this.progress == null) {
//            throw new IllegalStateException();
//        }
//        // 에러의 전 단계를 리소스에 기록하게되어 성능이 무거워진다.
//        // 그렇기에 널이 나오면 실행문에서 널 체크를 통해 처리하는게 그나마 가벼워진다.
//        return progress;
//    }

    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
        // ofNullalbe이 아닌 of가 일 경우 null이 반드시 아닌 값이 넘어와야 한다.
    }

//    public void setProgress(Progress progress) {
//        this.progress = progress;
//    }

    public void setProgress(Optional<Progress> progress) {
        progress.ifPresent(p -> this.progress = p);
    }
}
