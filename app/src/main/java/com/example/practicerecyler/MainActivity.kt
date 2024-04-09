package com.example.practicerecyler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicerecyler.Adapter as Adapter


class MainActivity : AppCompatActivity() {
    private lateinit var myRecyclerView : RecyclerView
    private lateinit var contactinfo :ArrayList<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        myRecyclerView = findViewById(R.id.recycler)
        myRecyclerView.layoutManager = LinearLayoutManager(this)

// create a variable to store the all data which is mention in your data class
        contactinfo = ArrayList()
        contactinfo.add(Contact(R.drawable.account,"396782393","Rohan"))
        contactinfo.add(Contact(R.drawable.mag,"391782393","Rishi"))
        contactinfo.add(Contact(R.drawable.man,"3121782393","Rohit"))
        contactinfo.add(Contact(R.drawable.man_4140037,"327382393","Pekka"))
        contactinfo.add(Contact(R.drawable.man_4140048,"302853393","Jack"))
        contactinfo.add(Contact(R.drawable.user,"392822393","Barbarian"))
        contactinfo.add(Contact(R.drawable.woman,"392182393","Medusa"))
        contactinfo.add(Contact(R.drawable.boy,"392172393","Ronny"))
        contactinfo.add(Contact(R.drawable.acc,"838292302","Khusal"))
        contactinfo.add(Contact(R.drawable.man,"3921782393","Kratos"))
        contactinfo.add(Contact(R.drawable.man_4140037,"327382393","Pekka"))
        contactinfo.add(Contact(R.drawable.man_4140048,"392853393","Knight"))
        contactinfo.add(Contact(R.drawable.man,"3921782393","Roy"))
        contactinfo.add(Contact(R.drawable.man_4140037,"327382393","Rey"))
        contactinfo.add(Contact(R.drawable.man_4140048,"392853393","Jack"))

// Just call out the adapter with your custom variable
        myRecyclerView.adapter = Adapter(contactinfo)



    }
}

