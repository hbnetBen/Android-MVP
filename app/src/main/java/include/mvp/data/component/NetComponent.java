package include.mvp.data.component;

import javax.inject.Singleton;

import dagger.Component;
import include.mvp.data.module.AppModule;
import include.mvp.data.module.NetModule;
import retrofit2.Retrofit;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
