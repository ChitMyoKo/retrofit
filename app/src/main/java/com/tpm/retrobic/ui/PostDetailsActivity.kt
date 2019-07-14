package com.tpm.retrobic.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.tpm.retrobic.R
import com.tpm.retrobic.adapter.PostDetailsAdapter
import com.tpm.retrobic.api.PostAPI
import com.tpm.retrobic.api.RestAdapter
import com.tpm.retrobic.model.Post
import kotlinx.android.synthetic.main.activity_post_details.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import java.io.Serializable
import javax.security.auth.callback.Callback

class PostDetailsActivity : AppCompatActivity() {
    lateinit var posts : List<Post>
    private val postDetailAdapter : PostDetailsAdapter by lazy { PostDetailsAdapter(posts) }
    companion object
    {
        fun newIntent(context: Context): Intent
        {
            val intent = Intent(context,PostDetailsActivity::class.java)
            var bundle = Bundle().apply {
            }
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_post_details)
        posts = MainActivity().posts
        rcPostDetails.apply {
            adapter = postDetailAdapter
            layoutManager = LinearLayoutManager(this@PostDetailsActivity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home)
        {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
