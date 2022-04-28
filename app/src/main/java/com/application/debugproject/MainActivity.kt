package com.application.debugproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.debugproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //здесь отработаю добавление сложной разметки внутрь вывода информации в RecyclerView

    private val users = listOf<User>(
        User(
            name = "Иван Петров",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 25,
            isDeveloper = true
        ),
        User(
            name = "Иванесса Котова",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 45,
            isDeveloper = false
        ),
        User(
            name = "Олег Олегов",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 30,
            isDeveloper = false
        ),
        User(
            name = "Никита Баклажанов",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 21,
            isDeveloper = true
        ),
        User(
            name = "Илья Рудаченко",
            avatarLink = "https://c.wallhere.com/photos/fc/9a/1366x768_px_Canada_landscape_mountain_stars_Trees-1080526.jpg",
            age = 40,
            isDeveloper = false
        ),
        User(
            name = "Александр Шавермянко",
            avatarLink = "https://yandex.ru/images/search?text=%D1%88%D1%80%D0%B5%D0%BA&lr=22&pos=16&img_url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FD7Kgr9KWkAEngcS.jpg&rpt=simage",
            age = 37,
            isDeveloper = false
        ),
        )
    /*val rec = this.findViewById<RecyclerView>(R.id.userList)*/

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initList()
    }

    private fun initList(){
        with(binding.userList){
            adapter = UserAdapter(users + users + users + users + users)
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }
}