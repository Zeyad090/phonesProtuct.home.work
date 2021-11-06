package com.example.phonesprotuct.data

import com.example.phonesprotuct.R
import com.example.phonesprotuct.model.phoneProtuct

class Datasource {
    fun loadphoneProtuct() : List<phoneProtuct>{
        return listOf<phoneProtuct>(
          phoneProtuct(R.string.phoneProtuct1,R.drawable.image1),
            phoneProtuct(R.string.phoneProtuct2,R.drawable.image2),
            phoneProtuct(R.string.phoneProtuct3,R.drawable.image3),
            phoneProtuct(R.string.phoneProtuct4,R.drawable.image4),
            phoneProtuct(R.string.phoneProtuct5,R.drawable.image5),
            phoneProtuct(R.string.phoneProtuct6,R.drawable.image6),
        )
    }}