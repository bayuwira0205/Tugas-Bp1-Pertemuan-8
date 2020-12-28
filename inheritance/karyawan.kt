package inheritance

open class karyawan: Orang(){
    var nip : String = ""
    var gaji : Int = 0

    fun bekerja(){
        println("saya bekerja dengan gaji $gaji")
    }
}