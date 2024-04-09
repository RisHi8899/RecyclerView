package com.example.practicerecyler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView as ImageView1

// Call the all data variable which You already with add with and add with adapter
class Adapter (private val contactinfo:ArrayList<Contact>):RecyclerView.Adapter<Adapter.ViewHolder>()  {

// Using LayoutInflater to hold the custom view for your data if Layout manager failed to show
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.contact_row,parent,false)
        return ViewHolder(viewHolder)
    }
// Using for how many item it will displayed
    override fun getItemCount(): Int {
        return contactinfo.size
    }
// Not least but important to show hold the data which is stored in MainActivity file

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentitem =  contactinfo[position]
        holder.pro.setImageResource(currentitem.ContactImage)
        holder.con.text = currentitem.ContactNumber
        holder.nam.text = currentitem.Contactname

// Create a class to call the item using it ID
    }
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val pro = itemView.findViewById<ImageView1>(R.id.profile)!!
        val con = itemView.findViewById<TextView>(R.id.contactnumber)!!
        val nam = itemView.findViewById<TextView>(R.id.contact)!!
    }

}