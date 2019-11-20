package buu.informatics.s59160379.mytestapp


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160379.mytestapp.databinding.FragmentAbouutBinding

/**
 * A simple [Fragment] subclass.
 */
class AbouutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAbouutBinding>(inflater,R.layout.fragment_abouut,container,false)
        return binding.root


    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.option_menu,menu)


    }

}
