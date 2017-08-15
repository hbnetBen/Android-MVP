package include.mvp.mainscreen

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity

import include.mvp.MvpApp
import include.mvp.data.component.ApplicationComponent

/**
 * Created by iagomendesfucolo on 26/12/16.
 */

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    protected val applicationComponent: ApplicationComponent
        get() = (application as MvpApp).component
}
