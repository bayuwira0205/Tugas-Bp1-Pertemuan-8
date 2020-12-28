package polymhorphisme

open class kendaraan {
    var jenis :String=""
    var merk : String=""
    var warna : String=""

   open fun kendaraan(){
        println("jenis kendaraan $jenis brand kendaraan $merk, berwarna $warna ")
    }
}