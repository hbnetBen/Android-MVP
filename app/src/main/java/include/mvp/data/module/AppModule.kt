package include.mvp.data.module

import android.app.Application
import android.content.Context

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    internal fun provideApplication(): Application {
        return application
    }

    @Provides
    @Singleton
    internal fun providesContext(): Context {
        return application.applicationContext
    }
}
