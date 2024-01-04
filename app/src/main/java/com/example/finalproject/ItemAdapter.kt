package com.example.finalproject

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_row.view.Edit
import kotlinx.android.synthetic.main.items_row.view.Email
import kotlinx.android.synthetic.main.items_row.view.GantiPw
import kotlinx.android.synthetic.main.items_row.view.Gender
import kotlinx.android.synthetic.main.items_row.view.NoHp
import kotlinx.android.synthetic.main.items_row.view.TglLahir
import kotlinx.android.synthetic.main.items_row.view.llMain

class ItemAdapter(val context: Context, val items:
ArrayList<DataModelClass>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.items_row, parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.Gender.text = item.gender
        holder.TglLahir.text = item.tgllahir
        holder.Email.text = item.email
        holder.NoHp.text = item.nohp
        holder.GantiPw.text = item.gantipw

        if (position % 2 == 0) {
            holder.llMain.setBackgroundColor(
                ContextCompat.getColor(context, R.color.colorLightGray
                )
            )
        } else {
            holder.llMain.setBackgroundColor(ContextCompat.getColor(context, R.color.white))
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        val llMain = view.llMain
        val Gender = view.Gender
        val TglLahir = view.TglLahir
        val Email= view.Email
        val NoHp = view.NoHp
        val GantiPw = view.GantiPw
        val Edit = view.Edit
    }
}
