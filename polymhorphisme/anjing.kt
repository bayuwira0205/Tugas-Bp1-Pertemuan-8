package polymhorphisme

 class anjing : intro() {
    var suka:String= ""

    fun suka(){
        println("ia sangat menyukai $suka")
    }

     override fun hewan() {
         println("jenis dari hewan tersebut adlah $jenis, yang biasa disebut $nama dan usianya sekarang $usia tahun")
     }


}