package include.mvp

import android.app.Application

import include.mvp.data.component.ApplicationComponent
import include.mvp.data.component.DaggerApplicationComponent
import include.mvp.data.module.AppModule

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

class MvpApp : Application() {


    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }


    override fun onCreate() {
        super.onCreate()


        component.inject(this)
    }
}
