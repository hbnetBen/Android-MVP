package include.mvp.data.module

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import include.mvp.mainscreen.MainActivity
import include.mvp.mainscreen.MainScreenContract
import include.mvp.presenter.MainPresenter

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

@Module
class MainScreenModule {


    @Singleton
    @Provides
    fun providesPresenter(presenter: MainPresenter): MainScreenContract.Presenter {
        return presenter
    }
}
