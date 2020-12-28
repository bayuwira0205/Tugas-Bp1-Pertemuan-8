package polymhorphisme



class Satpam : karyawan() {

    var pos : String=""

    fun menjaga(){
        println("saya menjaga di Pos $pos")
    }

    override fun perkenalan() {
        println("siap 86 dan, saya $nama alamat saya $alamat")
    }
}