package inheritance

open class motor : kendaraan() {
    var penumpang:Int =0
    var jenismotor:String=""
    fun motor()
    {
        println("motor $jenismotor bisa membawa $penumpang penumpang ")
    }
}