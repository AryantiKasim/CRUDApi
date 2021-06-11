package id.ac.unhas.crudtodolist.db.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import id.ac.unhas.crudtodolist.R

class InputNoteActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_list)
        if(supportActionBar != null){
            supportActionBar?.title = "Tambahkan note"
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Back Button
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}