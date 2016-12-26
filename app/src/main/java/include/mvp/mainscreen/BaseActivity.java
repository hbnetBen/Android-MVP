package include.mvp.mainscreen;

import android.support.v7.app.AppCompatActivity;

import include.mvp.App;
import include.mvp.data.component.NetComponent;

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

public class BaseActivity  extends AppCompatActivity{

    protected NetComponent getApplicationComponent() {
        return ((App) getApplication()).getNetComponent();
    }
}
