package com.application.debugproject

import android.media.Image
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserAdapter(
    private val users:List<User>
): RecyclerView.Adapter<UserAdapter.Holder>() {

    //возвращает количество элементов в списке
    override fun getItemCount(): Int {
        return users.size
    }

    //parent - это родительская View в которую будет установлена View элемента списка
    //parent это RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        //Возвращаем холдер с вьюшкой
        return Holder(parent.inflate(R.layout.item_user))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val user: User = users[position]
        holder.bind(user)
    }

    class Holder(view: View): RecyclerView.ViewHolder(view){

        private val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        private val ageTextView: TextView = view.findViewById(R.id.ageTextView)
        private val developerTextView: TextView = view.findViewById(R.id.developerTextView)
        private val avatarImageView: ImageView = view.findViewById(R.id.avatarImageView)

        //этот метод устанавливае значения в необходимые вьюшки в элемент списка
        fun bind(user: User){
            nameTextView.text = user.name
            ageTextView.text = "Возраст = ${user.age}"
            developerTextView.visibility = if (user.isDeveloper) View.VISIBLE else View.GONE

            //настройка получения изображения
            //передать вью, фрагмент или активити
            Glide.with(itemView)
                .load(user.avatarLink)//как получаем данные
                //.error()//что покажет если нет интернета
                .placeholder(R.drawable.ic_portrait)//что показывавем пока изображение грузится
                .into(avatarImageView)//куда устанавливаем
        }
    }
}