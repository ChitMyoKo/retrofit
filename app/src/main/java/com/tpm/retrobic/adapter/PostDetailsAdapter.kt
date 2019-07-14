package com.tpm.retrobic.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tpm.retrobic.R
import com.tpm.retrobic.adapter.viewholders.PostDetailsViewHolder
import com.tpm.retrobic.model.Post

class PostDetailsAdapter(var post : List<Post>) : RecyclerView.Adapter<PostDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostDetailsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.post_detail,parent,false)
        return PostDetailsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return post.count()
    }

    override fun onBindViewHolder(holder: PostDetailsViewHolder, position: Int) {
        holder.setData(  post[position])
    }
}