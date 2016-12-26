package include.mvp.data.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule (Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication () {
        return mApplication;
    }
}
