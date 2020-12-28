package inheritance

open class mobil : kendaraan() {
    var roda:Int=0
    var mobiljenis:String=""
    fun mobil(){
        println("memiliki $roda roda jenis mobil $mobiljenis")
    }
}