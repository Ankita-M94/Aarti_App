package god.arti.app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import god.arti.app.R
import god.arti.app.databinding.FragmentDetailedAartiBinding


class DetailedAartiFragment : Fragment() {

    companion object {

    }

    lateinit var fragmentDetailedAartiBinding: FragmentDetailedAartiBinding

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
        TODO("Not yet implemented")
    }


}