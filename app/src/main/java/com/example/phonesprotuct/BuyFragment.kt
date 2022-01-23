package com.example.phonesprotuct

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.phonesprotuct.databinding.FragmentBuyBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BuyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BuyFragment : Fragment() {
        private var _binding:   FragmentBuyBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBuyBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            binding.phoneNameSmartphoneActivity.text = it.getString("phoneInfo").toString()
            binding.phoneImageSmartPhoneActivity.setImageResource(it.getInt("phoneImage"))

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}