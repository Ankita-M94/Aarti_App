package god.arti.app.adapter

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import god.arti.app.R
import god.arti.app.callbackInterface.IAartiListInterface
import kotlinx.android.synthetic.main.aarti_list_item_layout.view.*

class AartiListAdapter(val listOfAarti: ArrayList<ObjAartiList>,
                       context: Context,var iAartiListInterface: IAartiListInterface) : RecyclerView.Adapter<AartiListAdapter.MyAartiListViewHolder>(){
    var aartiList = ArrayList<ObjAartiList>()
    var mcontext :Context
    var previousHolder : MyAartiListViewHolder?=null
    var clicked: Boolean = false
    init {
        aartiList = listOfAarti
        mcontext=context
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAartiListViewHolder {
        return AartiListAdapter.MyAartiListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.aarti_list_item_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
       return aartiList.size
    }

    override fun onBindViewHolder(holder: MyAartiListViewHolder, position: Int) {
        var list = aartiList[position]

        holder.itemView.txtCountryName.setText(list.name)
        holder.itemView.imgvCountryFlag.setImageResource(list.image)


        holder.itemView.setOnClickListener{
            if(clicked)
            {
                return@setOnClickListener
            }

            if (previousHolder!=null)
            {
                previousHolder?.itemView?.coutry_coontainer_without_isdCode?.imgRightTick?.visibility=View.INVISIBLE
                previousHolder=null
            }
            clicked = true

                holder.itemView.coutry_coontainer_without_isdCode.imgRightTick.visibility=View.VISIBLE

            Handler().postDelayed({
                clicked=false
                iAartiListInterface.onItemSelected(aartiList[position])
            }, 1000)

        }

    }

    public class MyAartiListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}