package com.infinitelearning.androiid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.infinitelearning.androiid.databinding.ActivityBottomNavBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavBinding
    private lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val heroList = listOf<Alat>(
            Alat (
                R.drawable.angklung,
                nameAlat = "Angklung",
                descAlat = "Alat musik yang berasal dari Jawa Barat ini dimainkan dengan cara digoyangkan"
            ),
            Alat (
                R.drawable.aramba,
                nameAlat = "Aramba",
                descAlat = "Aramba akan dimainkan bersama alat musik lain untuk menghasilkan paduan suara yang merdu."
            ),
            Alat (
                R.drawable.bonang,
                nameAlat = "Bonang",
                descAlat = " Alat musik yang dimainkan dengan cara dipukul  atau termasuk alat musik yang menghasilkan bunyi ideofon ini berasal dari daerah Jawa Timur."
            ),
            Alat (
                R.drawable.kecapi,
                nameAlat = "Kecapi",
                descAlat = "Kecapi dimainkan dengan cara dipetik untuk mengeluarkan jenis bunyi kordofon."
            ),
            Alat (
                R.drawable.kendang,
                nameAlat = "Kendang",
                descAlat = "Kendang merupakan alat musik tradisional yang sudah banyak digunakan ada pertunjukan seni dangdut, pertunjukan tari dan lain sebagainya."
            ),
            Alat (
                R.drawable.saluang,
                nameAlat = "Saluang",
                descAlat= "Saluang adalah alat musik asal Sumatera Barat yang dimainkan dengan cara ditiup."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_alat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AlatAdapter(this, heroList){
        }




    }
}