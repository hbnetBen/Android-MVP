package include.mvp.presenter;

import java.util.List;

import javax.inject.Inject;

import include.mvp.api.PostService;
import include.mvp.mainscreen.MainScreenContract;
import include.mvp.model.Post;
import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

public class MainPresenter implements MainScreenContract.Presenter{
    Retrofit retrofit;
    MainScreenContract.View mView;

    @Inject
    public MainPresenter(Retrofit retrofit, MainScreenContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }

    @Override
    public void loadPost() {
        retrofit.create(PostService.class).getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        mView.showPosts(posts);
                    }
                });
    }

}
