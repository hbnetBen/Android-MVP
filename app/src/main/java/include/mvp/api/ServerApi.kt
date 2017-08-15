package include.mvp.api

import include.mvp.model.Post
import retrofit2.http.GET
import rx.Observable


/**
 * Created by iagomendesfucolo on 26/12/16.
 */

interface ServerApi {

    @get:GET("/posts")
    val postList: Observable<List<Post>>
}
