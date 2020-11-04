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
import kotlinx.android.synthetic.main.activity_home.*

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

            when (selectedItem){

                 "श्री गणेश आरती 1" ->{
                     fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesh)
                     fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                     fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.ganesh_aarti))
                 }
                "श्री गणेश आरती 2" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesha)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.ganesh_aarti_2))
                }
                "दुर्गा माँ की आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.durga)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.durga))
                }
                "जय सन्तोषी माता: आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.santoshi)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.santoshi))
                }
                "माँ लक्ष्मी की आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.laxmi)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.laxmi))
                }
                "ॐ जय जगदीश हरे आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.jagdish)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.jagdish))
                }
                "श्री शिव, शंकर, भोलेनाथ आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.mahadev)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.shiv))
                }
                "आरती कुंजबिहारी की" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.krishana)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.kunj))
                }
                "श्री हनुमान जी आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.hanuman)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.hanuman))
                }
                "श्री राम स्तुति: श्री रामचन्द्र कृपालु भजुमन" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ram)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.ram))
                }
                "श्री सत्यनारायण जी आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.vishnu)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.satyanarayan))
                }
                "महाराजा अग्रसेन की आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.agrasen)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.agrasen))
                }
                "दुर्गा पूजा पुष्पांजली!" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.durga)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.durga1))
                }
                "ओवळा ओवळा माझ्या सद्गुरू राया" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesha)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.owada))
                }
                "कर्पूर गौरम करूणावतारम" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesh)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.kapur))
                }
                "तुलसी माता की आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.tulsi)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.tulsi))
                }
                "तुळशीच्या लग्नाची मंगलाष्टके" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.tulsi)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.tulsi1))
                }
                "अम्बे तू है जगदम्बे काली: माँ दुर्गा, माँ काली आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ambe)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.ambe))
                }
                "आरती: श्री शनिदेव - जय जय श्री शनिदेव" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.shanidev)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.shanidev))
                }
                "रघुवर श्री रामचन्द्र जी आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ram)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.raghuvar))
                }
                "आरती: श्री गणेश - शेंदुर लाल चढ़ायो" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesha)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.arti_shree_ganesh))
                }
                "दत्ताची आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.datta)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.dattaji))
                }
                "आरती: वैष्णो माता" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.vaishno)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.vaishno))
                }
                "श्री सिद्धिविनायक आरती: जय देव जय देव" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesh)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.siddhivinayak))
                }
                "श्री शंकराची आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.mahadev)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.shankarji))
                }
                "श्री विठोबाची आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.vidhoba)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.vithoba))
                }
                "गायत्री मंत्र" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ganesha)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.gayatri))
                }
                "आरती साई बाबा" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.saibaba)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.sai))
                }
                "पसायदान" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.santdhaneshwar)
                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.pasaydan))
                }
                "श्री गजानन महाराज (शेगाव) आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.gajananmaharaj)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.gajanan))
                }
                "अनसुया आईची आरती" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.anushaya)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.anusaya))
                }
                "जय आद्य शक्ती, विश्वंभरी (गुजराती)" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.durga)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.gujrati))
                }
                "जय आद्या शक्ति (गुजराती)" ->{
                    fragmentDetailedAartiBinding.ivGod.setImageResource(R.drawable.ambe)

                    fragmentDetailedAartiBinding.tvAaratiName.setText(selectedItem)
                    fragmentDetailedAartiBinding.tvAaratiDetail.setText(getString(R.string.adishakti_gujrati))
                }
            }


        }

    }


}