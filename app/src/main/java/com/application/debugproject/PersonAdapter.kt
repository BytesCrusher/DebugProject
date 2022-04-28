package com.application.debugproject

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PersonAdapter(
    private val onItemClick: (position:Int) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var persons: List<Person> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return when(persons[position]){
            is Person.Developer -> TYPE_DEVELOPER
            is Person.User -> TYPE_USER
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    fun updatePersons(newPerson: List<Person>) {
        persons = newPerson
    }

    //это абстрактный класс т.к. у нас две разметки имеют общие части
    abstract class BasePersonHolder(
        view: View,
        onItemClick: (position:Int) -> Unit
    ):RecyclerView.ViewHolder(view){

        private val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        private val ageTextView: TextView = view.findViewById(R.id.ageTextView)
        private val avatarImageView: ImageView = view.findViewById(R.id.avatarImageView)

        init {
            view.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }

        protected fun bindMainInfo(
            name: String,
            avatarLink: String,
            age: Int
        ){
            nameTextView.text = name
            ageTextView.text = "Возраст = ${age}"

            //настройка получения изображения
            //передать вью, фрагмент или активити
            Glide.with(itemView)
                .load(avatarLink)//как получаем данные
                //.error()//что покажет если нет интернета
                .placeholder(R.drawable.ic_portrait)//что показывавем пока изображение грузится
                .into(avatarImageView)//куда устанавливаем
        }
    }

    class UserHolder(

    )

    companion object {
        private const val TYPE_USER = 1
        private const val TYPE_DEVELOPER = 2
    }
}