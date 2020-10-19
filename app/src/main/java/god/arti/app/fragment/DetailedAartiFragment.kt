package god.arti.app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.gson.Gson
import god.arti.app.R
import god.arti.app.adapter.ObjAartiList
import god.arti.app.databinding.FragmentDetailedAartiBinding


class DetailedAartiFragment : Fragment() {

    companion object {

    }

    lateinit var fragmentDetailedAartiBinding: FragmentDetailedAartiBinding

    lateinit var objAartiList: ObjAartiList
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentDetailedAartiBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_detailed_aarti,container,false)
         initView()
        return fragmentDetailedAartiBinding.root
    }

    fun initView() {
        var selectedItem=""
        var args=arguments
        if (args!=null && args.getString("selected_data") != null)
        {
             selectedItem = args.getString("selected_data")!!
            fragmentDetailedAartiBinding.aartiName.setText(selectedItem)

        }

    }


}