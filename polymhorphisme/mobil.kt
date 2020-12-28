package polymhorphisme

open class mobil : kendaraan() {
    var roda:Int=0
    var mobiljenis:String=""
    fun mobil(){
        println("memiliki $roda roda jenis mobil $mobiljenis")
    }

    override fun kendaraan() {
        println("jenis kendaraan = $jenis brand kendaraan = $merk, warna = $warna ")
    }
}