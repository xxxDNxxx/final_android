package buu.informatics.s59160379.mytestapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160379.mytestapp.databinding.FragmentP1Binding

/**
 * A simple [Fragment] subclass.
 */
class P1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentP1Binding>(inflater,R.layout.fragment_p1,container,false)

        binding.playButton.setOnClickListener {
            view?.findNavController()?.navigate(P1FragmentDirections.actionP1FragmentToP2Fragment())
        }
        binding.aboutButton.setOnClickListener {
            view?.findNavController()?.navigate(P1FragmentDirections.actionP1FragmentToP3Fragment())
        }

        return binding.root
    }


}
