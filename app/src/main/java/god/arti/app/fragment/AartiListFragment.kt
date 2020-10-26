package god.arti.app.fragment

import android.os.Bundle
import android.util.Log
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
import com.google.android.gms.ads.*
import god.arti.app.R
import god.arti.app.adapter.AartiListAdapter
import god.arti.app.adapter.ObjAartiList
import god.arti.app.callbackInterface.IAartiListInterface
import god.arti.app.databinding.FragmentAartiListBinding


class AartiListFragment : Fragment(), IAartiListInterface {
    lateinit var listOfCountry: ArrayList<ObjAartiList>
    private lateinit var mInterstitialAd: InterstitialAd


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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adView = AdView(context)


        adView.adSize = AdSize.BANNER
        adView.adUnitId = getString(R.string.test_banner_id)
        MobileAds.initialize(context) {}
        val adRequest = AdRequest.Builder().build()
        fragmentArtiListBinding.adView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(context)
        mInterstitialAd.adUnitId =getString(R.string.test_interstrisialID)
        mInterstitialAd.loadAd(AdRequest.Builder().build())

    }

    private fun initView() {
        fragmentArtiListBinding.countryListRecyclerView.layoutManager =
            LinearLayoutManager(context) as RecyclerView.LayoutManager?
        val list = ArrayList<ObjAartiList>()
        list.add(ObjAartiList("श्री गणेश आरती 1",R.drawable.ic_krishna))
        list.add(ObjAartiList("श्री गणेश आरती 2",R.drawable.ic_krishna))
        list.add(ObjAartiList("दुर्गा माँ की आरती",R.drawable.ic_krishna))
        list.add(ObjAartiList("जय सन्तोषी माता: आरती",R.drawable.ic_krishna))
        list.add(ObjAartiList("माँ लक्ष्मी की आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("ॐ जय जगदीश हरे आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री शिव, शंकर, भोलेनाथ आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("आरती कुंजबिहारी की",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री हनुमान जी आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री राम स्तुति: श्री रामचन्द्र कृपालु भजुमन",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री सत्यनारायण जी आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("महाराजा अग्रसेन की आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("दुर्गा पूजा पुष्पांजली!",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("ओवळा ओवळा माझ्या सद्गुरू राया",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("कर्पूर गौरम करूणावतारम",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("तुलसी माता की आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("तुळशीच्या लग्नाची मंगलाष्टके",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("अम्बे तू है जगदम्बे काली: माँ दुर्गा, माँ काली आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("आरती: श्री शनिदेव - जय जय श्री शनिदेव",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("रघुवर श्री रामचन्द्र जी आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("आरती: श्री गणेश - शेंदुर लाल चढ़ायो",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("दत्ताची आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("आरती: वैष्णो माता",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री सिद्धिविनायक आरती: जय देव जय देव",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री शंकराची आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री विठोबाची आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("गायत्री मंत्र",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("आरती साई बाबा",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("पसायदान",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("श्री गजानन महाराज (शेगाव) आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("अनसुया आईची आरती",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("जय आद्य शक्ती, विश्वंभरी (गुजराती)",R.drawable.ic_atom_icon_green_tick_default))
        list.add(ObjAartiList("जय आद्या शक्ति (गुजराती)",R.drawable.ic_atom_icon_green_tick_default))

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

        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
        } else {
            findNavController().navigate(R.id.action_aartiListFragment_to_detailedAartiFragment,
                bundleOf("selected_data" to objAartiList.name))
        }

        mInterstitialAd.adListener = object: AdListener() {

            override fun onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                findNavController().navigate(R.id.action_aartiListFragment_to_detailedAartiFragment,
                    bundleOf("selected_data" to objAartiList.name))
            }
        }



    }
    override fun onBackButtonClick() {
    }

}