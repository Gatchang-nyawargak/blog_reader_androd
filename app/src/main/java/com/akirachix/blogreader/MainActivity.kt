package com.akirachix.blogreader

import BlogAdapter
import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }
    fun displayBlogs(){
        var blog1 = BlogReader("Warga","","Photography","23/2/2024","One of the distinctive aspects of Danchin-Hamard’s work is her use of color, pattern, and intricate details. Whether working with a monochromatic palette or a riot of colors, she strives to create a modern aesthetic that captivates and engages her audience","","https://thisisloremipsum.com/post/the-enchanting-world-of-cosmo-danchin-hamard")
        var blog2 = BlogReader("Anna","","Photography","23/2/2024","One of the distinctive aspects of Danchin-Hamard’s work is her use of color, pattern, and intricate details. Whether working with a monochromatic palette or a riot of colors, she strives to create a modern aesthetic that captivates and engages her audience","","https://www.google.com/search?q=sample%20blog%20website&udm=2&cs=1&hl=en&sa=X&ved=0CB8QtI8BKABqFwoTCJDc8_PZ9oYDFQAAAAAdAAAAABAH&biw=738&bih=750&dpr=1.25")
        var blog3 = BlogReader("Joy","","Butterfly","23/2/2024","One of the distinctive aspects of Danchin-Hamard’s work is her use of color, pattern, and intricate details. Whether working with a monochromatic palette or a riot of colors, she strives to create a modern aesthetic that captivates and engages her audience","","https://thisisloremipsum.com/post/the-enchanting-world-of-cosmo-danchin-hamard")
        var blog4 = BlogReader("Grace","","Sky","23/2/2024","One of the distinctive aspects of Danchin-Hamard’s work is her use of color, pattern, and intricate details. Whether working with a monochromatic palette or a riot of colors, she strives to create a modern aesthetic that captivates and engages her audience","","https://thisisloremipsum.com/post/the-enchanting-world-of-cosmo-danchin-hamard")
        var blog5 = BlogReader("Hannah","","Art","23/2/2024","One of the distinctive aspects of Danchin-Hamard’s work is her use of color, pattern, and intricate details. Whether working with a monochromatic palette or a riot of colors, she strives to create a modern aesthetic that captivates and engages her audience","","https://thisisloremipsum.com/post/the-enchanting-world-of-cosmo-danchin-hamard")
        val BlogReader = listOf(blog1,blog2,blog3,blog4,blog5)
        val blogAdapter = BlogAdapter(BlogReader)
        binding.rvBlogs.adapter = blogAdapter

    }
}