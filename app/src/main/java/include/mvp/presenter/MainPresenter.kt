package include.mvp.presenter

import javax.inject.Inject

import include.mvp.api.ServerApi
import include.mvp.mainscreen.MainScreenContract
import include.mvp.model.Post
import include.mvp.rx.ReactivePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.plusAssign
import retrofit2.Retrofit
import rx.Observer
import rx.schedulers.Schedulers

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

class MainPresenter @Inject constructor(val serverApi: ServerApi) : MainScreenContract.Presenter, ReactivePresenter<MainScreenContract.View>() {


    override fun loadPost() {
       serverApi.postList.subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe({
                    data -> view?.showPosts(data)
                },{
                    view?.showError(it.message)
                })
    }

}
