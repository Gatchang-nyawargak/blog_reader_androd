import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.blogreader.BlogReader
import com.akirachix.blogreader.R

class BlogAdapter (val blogs:List<BlogReader>):
RecyclerView.Adapter<ArticlesViewsHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewsHolder {
        var itemView = LayoutInflater.from(parent.context).
        inflate(R.layout.blog_reader_item,parent,false)
        return ArticlesViewsHolder(itemView)
    }


    override fun getItemCount(): Int {
         return blogs.size
    }

    override fun onBindViewHolder(holder: ArticlesViewsHolder, position: Int) {
        var blog = blogs[position]
        holder.tvAuthor.text = blog.author
        holder.tvTitle.text= blog.title
        holder.tvArticleReview.text = blog.articleReview
        holder.tvPublishDate.text = blog.publishDate
        holder.tvLink.text = blog.link
    }

}

class  ArticlesViewsHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
        val tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvPublishDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
        val ivAuthorImage = itemView.findViewById<ImageView>(R.id.ivAuthorImage)
        val tvArticleReview = itemView.findViewById<TextView>(R.id.tvArticleReview)
        val ivArticleImage = itemView.findViewById<ImageView>(R.id.ivArticleImage)
        val tvLink = itemView.findViewById<TextView>(R.id.tvLink)




    }
