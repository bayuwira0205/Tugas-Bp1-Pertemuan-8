package polymhorphisme

open class motor : kendaraan() {
    var penumpang:Int =0
    var jenismotor:String=""
    fun motor()
    {
        println("motor $jenismotor bisa membawa $penumpang penumpang ")
    }

    override fun kendaraan() {
        println("ini adalah $jenis dengan merk $merk, warnanya $warna ")
    }
}