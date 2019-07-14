package com.tpm.retrobic.adapter.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tpm.retrobic.model.Post
import kotlinx.android.synthetic.main.post_detail.view.*

class PostDetailsViewHolder(var view : View) : RecyclerView.ViewHolder(view) {
    fun setData(post: Post)
    {
        view.subtvUserId.text = post.userId
        view.subtvPostId.text = post.userId
        view.subtvTitle.text = post.title
        view.subtvBody.text = post.body
    }
}
