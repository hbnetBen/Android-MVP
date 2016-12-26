package include.mvp.api;

import java.util.List;

import include.mvp.model.Post;
import retrofit2.http.GET;
import rx.Observable;


/**
 * Created by iagomendesfucolo on 26/12/16.
 */

public interface PostService {

    @GET("/posts")
    Observable<List<Post>> getPostList();
}
