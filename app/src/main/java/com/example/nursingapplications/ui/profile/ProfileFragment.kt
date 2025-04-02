package com.example.nursingapplications.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nursingapplications.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        setupIntentViews()
        return binding.root
    }


    private fun setupIntentViews() {
        binding.card1.setOnClickListener {
            startActivity(Intent(requireContext(), SejarahActivity::class.java))
        }
        binding.card2.setOnClickListener {
            startActivity(Intent(requireContext(), VisiMisiActivity::class.java))
        }
        binding.card3.setOnClickListener {
            startActivity(Intent(requireContext(), StrukturActivity::class.java))
        }
        binding.card4.setOnClickListener {
            startActivity(Intent(requireContext(), TenagaActivity::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}