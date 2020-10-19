package god.arti.app.callbackInterface

import god.arti.app.adapter.ObjAartiList

interface IAartiListInterface {

        fun onItemSelected(objAartiList: ObjAartiList)
        fun onBackButtonClick()

}