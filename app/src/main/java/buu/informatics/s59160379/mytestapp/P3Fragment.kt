package buu.informatics.s59160379.mytestapp


import android.app.Activity
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160379.mytestapp.databinding.FragmentP3Binding


/**
 * A simple [Fragment] subclass.
 */
class P3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentP3Binding>(inflater,R.layout.fragment_p3,container,false)

        setHasOptionsMenu(true)

        binding.biencryptBtn.setOnClickListener {
            val txt = binding.biinputTxt.text.toString()
            val binary = BinaryConverter.strToBinary(txt)
            binding.bioutputTxt.text = binary
        }
        binding.bidecryptBtn.setOnClickListener {
            val binary = binding.biinputTxt.text.toString()
            val txt = BinaryConverter.binaryToString(binary)
            binding.bioutputTxt.text = txt
        }

        return binding.root



    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.option_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())
                ||super.onOptionsItemSelected(item)
    }

//    private fun biencode(){
//        val txt = binding.biinputTxt.text.toString()
//        val binary = BinaryConverter.strToBinary(txt)
//        binding.bioutputTxt.text = binary
////        hideKeyboard()
//    }
//
//    private fun bidecode(){
//        val binary = binding.biinputTxt.toString()
//        val txt = BinaryConverter.binaryToString(binary)
//        binding.bioutputTxt.text = txt
////        hideKeyboard()
//    }

//    private fun hideKeyboard(){
//        val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//        var view = currentFocus
//    }



}
