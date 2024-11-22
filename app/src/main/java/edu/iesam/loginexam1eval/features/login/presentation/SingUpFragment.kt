package edu.iesam.loginexam1eval.features.login.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import edu.iesam.loginexam1eval.databinding.FragmentSingUpBinding
import edu.iesam.loginexam1eval.features.login.domain.User

class SingUpFragment : Fragment() {

    private var binding : FragmentSingUpBinding? = null
    private val _binding get() = binding!!

    private lateinit var factory: LoginFactory
    private lateinit var viewModel: SingUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSingUpBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        factory = LoginFactory(requireContext())
        viewModel = factory.singUpViewModel

        _binding.action.setOnClickListener {
            if(viewModel.singUp(User("0" , _binding.username.text.toString(),_binding.password.text.toString()) )) {
                findNavController().navigate(SingUpFragmentDirections.navigateFromLsingUpToWelcome())
            } else {
                Log.d("@dev", "Error")
            }
        }
    }
}