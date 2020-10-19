package god.arti.app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import god.arti.app.R
import god.arti.app.databinding.FragmentAartiListBinding


class AartiListFragment : Fragment() {

    companion object {

    }
    lateinit var fragmentArtiListBinding: FragmentAartiListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentArtiListBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_aarti_list,container,false)
        initView()
        return    fragmentArtiListBinding.root
    }

    private fun initView() {

    }


}