package include.mvp.data.component;

import dagger.Component;
import include.mvp.mainscreen.MainActivity;
import include.mvp.data.module.MainScreenModule;
import include.mvp.util.CustomScope;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
