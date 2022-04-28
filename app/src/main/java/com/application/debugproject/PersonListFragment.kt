package com.application.debugproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PersonListFragment : Fragment(R.layout.fragment_person_list) {

    private val persons = listOf(
        Person.Developer(
            name = "Иван Петров",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 25,
            programmingLanguge = "Java"
        ),
        Person.User(
            name = "Иванесса Котова",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 45
        ),
        Person.User(
            name = "Олег Олегов",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 30
        ),
        Person.Developer(
            name = "Никита Баклажанов",
            avatarLink = "https://wallbox.ru/resize/1280x960/wallpapers/main/201123/52ccd8af2bf453f228a83fb681c4c196.jpg",
            age = 21,
            programmingLanguge = "Python"
        ),
        Person.User(
            name = "Илья Рудаченко",
            avatarLink = "https://c.wallhere.com/photos/fc/9a/1366x768_px_Canada_landscape_mountain_stars_Trees-1080526.jpg",
            age = 40
        ),
        Person.User(
            name = "Александр Шавермянко",
            avatarLink = "https://yandex.ru/images/search?text=%D1%88%D1%80%D0%B5%D0%BA&lr=22&pos=16&img_url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FD7Kgr9KWkAEngcS.jpg&rpt=simage",
            age = 37
        ),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = PersonListFragment()
    }
}