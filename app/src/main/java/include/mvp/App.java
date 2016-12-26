package include.mvp;

import android.app.Application;

import include.mvp.data.component.DaggerNetComponent;
import include.mvp.data.component.NetComponent;
import include.mvp.data.module.AppModule;
import include.mvp.data.module.NetModule;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

public class App extends Application {
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent () {
        return netComponent;
    }
}
