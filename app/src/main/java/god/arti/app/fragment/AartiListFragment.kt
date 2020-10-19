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
        list.add(ObjAartiList("Ganesh   Aarati"))
        list.add(ObjAartiList("Gajanan  Aarati"))
        list.add(ObjAartiList("Hanuman  Aarati"))
        list.add(ObjAartiList("Shankar Ji Aarati"))
        list.add(ObjAartiList("Durga  Aarati"))
        list.add(ObjAartiList("Lakshmi  Aarati"))
        list.add(ObjAartiList("Kali Ma Aarati"))
        list.add(ObjAartiList("Vishnu  Aarati  "))
        list.add(ObjAartiList("Hanuman Chalisa Aarati"))
        list.add(ObjAartiList("Swami Samarth  Aarati"))
        list.add(ObjAartiList("Sai baba  Aarati"))
        list.add(ObjAartiList("Ram Strot  Aarati"))
        list.add(ObjAartiList("abc Aarati"))
        list.add(ObjAartiList("Aafgg Aarati"))
        list.add(ObjAartiList("Ganesh   Aarati"))
        list.add(ObjAartiList("Gajanan  Aarati"))
        list.add(ObjAartiList("Hanuman  Aarati"))
        list.add(ObjAartiList("Shankar Ji Aarati"))
        list.add(ObjAartiList("Durga  Aarati"))
        list.add(ObjAartiList("Lakshmi  Aarati"))
        list.add(ObjAartiList("Kali Ma Aarati"))
        list.add(ObjAartiList("Vishnu  Aarati  "))
        list.add(ObjAartiList("Hanuman Chalisa Aarati"))
        list.add(ObjAartiList("Swami Samarth  Aarati"))
        list.add(ObjAartiList("Sai baba  Aarati"))
        list.add(ObjAartiList("Ram Strot  Aarati"))
        list.add(ObjAartiList("abc Aarati"))
        list.add(ObjAartiList("Aafgg Aarati"))

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