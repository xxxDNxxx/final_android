package buu.informatics.s59160379.mytestapp


import android.os.Bundle
import android.util.Base64
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160379.mytestapp.databinding.FragmentP2Binding

/**
 * A simple [Fragment] subclass.
 */
class P2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentP2Binding>(inflater,R.layout.fragment_p2,container,false)
        setHasOptionsMenu(true)

        binding.encryptBtn.setOnClickListener {
            var inputdatar = binding.inputTxt.text
            if(inputdatar.isEmpty()){
                Toast.makeText(context,"Please fill the blank",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var inpuut = inputdatar.toString()

            binding.outputTxt.text = encodeData(inpuut)
        }
        binding.decryptBtn.setOnClickListener {
            var inputdatar2 = binding.inputTxt.text
            if(inputdatar2.isEmpty()){
                Toast.makeText(context,"Please fill the blank",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var inpuut2 = inputdatar2.toString()

            binding.outputTxt.text = decodeData(inpuut2)
        }

        return binding.root
    }

    private fun encodeData(inputdata:String): String{
        val encoded = Base64.encode(inputdata.toByteArray(),Base64.DEFAULT)
        return String(encoded)
    }
    private fun decodeData(inputdata:String): String{
        val decoded = Base64.decode(inputdata.toByteArray(),Base64.DEFAULT)
        return String(decoded,charset("UTF-8"))
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.option_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())
                ||super.onOptionsItemSelected(item)
    }


}
