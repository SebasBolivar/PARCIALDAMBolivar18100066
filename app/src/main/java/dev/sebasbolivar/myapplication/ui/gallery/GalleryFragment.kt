package dev.sebasbolivar.myapplication.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.sebasbolivar.myapplication.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
/*
    private fun getSongs(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(
            SongModel(1, R.drawable.GlobeGuard Insurance, "GlobeGuard Insurance"))
        lstSong.add(
            SongModel(2, R.drawable.castleofglass, "SafeJourney Coverage")
        lstSong.add(
            SongModel(3, R.drawable.numb, "TravelShield Protection"))
        lstSong.add(
            SongModel(4, R.drawable.onestepcloser, "VoyageSegure"))
        lstSong.add(
            SongModel(5, R.drawable.whativedone, "WanderSure Travel Insurance"))
        return lstSong
    }
 */
}