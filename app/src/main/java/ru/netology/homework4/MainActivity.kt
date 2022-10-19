package ru.netology.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import ru.netology.homework4.databinding.ActivityMainBinding
import ru.netology.homework4.dto.Post


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val post = Post(
            id = 1,
            author = "Нетология. Университет интернет-профессий будущего",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            published = "21 мая в 18:36",
            likedByMe = false
        )


        binding.apply {

            author.text = post.author
            published.text = post.published
            content.text = post.content
            //     root.setOnClickListener {
            if (post.likedByMe) {
                likes.setImageResource(R.drawable.ic_baseline_favorite_24)
            }
            countLikes.text = post.like.toString()
            countShares.text = post.share.toString()

            likes.setOnClickListener {
                post.likedByMe = !post.likedByMe
                likes.setImageResource(
                    if (post.likedByMe)
                        R.drawable.ic_baseline_favorite_24
                    else R.drawable.ic_baseline_favorite_border_24
                )
                if (post.likedByMe) post.like++ else post.like--
                countLikes.text = post.like.toString()
//                    println("likes")
            }

            DisplayingNumbers(post.like, countLikes)
            share.setOnClickListener {
                post.sharedByMe = !post.sharedByMe

                if (post.sharedByMe) post.share = post.share + 10_000
                countShares.text = post.share.toString()
                DisplayingNumbers(post.share, countShares)

            }
            view.setOnClickListener {
                post.viewedByMe = !post.viewedByMe
                if (post.viewedByMe) post.view = post.view + 10_000
                countView.text = post.view.toString()
                DisplayingNumbers(post.view, countView)


            }
//                avatar.setOnClickListener {
//                    println("ava")
//                }
//               println("root")
//           }


        }

    }
}





