package include.mvp.mainscreen

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import java.util.ArrayList

import javax.inject.Inject

import butterknife.BindView
import butterknife.ButterKnife
import include.mvp.R
import include.mvp.model.Post
import include.mvp.presenter.MainPresenter

class MainActivity : BaseActivity(), MainScreenContract.View {

    @BindView(R.id.my_list)
    lateinit var listView: ListView

    @Inject
    lateinit var mainPresenter: MainPresenter

    private var list: ArrayList<String> = ArrayList()
    private var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        applicationComponent.inject(this)
        mainPresenter.bind(this)
        mainPresenter.loadPost()

    }

    override fun onDestroy() {
        mainPresenter.unbind()
        super.onDestroy()
    }

    override fun showPosts(posts: List<Post>) {
        for (i in posts.indices) {
            posts[i].title?.let { list.add(it) }
        }

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
    }

    override fun showError(message: String) {
        Toast.makeText(applicationContext, "Error" + message, Toast.LENGTH_SHORT).show()

    }

    override fun showComplete() {
        Toast.makeText(applicationContext, "Complete", Toast.LENGTH_SHORT).show()

    }
}
