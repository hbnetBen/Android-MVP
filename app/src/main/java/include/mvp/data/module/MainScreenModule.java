package include.mvp.data.module;

import dagger.Module;
import dagger.Provides;
import include.mvp.mainscreen.MainScreenContract;
import include.mvp.util.CustomScope;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
