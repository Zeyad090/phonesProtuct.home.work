package com.example.phonesprotuct.data

import com.example.phonesprotuct.R
import com.example.phonesprotuct.model.phoneProtuct

object DataSource {
            val smartPhone: List<SmartPhone> = listOf(
            SmartPhone( R.drawable.iphone, R.string.Iphone_12_64GB,"4500 SR", false,5  ),
            SmartPhone(R.drawable.samsung_galaxy_z_flip, R.string.Samsung_Galaxy_Z_Flip3,"5000 SR", true,70),
            SmartPhone(R.drawable.iphone13,R.string.Iphone_13,"6000 SR",false,36  ),
            SmartPhone(R.drawable.samsung_galaxy_uitra, R.string.Samsung_Galaxy_Z_Flip3,"3500 SR",true,5 ),
            SmartPhone(R.drawable.huawei_yp,R.string.Huawei_Y6p,"2900 SR",false,29  )


            )

    }