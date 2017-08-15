package include.mvp.data.component

import javax.inject.Singleton

import dagger.Component
import include.mvp.MvpApp
import include.mvp.data.module.AppModule
import include.mvp.data.module.MainScreenModule
import include.mvp.data.module.NetModule
import include.mvp.mainscreen.MainActivity
import retrofit2.Retrofit

/**
 * Created by iagomendesfucolo on 26/12/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class, MainScreenModule::class))
interface ApplicationComponent {

    fun inject(mvpApp: MvpApp)
    fun inject(mainActivity: MainActivity)
}

