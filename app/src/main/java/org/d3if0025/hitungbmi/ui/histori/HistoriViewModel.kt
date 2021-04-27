package org.d3if0025.hitungbmi.ui.histori

import androidx.lifecycle.ViewModel
import org.d3if0025.hitungbmi.db.BmiDao

class HistoriViewModel(db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}