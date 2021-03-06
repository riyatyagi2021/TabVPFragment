package com.app.app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.app.R
import com.app.app.adapters.chatAdapter
import com.app.app.rvclass.chat_design


class chatfragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.chatfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var rvChat =  view.findViewById<RecyclerView>(R.id.rv1)
       lateinit var adapter: chatAdapter


        var myList = ArrayList<chat_design>()

        for(i in 0..100) {

            myList.add(
                chat_design(
                    R.drawable.img1,
                    tv1 = "Riya ",
                    tv2 = "10:40 am",
                    tv3 = "Hello"
                )
            )
            myList.add(chat_design(R.drawable.i2, tv1 = "Nitysaha", tv2 = "10:20 am", tv3 = "Good"))
            myList.add(chat_design(R.drawable.i3, tv1 = "Sonia", tv2 = "10:10 am", tv3 = "hey"))
            myList.add(chat_design(R.drawable.i4, tv1 = "Anchal", tv2 = "11:20 am", tv3 = "dear"))
            myList.add(chat_design(R.drawable.img1, tv1 = "kajal", tv2 = "12:20 am", tv3 = "Hello"))
            myList.add(chat_design(R.drawable.i2, tv1 = "Dev", tv2 = "1:40 am", tv3 = "Hello"))
//        myList.add(item_design(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello"))
            myList.add(chat_design(R.drawable.i4, tv1 = "Shilpa", tv2 = "5:30 am", tv3 = "Hello"))
            myList.add(chat_design(R.drawable.i4, tv1 = "Akhil", tv2 = "5:30 am", tv3 = "Hello"))


        }

        adapter = chatAdapter(myList)
        rvChat.setHasFixedSize(true)
        rvChat.adapter = adapter
        rvChat.layoutManager= LinearLayoutManager(context)
    }

    }
