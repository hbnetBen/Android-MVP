package include.mvp.mainscreen;

import java.util.List;

import include.mvp.model.Post;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

public class MainScreenContract {
    public interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    public interface Presenter {
        void loadPost();
    }
}
