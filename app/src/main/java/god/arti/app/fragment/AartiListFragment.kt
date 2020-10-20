package god.arti.app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import god.arti.app.R
import god.arti.app.adapter.AartiListAdapter
import god.arti.app.adapter.ObjAartiList
import god.arti.app.callbackInterface.IAartiListInterface
import god.arti.app.databinding.FragmentAartiListBinding


class AartiListFragment : Fragment(), IAartiListInterface {
    lateinit var listOfCountry: ArrayList<ObjAartiList>

    companion object {

    }
    lateinit var fragmentArtiListBinding: FragmentAartiListBinding
    lateinit var aartiListAdapter: AartiListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentArtiListBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_aarti_list,container,false)
        initView()
        return  fragmentArtiListBinding.root
    }

    private fun initView() {
        fragmentArtiListBinding.countryListRecyclerView.layoutManager =
            LinearLayoutManager(context) as RecyclerView.LayoutManager?
        val list = ArrayList<ObjAartiList>()
        list.add(ObjAartiList("Ganesh   Aarati",R.drawable.ic_krishna))
        list.add(ObjAartiList("Gajanan  Aarati",R.drawable.ic_krishna))
        list.add(ObjAartiList("Hanuman  Aarati",R.drawable.ic_krishna))
        list.add(ObjAartiList("Shankar Ji Aarati",R.drawable.ic_krishna))
        list.add(ObjAartiList("Durga  Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Lakshmi  Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Kali Ma Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Vishnu  Aarati  ",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Hanuman Chalisa Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Swami Samarth  Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Sai baba  Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Ram Strot  Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("abc Aarati",R.drawable.ic_atom_icon_green_tick_default))
        /*list.add(ObjAartiList("Aafgg Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Ganesh   Aarati",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("Gajanan  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Hanuman  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Shankar Ji Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Durga  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Lakshmi  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Kali Ma Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Vishnu  Aarati  ","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Hanuman Chalisa Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Swami Samarth  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Sai baba  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Ram Strot  Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("abc Aarati","R.drawable.ic_atom_icon_green_tick_default"))
        list.add(ObjAartiList("Aafgg Aarati","R.drawable.ic_atom_icon_green_tick_default"))*/

        if (!list.isEmpty()) {
            listOfCountry = list
        }

        setDataToAdapter()
    }

    private fun setDataToAdapter()
    {
        if (!listOfCountry.isEmpty()){
            aartiListAdapter= AartiListAdapter(listOfCountry,requireActivity(),this)
            fragmentArtiListBinding.countryListRecyclerView.adapter =  aartiListAdapter
        }
    }

    override fun onItemSelected(objAartiList: ObjAartiList) {
        findNavController().navigate(R.id.action_aartiListFragment_to_detailedAartiFragment,
            bundleOf("selected_data" to objAartiList.name))
    }
    override fun onBackButtonClick() {
    }

}